//set day for option
function setDay(){
    var arr= document.getElementsByName("days")
    for(var i=0;i<arr.length;i++){
        var today = new Date()
        for(var j=0;j<4;j++) {
            arr[i].options[j].textContent = today.toLocaleDateString('en-GB')
            var nextDay = new Date(today)
            nextDay.setDate(today.getDate()+1)
            today=  nextDay
        } 
    }
}
setDay()
getBtnId()
// POST DATA TO JSON
var bookingAPI = "http://localhost:8080/sportingcomplex/api-web-match"
function createBooking(data){
    var option =  {
        method: 'POST',
        headers: { 
            'Content-Type': 'application/json' 
        },
        body: JSON.stringify(data)
        }
    fetch(bookingAPI,option)
        .then(function(response){
            var response = response.json()
            response.then(
                function(value) {
                    if(value == "{}") {
                        alert("Khung giờ đã được đặt")
                    }
                    else {
                        alert("Đặt sân thành công")
                    }
                }
            )
        })
}
function getBtnId(){
    var x = document.querySelectorAll(".middle .con .book button")
    for(let i=0;i<x.length;i++){
        x[i].onclick  = function(){
            var san = document.querySelectorAll('.book h3')[i].textContent
            var price = document.querySelectorAll('.book .price span')[i].textContent
            var select1 = document.querySelectorAll('.book #times')[i]
            var time = select1.options[select1.selectedIndex].text
            var select2 = document.querySelectorAll('.book #days')[i]
            var day = select2.options[select2.selectedIndex].text
            var user = document.querySelectorAll(".con2 ul li a ")[4].text
            var Object = {
                "categoryId" : getCategoryId(san.split(" ")[0]),
                "id_San" :     parseInt(san.split(" ")[1]),
                "price" :parseInt(price),
                "userName" : user.split(", ")[1],
                "time_Start" : time,
                "dateOpen" : solve(day)
            }   
            createBooking(Object)
        }
    } 
}
function getCategoryId(x){
    if(x=="SBD") return 1;
    else if(x=="SCL") return 2;
    else return 3;
} 

function solve(day) {
    var days = day.trim().split("/");
    var res = "";
    for(var i = days.length - 1; i > 0; i--) {
        res += days[i] + "-"
    }
    res += days[0];
    return res;
}
