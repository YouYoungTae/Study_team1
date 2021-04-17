<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <main  >
     <section id="viewPage" class="pd_A8" style="min-width:1000px;"  >
		        <article class="toggleView active DocBody"  id="capter3"
		             style="height:80vh;  overflow:auto; padding: 10px;">
		                <h2 class="DocHeader" style="font-size:x-large;font-weight:500;padding: 10px;">Aop</h2>
		                <div style="padding-bottom: 20px;   "  >
		                    <div style="font-size:x-large; margin-top: 10px;">
		                    	AOP구현에 사용된 디자인 패턴은 프록시이다.
		                    </div>
		                     <div style="font-size:large; margin: 10px;">
		                    	프록시 패턴 클라이언트에서는 인터페이스를 호출하고 각 인터페이스 구현체들이 호출을 다른 구현체에게 넘기면서 수행하는 방식이다.
		                    	원본 구현코드를 수정하지 말고 기능을 추가하거나 흐름을 조절해야 하는 경우에 사용가능 하다. 
		                    	비슷한 패턴인 데코레이터 패턴과 비교 필요
		                     </div>
		                	 <img src="/img/aop2.PNG" alt="aop2" width="800px"> 	
		                     <script src="https://gist.github.com/YouYoungTae/658f23e0103fc8993372539ed9798709.js"></script>
		                     <div style="font-size:large; margin: 10px;">
								어노테이션 설정에 따라서 프로그램 호출결과는 달라지지만 클라이언트는 동일하게 서비스 인터페이스 매서드를 호출한다.
		                     </div>
		                </div>
		                 <div style="padding-bottom: 20px;   "  >
		                    <div style="font-size:x-large; margin-top: 10px;">
		                    	java 리플랙션에서는 다이나믹 프록시를 제공한다.
		                    </div>
		                     <div style="font-size:large; margin: 10px;">
								다이나믹 프록시는 설정된 메소드 주변에 횡단 관심사를 쉽게 삽입할수 있게 해준다.
							 	<script src="https://gist.github.com/YouYoungTae/e27459d6da46072192722b560ae15043.js"></script>
		                     </div>
		                	 
		                </div>
		            </article>
        </section>

    </main>