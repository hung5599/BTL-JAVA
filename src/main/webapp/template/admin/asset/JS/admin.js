//Fetch API
function setOnlcik(){
    var x = document.querySelector(".btn .update")
    x.addEventListener("click",update)
}
var billAPI= 'http://localhost:8080/sportingcomplex/api-admin-match'
function main(){
    getBill()
}
main()
setOnlcik()
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
        for(var j=0;j<5;j++){
            var newCell1 = row.insertCell(j)
            if(j==0) newCell1.appendChild(document.createTextNode(bill.id_San))
            if(j==1) newCell1.appendChild(document.createTextNode(bill.userName))
            if(j==2) newCell1.appendChild(document.createTextNode(bill.time_Start))
            if(j==3) newCell1.appendChild(document.createTextNode(bill.dateOpen))
            if(j==4) newCell1.innerHTML =   `
            <button  onclick="deletedMatch(this,${bill.categoryId-1}, ${bill.id})" ><i class="fa-solid fa-trash-can"></i> </button> `
        }
    })
}
// xoa data trong database
function updatematch(id){
    var option={
        method: "DELETE",
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

// xoa tran dau
function deletedMatch(r, x, id) {
    var i = r.parentNode.parentNode.rowIndex;
    table = document.querySelectorAll(".table1");
    var result={
        "id": id
    }
    table[x].deleteRow(i)
    updatematch(result)
}

function update(){
    removeRow()
    getBill()
}

function removeRow(){
    var x = document.querySelectorAll(".table1")
    console.log(x)
    x.forEach(function(table){
        var tableRows = table.getElementsByTagName('tr');
        console.log(tableRows)
        var rowCount = tableRows.length;
        for (let i=rowCount-1; i>0; i--) {
            table.deleteRow(i);
        }
    })
}