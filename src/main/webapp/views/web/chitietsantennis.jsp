<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp"%>

    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Chi tiết sân tennis</title>
        <!--/Front-End-BTL/img/santennis/background.jpg-->
        <style>
            body{
                overflow-x: hidden;
                background-image: url("<c:url value = '/template/web/asset/img/santennis/background.jpg'/>");
            }
        </style>
    </head>
    <body>
        <div class="middle">
            <div class="tmp"></div>
            <div class="con">
                <div class="book" name="book">
                    <div class="image">
                        <img src="<c:url value = '/template/web/asset/img/santennis/san1.jpg'/> " alt="">
                    </div>
                    <h3>STN 16</h3>
                    <div class="price">Giá thuê sân <span> 150</span>k/h </div>
                    <label for="days" >Ngày :</label>
                    <select name="days" id="days">
                    <option value="day1"></option>
                    <option value="day2"></option>
                    <option value="day3"></option>
                    <option value="day4"></option>
                    </select>
                    <label for="times" >Khung giờ :</label>
                    <select name="times" id="times">
                    <option value="time1">5am to 7am</option>
                    <option value="time2">7am to 9am</option>
                    <option value="time3">5pm to 7pm</option>
                    <option value="time4">7pm to 9pm</option>
                    </select>
                    <button id ="1" type = "button"> Dat san</button>
                </div>
                <div class="book" name="book">
                    <div class="image">
                        <img src="<c:url value = '/template/web/asset/img/santennis/san2.jpg'/> " alt="">
                    </div>
                    <h3>STN 17</h3>
                    <div class="price">Giá thuê sân <span> 150</span>k/h </div>
                    <label for="days" >Ngày :</label>
                    <select name="days" id="days">
                    <option value="day1"></option>
                    <option value="day2"></option>
                    <option value="day3"></option>
                    <option value="day4"></option>
                    </select>
                    <label for="times" >Khung giờ :</label>
                    <select name="times" id="times">
                    <option value="time1">5am to 7am</option>
                    <option value="time2">7am to 9am</option>
                    <option value="time3">5pm to 7pm</option>
                    <option value="time4">7pm to 9pm</option>
                    </select>
                    <button id ="2" type = "button"> Dat san</button>
                </div>
                <div class="book" name="book">
                    <div class="image">
                        <img src="<c:url value = '/template/web/asset/img/santennis/san3.jpg'/> " alt="">
                    </div>
                    <h3>STN 18</h3>
                    <div class="price">Giá thuê sân <span> 150</span>k/h </div>
                    <label for="days" >Ngày :</label>
                    <select name="days" id="days">
                    <option value="day1"></option>
                    <option value="day2"></option>
                    <option value="day3"></option>
                    <option value="day4"></option>
                    </select>
                    <label for="times">Khung giờ :</label>
                    <select name="times" id="times">
                    <option value="time1">5am to 7am</option>
                    <option value="time2">7am to 9am</option>
                    <option value="time3">5pm to 7pm</option>
                    <option value="time4">7pm to 9pm</option>
                    </select>
                    <button id ="3" type = "button"> Dat san</button>
                </div>
            </div>
            <div class="con">
                <div class="book" name="book">
                    <div class="image">
                        <img src="<c:url value = '/template/web/asset/img/santennis/san4.jpg'/> " alt="">
                    </div>
                    <h3>STN 19</h3>
                    <div class="price">Giá thuê sân <span> 150</span>k/h </div>
                    <label for="days" >Ngày :</label>
                    <select name="days" id="days">
                    <option value="day1"></option>
                    <option value="day2"></option>
                    <option value="day3"></option>
                    <option value="day4"></option>
                    </select>
                    <label for="times">Khung giờ :</label>
                    <select name="times" id="times">
                    <option value="time1">5am to 7am</option>
                    <option value="time2">7am to 9am</option>
                    <option value="time3">5pm to 7pm</option>
                    <option value="time4">7pm to 9pm</option>
                    </select>
                    <button id ="4" type = "button"> Dat san</button>
                </div>
                <div class="book" name="book">
                    <div class="image">
                        <img src="<c:url value = '/template/web/asset/img/santennis/san5.png'/> " alt="">
                    </div>
                    <h3>STN 20</h3>
                    <div class="price">Giá thuê sân <span> 150</span>k/h </div>
                    <label for="days" >Ngày :</label>
                    <select name="days" id="days">
                    <option value="day1"></option>
                    <option value="day2"></option>
                    <option value="day3"></option>
                    <option value="day4"></option>
                    </select>
                    <label for="times" >Khung giờ :</label>
                    <select name="times" id="times">
                    <option value="time1">5am to 7am</option>
                    <option value="time2">7am to 9am</option>
                    <option value="time3">5pm to 7pm</option>
                    <option value="time4">7pm to 9pm</option>
                    </select>
                    <button id ="5" type = "button"> Dat san</button>
                </div>
                <div class="book" name="book">
                    <div class="image">
                        <img src="<c:url value = '/template/web/asset/img/santennis/san6.jpg'/> " alt="">
                    </div>
                    <h3>STN 21</h3>
                    <div class="price">Giá thuê sân <span> 150</span>k/h </div>
                    <label for="days" >Ngày :</label>
                    <select name="days" id="days">
                    <option value="day1"></option>
                    <option value="day2"></option>
                    <option value="day3"></option>
                    <option value="day4"></option>
                    </select>
                    <label for="times">Khung giờ :</label>
                    <select name="times" id="times">
                    <option value="time1">5am to 7am</option>
                    <option value="time2">7am to 9am</option>
                    <option value="time3">5pm to 7pm</option>
                    <option value="time4">7pm to 9pm</option>
                    </select>
                    <button id ="6" type = "button"> Dat san</button>
                </div>  
            </div>
        </div>
    </body>
    </html>