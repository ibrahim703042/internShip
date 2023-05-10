<%-- 
    Document   : test
    Created on : May 4, 2023, 9:49:15 AM
    Author     : Ibrahim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%@page import="java.sql.Connection,java.sql.DriverManager,java.sql.SQLException"%>

        <%
            
        Connection connection;
        boolean checked = false;
        
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
            }catch (ClassNotFoundException e){
                System.out.println("Error:" + e);
                checked = true;
            }
        
            if(!checked){
                
                try{
                    String url = "jdbc:mysql://localhost:3306/db_impotfiscal";
                    String username = "root";
                    String password = "";

                   connection = DriverManager.getConnection( url, username, password);
                   System.out.println("Connection Success:" + connection );
                }
                catch (SQLException e){
                    System.out.println("Error:" + e);
                }
                
            }
        
        %>
    </body>
</html>
