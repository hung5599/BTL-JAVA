var billAPI= 'http://localhost:8080/sportingcomplex/api-web-match'
var total = 0;

function main(){
    
    getBill()
}
main()
const userName = document.querySelectorAll(".con2 ul li a ")[4].text.split(", ")[1]
document.querySelector('.content .manage_table h3 span').innerHTML = userName
//Function
const  currentDay = new Date()

function getBill(){
    fetch(billAPI)
        .then(function(response){
            return response.json()
        })
        .then(function(data){
            renderBillToTable(data)
        }) 
}

function renderBillToTable(bills){
    var table = document.querySelector(".manage_table .table1")
    bills.map(function(bill){
        var dateParts = solve(bill.dateOpen).split("/");
        var dateObject = new Date(+dateParts[2], dateParts[1] - 1, +dateParts[0]);
        var x = dateObject.getTime() - currentDay.getTime()    //Check ngay da qua
        var point= Math.floor( x/(1000 * 3600 * 24));
        if(point < -1 ) updateSan(bill)
        else{
            if(bill.userName === userName){
                var row = table.insertRow(1)
                for(var j=0;j<6;j++){
                var newCell1 = row.insertCell(j)
                    if(j==0) newCell1.appendChild(document.createTextNode(bill.id_San))
                    else if(j==1) newCell1.appendChild(document.createTextNode(exchangeCategoryId(bill.categoryId)))
                    else if(j==2) newCell1.appendChild(document.createTextNode(bill.dateOpen))
                    else if(j==3) newCell1.appendChild(document.createTextNode(bill.time_Start))
                    else if(j==4) {
                        newCell1.appendChild(document.createTextNode(bill.price))
                        total += bill.price;
                    }
                    else newCell1.innerHTML =   `
                        <button onclick="saveRowData(this,${bill.id})" ><i class="fa-solid fa-trash-can"></i> </button>                                       `
                }
            }
        }
    })
    showTotal(total)
}

// Huy tran dau
function updateSan(id){
    var option={
        method: "PUT",
        credentials: 'include',
        headers: { 
            'Content-Type': 'application/json' 
        },
        body : JSON.stringify(id)
    }
    fetch(billAPI, option)
        .then(function(response){
           return response.json()
        })
}

function saveRowData(r,id) {
    var cf = confirm("Bạn có chắc chắn muốn hủy sân ? ")
    if(cf==true){
        var i = r.parentNode.parentNode.rowIndex;
        table = document.querySelector(".table1");
        deletedMatch = table.rows.item(i)
        var dateString = deletedMatch.cells[2].innerHTML ; // Oct 23
        var dateParts = solve(dateString).split("/");  
        var dateObject = new Date(+dateParts[2], dateParts[1] - 1, +dateParts[0]);
        var p = dateObject.getTime()-currentDay.getTime()
        var point= Math.ceil( p/(1000 * 3600 * 24));
        if(point>1){
            var ob = {
                "id": id
            }
            updateSan(ob)
            table.deleteRow(i)
            total -= parseFloat(deletedMatch.cells[4].innerHTML);
            showTotal(total)
            alert("Hủy sân đấu thành công !")
        }
        else alert("Bạn không thể hủy sân trong vòng 1 ngày diễn ra trận đấu")
    }
}
function exchangeCategoryId(i){
    if(i==1) return "Sân bóng đá"
    if(i==2) return "Sân cầu lông"
    return "Sân tennis"
}
function reExchangeCategoryId(i){
    if(i=="Sân bóng đá") return 1
    if(i=="Sân cầu lông") return 2
    return 3
}

function solve(day) {
    var days = day.split("-");
    var res = "";
    for(var i = days.length - 1; i > 0; i--) {
        res += days[i] + "/"
    }
    res += days[0];
    return res;
}


function showTotal(tmp) {
    var sum = document.querySelector(".total__price");
    sum.innerHTML = tmp
}