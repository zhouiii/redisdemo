<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="../../../redisdemo/static/jquery-1.7.1.min.js"></script>
</head>
<body>
        <input type="button" value="add-button" onclick="addTest()">
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

</script>
</html>