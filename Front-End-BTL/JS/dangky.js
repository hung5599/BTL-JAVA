var accAPI = 'http://localhost:3000/accounts'
//Function
function postData(data){
    var option =  {
        method: 'POST',
        headers: { 
            'Content-Type': 'application/json' 
        },
        body: JSON.stringify(data)
        }
    fetch(accAPI,option)
        .then(function(response){
            return response.json()
        })
}
function getUsernameAndPassword(){
    var x = document.querySelectorAll(".container .panel-primary .form-group .form-control")
    var user_name = x[0].value
    var password1 = x[1].value.toString()
    var password2 = x[2].value.toString()
    if(password1!=password2) alert("Mật khẩu xác nhận không trùng khớp")
    else{
        var Object ={
            "user_name" : user_name,
            "password" : password1
        }
        postData(Object)
    }
}