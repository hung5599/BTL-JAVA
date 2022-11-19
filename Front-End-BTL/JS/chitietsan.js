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
var bookingAPI = "http://localhost:3000/Booking"
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
            response.json()
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
            var user = document.querySelectorAll(".con2 ul li a ")[3].text

            var Object = {
                "categoryId" : parseInt(getCategoryId(san.split(" ")[0])),
                "id_san" :     parseInt(san.split(" ")[1]),
                "price" :parseInt(price),
                "user_name" : user,
                "time" : time,
                "dateOpen" : day
            }   
            createBooking(Object)
            alert("Đặt sân thành công !") 
        }
    } 
    // console.log(Object)
}
function getCategoryId(x){
    if(x=="SBD") return 1;
    else if(x=="SCL") return 2;
    else return 3;
} 

