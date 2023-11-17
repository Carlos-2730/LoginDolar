<%-- 
    Document   : index
    Created on : 16/11/2023, 9:59:05 p. m.
    Author     : caalh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>LoginDolar</title>
        <meta charset="UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="./csslogin.css">
    </head>
    <body>
        
        <form name="Usuario" action="ServletsDolar" method="get">
              
          <label for="usuario">Username</label>
          <input type="text" placeholder="Enter Username" name="usuario" value="">
          <!-- PASSWORD INPUT -->
          <label for="clave">Password</label>
          <input type="password" placeholder="Enter Password" name="clave" value="">
          <!-- <input class="btn-move" onclick="location.href = 'index.html';" value="Log In" > -->
          <input class="btn-move" type="submit" value="Iniciar sesion" >
          <!-- <a class="btn" href="index.html">Log In !</a><br> -->
          <a href="#">Lost your Password?</a><br>
          <a href="registro.html">Don't have An account?</a>
          
          </form>
        
    </body>
</html>
