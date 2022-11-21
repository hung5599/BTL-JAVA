
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
            if(j==0) newCell1.appendChild(document.createTextNode(san.id))
            if(j==1) newCell1.appendChild(document.createTextNode(san.price))
            if(j==2) newCell1.appendChild(document.createTextNode(getStatus(san.status)))
            if(j==3) newCell1.innerHTML =   `
            <button class="btn" onclick="handleUpdateSan(${san.id}, ${san.categoryId})" ><i class="fa-solid fa-pen-to-square"></i> Chỉnh thông tin sân </button> 
                                                   `
        }
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
            "id_San" : parseInt(id),
            "categoryId" : categoryId,
            "status" : status,
            "price" : parseInt(price)
        }
        var table = document.querySelectorAll(".manage_table .table1")
        addNewSanToTable(table,tmp)
        postSan(tmp)
    }
}
function handleUpdateSan(id, categoryId){
    openModel()
    var newPrice = parseInt(document.querySelector('.model .update-form .form-group input[name="newPrice"').value)
    var select2 = document.getElementById("newStatus")
    var newStatus = parseInt(select2.options[select2.selectedIndex].value)
    var updated ={
        id_san : id,
        categoryId : categoryId,
        price : newPrice,
        status : newStatus
    }
    updateSan(id,updated)
    
}
function getStatus(i){
    if(i==1) return "Tốt"
    else return "Bảo trì"
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