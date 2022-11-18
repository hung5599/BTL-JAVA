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
function deleteBill(id){
    var option =  {
        method: 'DELETE',
        headers: { 
            'Content-Type': 'application/json' 
        }
    }
    fetch(billAPI+'/'+id,option)
        .then(function(response){
            response.json()
        })
}
function renderBillToTable(bills){
    var table = document.querySelector(".manage_table .table1")
    bills.map(function(bill){
        var row = table.insertRow(1)
        for(var j=0;j<5;j++){
            var newCell1 = row.insertCell(j)
            if(j==0) newCell1.appendChild(document.createTextNode(bill.id_san))
            if(j==1) newCell1.appendChild(document.createTextNode(exchangeCategoryId(bill.categoryId)))
            if(j==2) newCell1.appendChild(document.createTextNode(bill.dateOpen))
            if(j==3) newCell1.appendChild(document.createTextNode(bill.time_start +" to " +  bill.time_end))
            if(j==4) newCell1.innerHTML =   `
            <button onclick="saveRowData(this,${bill.id})" ><i class="fa-solid fa-trash-can"></i> </button>                                       `
        }
    })
}
function saveRowData(r,id) {
    var cf = confirm("Bạn có chắc chắn muốn hủy sân ? ")
    if(cf==true){
        var i = r.parentNode.parentNode.rowIndex;
        table = document.querySelector(".table1");
        deletedMatch = table.rows.item(i)
        var result={
            "id_san" : parseInt(deletedMatch.cells[0].innerHTML),
            "user_name" : document.querySelector('.content .manage_table h3 span').innerHTML,
            "categoryId" : reExchangeCategoryId(deletedMatch.cells[1].innerHTML),
            "time" : deletedMatch.cells[3].innerHTML,
            "dateOpen" : deletedMatch.cells[2].innerHTML
        }
        table.deleteRow(i)
        deleteBill(id)
        alert("Hủy sân đấu thành công !") 
        return result;
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