<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>
    <!DOCTYPE html>
    <html lang="en">

    <body>
        <div class="content">
            <div class="manage_table football_table">
                <div class="method">
                    <h2>Sân bóng đá</h2>
                </div>
                <table class="table1">
                    <tr>
                        <th>Sân</th>
                        <th>Giá thuê</th>
                        <th>Trạng thái sân</th>
                        <th>Tác vụ</th>
                    </tr>
                </table>
            </div>
            <div class="manage_table badminton_table">
                <div class="method">
                    <h2>Sân cầu lông </h2>
                </div>
                <table class="table1">
                    <tr>
                        <th>Sân</th>
                        <th>Giá thuê</th>
                        <th>Trạng thái sân</th>
                        <th>Tác vụ</th>
                    </tr>
                </table>
            </div>
            <div class="manage_table tennis_table">
                <div class="method">
                    <h2>Sân tennis</h2>
                </div>
                <table class="table1">
                    <tr>
                        <th>Sân</th>
                        <th>Giá thuê</th>
                        <th>Trạng thái sân</th>
                        <th>Tác vụ</th>
                    </tr>
                </table>
            </div>
            <button class="add_btn " onclick="showAddBox()"><i class="fa-regular fa-square-plus"></i>Thêm sân </button>
        <div class="model ">
            <form class="update-form">
                <div class="close"> 
                    <button class="close-btn" onclick="closeModel()"><i class="fa-solid fa-square-xmark js-X"></i></button>
                </div>
                <h1>Chỉnh sửa thông tin sân</h1>
                <div class="form-group">
                    <label for="newPrice">Giá sân : </label>
                    <input type="text" name="newPrice" required>
                </div>
                <div class="form-group">
                    <label for="newStatus"> Loại sân : </label>
                    <select name="newStatus" id="newStatus" >
                        <option value="1">Tốt</option>
                        <option value="0">Bảo trì </option>
                    </select>
                </div>
                <button class="update">Cập nhật</button>
            </form>
        </div>
    </body>
    </html>