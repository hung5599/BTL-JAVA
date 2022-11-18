
//CSS Function
function showAddBox(){
    var x = document.querySelector(".add-box")
    x.style.display ="block"
}
function closeAddBox(){
    var x = document.querySelector(".add-box")
    x.style.display ="none"
}
function closeModel(){
    var x = document.querySelector(".model")
    x.style.display ="none"
}
function openModel(){
    var x = document.querySelector(".model")
    x.style.display ="block"
}
//Fetch API
var sanAPI= 'http://localhost:3000/san'
function main(){
    getSan()
}
main()
//Function

// FETCH GET
function getSan(){
    fetch(sanAPI)
        .then(function(response){
            return response.json()
        })
        .then(function(sans){
            renderSanToTable(sans)
        })
}
// FETCH POST
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
// FETCH DELETE
function deleteSan(id,callback){
    var option =  {
        method: 'DELETE',
        headers: { 
            'Content-Type': 'application/json' 
        }
        }
    fetch(sanAPI+'/'+id,option)
        .then(function(response){
            response.json()
        })
        .then(callback)
}
//FETCH PATCH
function updateSan(data,id){
    var option={
        method: "PUT",
        headers: { 
            'Content-Type': 'application/json' 
        },
        body : JSON.stringify(data)
    }
    fetch(sanAPI+'/'+id,option)
        .then(function(response){
            return response.json()
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
        for(var j=0;j<4;j++){
            var newCell1 = row.insertCell(j)
            if(j==0) newCell1.appendChild(document.createTextNode(san.id_san))
            if(j==1) newCell1.appendChild(document.createTextNode(san.price))
            if(j==2) newCell1.appendChild(document.createTextNode(getStatus(san.status)))
            if(j==3) newCell1.innerHTML =   `
            <button class="btn" onclick="deleteSan(${san.id},saveRowData(this,${san.categoryId-1}))" ><i class="fa-solid fa-trash-can"></i> Xóa </button>
            <button class="btn" onclick="handleUpdateSan(${san.id})" ><i class="fa-solid fa-pen-to-square"></i> Chỉnh thông tin sân </button> 
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
function renderNewSanToTable(){
    var inp = document.querySelectorAll('.content .add-box .form-group input')
    var id_san = inp[0].value
    var select = document.getElementById("categoryId")
    var categoryId = parseInt(select.options[select.selectedIndex].value)
    var select2 = document.getElementById("status")
    var status = parseInt(select2.options[select2.selectedIndex].value)
    var price =inp[1].value
    if(id_san=="" ||  price=="") alert("Ban chua nhap du thong tin!")
    else{
        var tmp = {
            "id_san" : parseInt(id_san),
            "categoryId" : categoryId,
            "status" : status,
            "price" : parseInt(price)
        }
        var table = document.querySelectorAll(".manage_table .table1")
        addNewSanToTable(table,tmp)
        postSan(tmp)
    }
}
function handleUpdateSan(id){
    openModel()
    var newPrice = parseInt(document.querySelector('.model .update-form .form-group input[name="newPrice"').value)
    var select2 = document.getElementById("newStatus")
    var newStatus = parseInt(select2.options[select2.selectedIndex].value)
    san.price = newPrice
    san.status = newStatus
    var updated ={
        id_san : san.id,
        categoryId : san.categoryId,
        price : newPrice,
        status : newStatus
    }
    updateSan(id,updated)
}
function getStatus(i){
    if(i==1) return "Tốt"
    else return "Bảo trì"
}