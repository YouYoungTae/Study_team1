<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="kor">
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>java Web Study YouYoungTae</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
     <meta http-equiv="Cache-Control" content="no-cache">
 <meta http-equiv="Expires" content="0"/>
    <link rel='stylesheet' type='text/css' media='screen' href='/css/main.css'>
    <script src='/js/main.js'></script>
</head>
<body style="height: 800px;">
    <header class="pstyleHeader">
        <a href="/index.html">YouYoungTae Web Study</a>
    </header>

    <jsp:include page="team_header.jsp" flush="false" />

    <div class="flexContainer">
        <jsp:include page="${asidePageNm}" flush="false" />
        <jsp:include page="${mainPageNm}" flush="false" />

    </div>
    <footer style=" height: 200px;">
    	viewLog:${viewLog}
    </footer>
</body>
</html>