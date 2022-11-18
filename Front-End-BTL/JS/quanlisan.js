
//CSS Function

function setOnclick(){
    var x = document.querySelector(".content .add_btn")
    console.log(x)
    x.addEventListener("click",showAddBox)
    var y = document.querySelector(".close-add-btn")
    y.addEventListener("click",closeAddBox)
    var z = document.querySelector(".update-btn")
    z.addEventListener("click",renderNewSanToTable)
    var t = document.querySelector(".close-modal")
    t.onclick = closeModal

}
function showAddBox(){
    var x = document.querySelector(".add-box")
    x.style.display ="block"
}
function closeAddBox(){
    var x = document.querySelector(".add-box")
    x.style.display ="none"
}
function closeModal(){
    var x = document.querySelector(".modal")
    x.style.display ="none"
}
//Fetch API
var sanAPI= 'http://localhost:3000/san'
function main(){
    getSan()
    setOnclick()

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
        method: "PATCH",
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
//Other function
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
            <button class="btn fix-btn" onclick="handleUpdateSan(${san.id},${san.categoryId})" ><i class="fa-solid fa-pen-to-square"></i> Chỉnh thông tin sân </button> 
                                                   `
        }
}
// Luu san bi xoa va xoa san bi xoa khoi man hinh
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
// Render san moi tao ra bang
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
function handleUpdateSan(id,categoryId){
    var x = document.querySelector(".modal")
    x.style.display ="block"
    var y= document.querySelector(".modal .update-form .update")
    y.addEventListener("click",function(){
        var newPrice = parseInt(document.querySelector('.modal .update-form .form-group input[name="newPrice"]').value)
        var select2 = document.getElementById("newStatus")
        var newStatus = parseInt(select2.options[select2.selectedIndex].value)
        var updated ={
            id_san : id,
            categoryId : categoryId,
            price : newPrice,
            status : newStatus
        }
        updateSan(updated,id)
    })
}
function getStatus(i){
    if(i==1) return "Tốt"
    else return "Bảo trì"
}