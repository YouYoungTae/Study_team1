
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="kor">
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>java Web Study YouYoungTae</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='/css/main.css'>
    <script src='/js/main.js'></script>
</head>
<body style="height: 800px;">
    <header class="pstyleHeader">
        <a href="/index.html">YouYoungTae Web Study</a>
    </header>
    <nav class="pstyleNav ">
        <ul class="inLineItem ">
            <li>
                <a href="/http_pg1.html">Http완벽가이드</a>
            </li>
            <li>
                <a href="/html.mht">실전Db모델링과Sql</a>
            </li>
            <li>
                <a href="/index.html"> Code Complete2</a>
            </li>
            <li>
                <a href="/index.html">Algorithms</a>
            </li>
            <li>
                <a href="/index.html">선형대수</a>
            </li>
            <li>
                <a href="/index.html">수학 리부트</a>
            </li>
            <li>
                <a href="/index.html">자바스크립트는 모든곳에 존재한다.</a>
            </li>
            <li>
                <a href="/team_pj/list">자바 백엔스 스터디 팀</a>
            </li>
        </ul>
    </nav>
    <div class="flexContainer">

    <aside  class="pStyleAside"
            id="viewPageSelector"
           >
        <ul >
            <li ><span class="toggleView"> <a href="/http_pg1.html">http 개관</a></span></li>
            <li ><span class="toggleView"> <a href="/http_pg2.html">Url과 리소스</a></span></li>
            <li ><span class="toggleView"> <a href="/http_pg3.html">....</a></span></li>
        </ul>`
    </aside>
    <main class="pMainFrame" >
        <section id="viewPage" class="pd_A8"   >
            <article class="toggleView active" style="height:90vh; padding:10px;overflow:auto;">
                <h2>http 개관</h2>
                <div style="padding-bottom: 20px;   "  >
                    <img src="/img/http_p1.png" alt="page1">
                    <div>
                        <ul>
                            <li>
                                <pre>    
                                    -요청 메시지 시작줄(#1):GET /TEST/index.html HTTP/1.0
                                </pre>
                            </li>
                            <li>
                                <pre>
                                    -요청 메시지 헤더(#2)
                                    Accept: text/* 
                                    Accept-Language: kr 
    
                                </pre>
                            </li>
                            <li>
                                <pre>
                                    -응답 메시지 시작줄(#3) HTTP/1.0 200 OK
                                </pre>
                            </li>
                            <li>
                                <pre>
                                    -응답 메시지 헤더(#4) 
                                    Content-type:text/plain 
                                    Content-length:19  
    
                                </pre>
                            </li>
                            <li>
                                <pre>
                                    -응답 메시지 본문(#5) 
                                    응답 데이터 평문이 아닌 데이터 포함 가능
                                    
                                </pre>
                            </li>
                        </ul>
                    </div>
                    <p>telentTestingResult</p>
                    <img src="/img/page1_test_1.PNG" alt="page1_test1">
                </div>
            </article>
        </section>
    </main>
    </div>
    <footer></footer>
</body>
</html>