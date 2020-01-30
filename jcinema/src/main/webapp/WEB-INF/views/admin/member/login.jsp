<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JCINEMA ADMIN 로그인</title>
    <link rel="shortcut icon" href="/jcinema/img/favicon.ico"/>
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/themes/smoothness/jquery-ui.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="/jcinema/admin/css/style.css">  
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>    
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
    <script src="/jcinema/admin/js/sideMenu.js"></script>
    <style>
        /* 관리자 > 멤버 로그인 */        
        #wrapper-admin-login {
            position: fixed;
            left: 0;
            top: 0;
            width: 100%;
            height: 100%;
            background: #eaeaea;
        }

        #wrapper-admin-login > section {
            position: absolute;
            left: 50%;
            top: 200px;
            margin-left: -151px;
            width: 302px;
            height: 270px;
            border-left: 1px solid #5972a6;
            border-right: 1px solid #5972a6;
            border-bottom: 1px solid #5972a6;            
            box-sizing: border-box;
            background: #fff url('../img/admin_bg_popup.png') repeat-x;
        }

        #wrapper-admin-login > section > img {
            position: absolute;
            left: -24px;
            top: -100px;
        }

        #wrapper-admin-login > section > h3 {
            color: #fff;
            font-weight: normal;
            font-size: 15px;
            margin: 12px;            
        }

        #wrapper-admin-login > section > div {
            margin-top: 16px;
            padding: 30px;
            box-sizing: border-box;            
        }
        #wrapper-admin-login > section label {
            display: block;    
            font-size: 12px;
            font-weight: bold;
            color: #484848;
            margin-bottom: 4px;
        }
        #wrapper-admin-login > section input {
            display: block;
            width: 100%;
            padding: 5px;
            border: 1px solid #959595;
            font-size: 12px;
            font-family: Verdana;
            background-color: #eaeaea;
            color: #333;
            margin-bottom: 16px;
            border-radius: 5px;
            box-sizing: border-box;
        }
        
        #wrapper-admin-login > section button {
            float: right;                     
            border: 1px solid #959595;
            font-size: 12px;
            font-family: "Lucida Grande", "Lucida Sans Unicode", Arial, Helvetica, Verdana, sans-serif;
            background-color: #a8b2c5;
            padding: 5px 15px;
            color: #fff;
            cursor: pointer;
        }

        #wrapper-admin-login > section p {            
            height: 30px;
            margin-left: 10px;
            margin-top: 10px;
            line-height: 30px;
            background: url('../img/admin_ico_info.png') no-repeat;
            text-indent: 30px;
            
        }

    </style>
</head>
<body>
    <div id="wrapper-admin-login">
        <section>
            <img src="../img/admin_login_logo.png" alt="">

            <h3>LOGIN</h3>
            <div>
                <label for="uid">아이디</label>
                <input type="text" name="uid" id="uid">

                <label for="pass">비밀번호</label>
                <input type="password" name="pass" id="pass">
                <button type="submit">로그인</button>                
            </div>
            <p>
                아이디와 비밀번호는 관리자에게 문의하세요.
            </p>
            
        </section>

    </div>
    
</body>
</html>