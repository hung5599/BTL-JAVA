const btnLogin = document.querySelector(".js-log-in"); // lất ra class của nút đăng nhập trên header để mở modal
const modalBtn = document.querySelector(".js-modal__1"); // lấy ra class để bật modal

const registerForm = document.querySelector(".js-Form-Register"); // lấy ra class để mở và đóng form đăng kí
const btnSwitchFormToFormRegister = document.querySelector(".js-switch-form-Register"); // lấy class để chuyển từ form đăng nhập sang form đăng kí

const loginForm = document.querySelector(".js-Form-logIn"); // lấy ra class để đóng mở form đăng nhập
const btnSwitchFormToFormLogins = document.querySelectorAll(".js-switch-form-LogIn"); // lấy ra class của nút chuyển từ form đăng kí về lại form đăng nhập

const btnForgotPassword = document.querySelector(".js-btn__forgot"); // lấy ra class nút quên mật khẩu để mở form quên mật khẩu
const forgotPasswordForm = document.querySelector(".js-form__forgot"); // lấy ra class của form quên mật khẩu để đóng mở form

const confirmForm = document.querySelector(".js-form__message"); // lấy class của form xác nhận để đóng mở form
const btnSendConfirm = document.querySelector(".js-btn__send-massage"); // lấy class nút xác nhận để chuyển sang form nhập mã xác nhận và đổi mật khẩu

const btnBackFormForgotPassword = document.querySelector(".js-back__forgotPassword"); // lấy class của nút trở lại trong form confirm để comeback form forgot password

const closeAll = document.querySelector(".js-modal__overlay"); // lấy ra class của lớp phủ để đóng tất cả form lại
const closeAllByButtonOfLofinForm = document.querySelector(".js-remove");
// mở modal và form đăng nhập
function showmodal() {
	modalBtn.classList.add("open");
}
btnLogin.addEventListener("click", showmodal);

// Chuyển tư form đăng nhập sang đăng kí
function switchFromLoginToFormRegister() {
	// loại bỏ class remove của form đăng kí để hiện form
	registerForm.classList.remove("remove");
	// thêm class remove vào form đăng nhập để ẩn form đăng nhập
	loginForm.classList.add("remove");
}
btnSwitchFormToFormRegister.addEventListener("click", switchFromLoginToFormRegister);

// chuyển từ form đăng kí sang form đăng nhập
function switchFromRegisterToFormLogin() {
	// thêm class remove vào form đăng kí để ẩn
	registerForm.classList.add("remove");
	// loại bỏ class remove của form đăng nhập để hiện form đăng nhập
	loginForm.classList.remove("remove");
	// thêm class remove vào form quên đăng nhập để ẩn form
	forgotPasswordForm.classList.add("remove");
}
for (const btnSwitchFormToFormLogin of btnSwitchFormToFormLogins) {
	btnSwitchFormToFormLogin.addEventListener("click", switchFromRegisterToFormLogin);
}

// mở form quên mật khẩu
function showFormForgot() {
	// thêm class remove vào form đăng nhập để ẩn form đăng nhập
	loginForm.classList.add("remove");
	// loại bỏ class remove của form quên đăng nhập để hiện form
	forgotPasswordForm.classList.remove("remove");
	// thêm class remove vào form confirm để ẩn form
	confirmForm.classList.add("remove");
}
btnForgotPassword.addEventListener("click", showFormForgot);

// mở form xác nhận mã và đổi mật khẩu
function showFormConfirm() {
	// loại bỏ class remove của form confirm để mở form
	confirmForm.classList.remove("remove");
	// thêm class remove vào form quên đăng nhập để ẩn form
	forgotPasswordForm.classList.add("remove");
}
btnSendConfirm.addEventListener("click", showFormConfirm);

// mở lại form forgot password và close form confirm
btnBackFormForgotPassword.addEventListener("click", showFormForgot);

// đóng các form khi click ra ngoài của form bất kì
function close() {
	// ẩn form đăng kí
	registerForm.classList.add("remove");
	// ẩn form xác nhận
	confirmForm.classList.add("remove");
	// ẩn form quên mật khẩu
	forgotPasswordForm.classList.add("remove");
	// hiện form đăng nhập
	loginForm.classList.remove("remove");
	// tắt modal
	modalBtn.classList.remove("open");
}
closeAll.addEventListener("click", close);
closeAllByButtonOfLofinForm.addEventListener("click", close);