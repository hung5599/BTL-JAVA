//DOM-CSS
function setLbColor(label){
    var labels = document.getElementsByTagName('label')
    for(var i =0;i<labels.length;i++){
        labels[i].style.color = "white"
    }
    var h1Element = document.getElementById(label)
    Object.assign(h1Element.style,{
        color:'gold',
        transition :'1s'
    })
}
// Write value of input to JSON file
var userAPI = "http://localhost:8080/sportingcomplex/api-admin-ground"
function main(){
    handleCreateUser()
}
main()
//Function
function createUser(data){
    var option =  {
        method: 'POST',
        headers: { 
            'Content-Type': 'application/json' 
        },
        body: JSON.stringify(data)
        }
    fetch(userAPI,option)
        .then(function(response){
            response.json()
        })
}

function handleCreateUser(){
    var submit = document.querySelector(".btn")
    submit.onclick = function(){
        var name = document.querySelector("input[name='name']").value
        var select = document.getElementById("gender")
        var gender = select.options[select.selectedIndex].text 
        var dob = document.querySelector("input[name='dob']").value
        var phonenumber = document.querySelector("input[name='phonenumber']").value
        var address = document.querySelector("input[name='address']").value
        if(name==""||gender==""||dob==""||phonenumber=="") alert("Missing Information!")
        else{
            var user ={
                name : name,
                gender : gender,
                dob:dob,
                phonenumber : phonenumber,
                address : address
            }
            createUser(user)
        }
    }
}