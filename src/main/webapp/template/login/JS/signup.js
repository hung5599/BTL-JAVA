//Function setOnlcik
function setOnlcik(){
    var x = document.getElementById("check")
    x.addEventListener("click",getUsernameAndPassword)
}
setOnlcik()

function getUsernameAndPassword(){
    var check = document.getElementById("confirm")
    var btn = document.getElementById("check")
    console.log(check.Selected)
    // if(!check.checked) {
    //     alert("Bạn chưa đồng ý với các điều khoản của chúng tôi")
    //     btn.setAttribute(disabled, true)
    // }
    // else {
    //     btn.setAttribute(disabled, false)
    // }
    btn.setAttribute(disabled, true)
}