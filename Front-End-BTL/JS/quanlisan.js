
//CSS Function
function showAddBox(){
    var x = document.querySelector(".add-box")
    x.style.display ="block"
}
function closeAddBox(){
    var x = document.querySelector(".add-box")
    x.style.display ="none"
}
//Fetch API
var sanAPI= 'http://localhost:3000/san'
function main(){
    getSan()
}
main()
//Function
function getSan(){
    fetch(sanAPI)
        .then(function(response){
            return response.json()
        })
        .then(function(sans){
            renderSanToTable(sans)
        })
}
function postSan(data){
    var option =  {
        method: 'POST',
        headers: { 
            'Content-Type': 'application/json' 
        },
        body: JSON.stringify(data)
        }
    fetch(sanAPI,option)
        .then(function(response){
            response.json()
        })
}
function renderSanToTable(sans){
    var table = document.querySelectorAll(".manage_table .table1")
    sans.map(function(san){
        addNewSanToTable(table,san)
    })
}
function addNewSanToTable(table,san){
    var row = table[san.categoryId-1].insertRow(1)
        for(var j=0;j<3;j++){
            var newCell1 = row.insertCell(j)
            if(j==0) newCell1.appendChild(document.createTextNode(san.id_san))
            if(j==1) newCell1.appendChild(document.createTextNode(san.price))
            if(j==2) newCell1.innerHTML =   `
            <button class="btn" onclick="saveRowData(this,${san.categoryId-1})" ><i class="fa-solid fa-trash-can"></i> Xóa </button>
            <button class="btn" onclick="showEditBox()" ><i class="fa-solid fa-pen-to-square"></i> Chỉnh sua gia thue </button> 
                                                   `
        }
}
function saveRowData(r,x) {
    var i = r.parentNode.parentNode.rowIndex;
    table = document.querySelectorAll(".table1");
    deletedMatch = table[x].rows.item(i)
    var result={
        "id_san" : parseInt(deletedMatch.cells[0].innerHTML),
        "categoryId" : x+1,
        "price" : deletedMatch.cells[1].innerHTML
    }
    table[x].deleteRow(i)
    return result;
}
function updateNewSanToTable(){
    var inp = document.querySelectorAll('.add-box .form-group input')
    var id_san = parseInt(inp[0].value)
    var select = document.getElementById("categoryId")
    var categoryId = parseInt(select.options[select.selectedIndex].value)
    var price = parseInt(inp[1].value)
    var tmp = {
        "id_san" : id_san,
        "categoryId" : categoryId,
        "price" : price
    }
    var table = document.querySelectorAll(".manage_table .table1")
    addNewSanToTable(table,tmp)
    closeAddBox()
    console.log(tmp)
    postSan(tmp)
}