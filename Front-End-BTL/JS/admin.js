//Fetch API
var billAPI= 'http://localhost:3000/Bills'
function main(){
    getBill()
}
main()
//Function
function getBill(){
    fetch(billAPI)
        .then(function(response){
            return response.json()
        })
        .then(function(bills){
            renderBillToTable(bills)
        })
}
function renderBillToTable(bills){
    var table = document.querySelectorAll(".manage_table .table1")
    bills.map(function(bill){
        var row = table[bill.categoryId-1].insertRow(1)
        for(var j=0;j<6;j++){
            var newCell1 = row.insertCell(j)
            if(j==0) newCell1.appendChild(document.createTextNode(bill.id_san))
            if(j==1) newCell1.appendChild(document.createTextNode(bill.id_user))
            if(j==2) newCell1.appendChild(document.createTextNode(bill.time))
            if(j==3) newCell1.appendChild(document.createTextNode(bill.dateOpen))
            if(j==4) newCell1.appendChild(document.createTextNode(getStatus(bill.status)))
            if(j==5) newCell1.innerHTML =   `
            <button  onclick="saveRowData(this,${bill.categoryId-1})" ><i class="fa-solid fa-trash-can"></i> </button> `
        }
    })
}
function saveRowData(r,x) {
    var i = r.parentNode.parentNode.rowIndex;
    table = document.querySelectorAll(".table1");
    deletedMatch = table[x].rows.item(i)
    var result={
        "id_san" : deletedMatch.cells[0].innerHTML,
        "time_start" : deletedMatch.cells[2].innerHTML,
        "time_end" : deletedMatch.cells[3].innerHTML,
        "dateOpen" : deletedMatch.cells[4].innerHTML
    }
    table[x].deleteRow(i)
    return result;
}
function getStatus(i){
    if(i==1) return "Đã được đặt"
    else return "Đã hủy"
}