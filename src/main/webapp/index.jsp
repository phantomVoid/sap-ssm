<html>
<body>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    String serviceUrl = basePath + "webservice";
%>
</body>
<script type="text/javascript">
    var url = '<%=serviceUrl%>';
    $(function () {
        window.location.href=url;
    });
</script>
</html>
