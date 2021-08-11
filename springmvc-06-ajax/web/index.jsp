<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script>
      function a(){
        $.post({
          url:"${pageContext.request.contextPath}/testjquery",
          data:{'name':$("#username").val()},
          // data:{'name':$("#txtName").val()},

          sucess:function (data, status){
            console.log("data=>" + data);
            console.log("status=>" + status);
            // alert(status);
          }
        });
      }
    </script>
  </head>
  <body>
    <%--onblur：失去焦点触发事件--%>
  username:<input type="text" id="username" onblur="a()">
  </body>
</html>
