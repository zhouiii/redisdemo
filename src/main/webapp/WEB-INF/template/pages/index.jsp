<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="../../../redisdemo/static/jquery-1.7.1.min.js"></script>
</head>
<body>
        <input type="button" value="add-button" onclick="addTest()">
        <input type="button" value="del-button" onclick="delest()">
</body>
<script type="application/javascript">
    function addTest(){
        $.ajax({
            url:"http://localhost:8080/redisdemo/redis-add-test.do",
            type: "post",
            data:{
                "paramtest": "ceshiceshiceshi"
            },
            success:function (data) {
                console.log(data)
            }
        })
    }

    function delest(){
        $.ajax({
            url:"http://localhost:8080/redisdemo/redis-del-test.do",
            type: "post",
            data:{
                "paramtest": "122"
            },
            success:function (data) {
                console.log(data)
            }
        })
    }

</script>
</html>