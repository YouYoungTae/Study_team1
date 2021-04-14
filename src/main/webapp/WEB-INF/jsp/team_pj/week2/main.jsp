<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <main  >
        <section id="viewPage" class="pd_A8" style="min-width:1000px;"  >
            <article class="toggleView active DocBody"  id="capter1"
             style="height:80vh;  overflow:auto; padding: 10px;">
                <h2 class="DocHeader" style="font-size:x-large;font-weight:500;padding: 10px;">Aop</h2>
                <div style="padding-bottom: 20px;   "  >
                    <div style="font-size:x-large; margin-top: 10px;">
                    	
                        <span>Aop</span>(Aspect Oriented Programming ) 관점 지향 프로그래밍 
                        
                    </div>
                     <div style="font-size:large; margin: 10px;">
                    	프로그램 업무로직별로 있는 공통의 관심사(횡단)를 지향하여 처리하는 프로그래밍
                    	
                     </div>
                     <img src="/img/aop1.PNG" alt="aop1" width="800px">
                </div>
            </article>
            
            
            <article class="toggleView active DocBody"  id="capter2"
             style="height:80vh;  overflow:auto; padding: 10px;">
                <h2 class="DocHeader" style="font-size:x-large;font-weight:500;padding: 10px;">Aop</h2>
                <div style="padding-bottom: 20px;   "  >
                    <div style="font-size:x-large; margin-top: 10px;">
                    	스프링 프레임워크에서 Aop핵심 개념
                    </div>
                     <div style="font-size:large; margin: 10px;">
                    	<ul>
                    		<li style="margin: 10px;">Aspect :Aop의 단위(로깅,트랜잭션,로그인....)가 되는 횡단관심사</li>
                    		<li style="margin: 10px;">join Point:횡단 관심사가 실행될 지점 </li>
                    		<li style="margin: 10px;">Advice : 횡단 관심사 처리 로직</li>
                    		<li style="margin: 10px;">point cut:조인 포인트를 특정하기 위한 표현식 </li>
                    		<li style="margin: 10px;">weaving : join Point와 Advie를 결합하는 방식 </li>
                    	</ul>
                     </div>
                    <div style="font-size:x-large; margin-top: 10px;">
                    	스프링 에서의 어노테이션을 활용해서 컨트롤로, 서비스에 동작하는 모조 Aop를 구현한다.
                    </div>
                    <ul>
                    	<li style="margin: 5px;">web.xml의 설정을 대체</li>
                    	<li style="margin: 5px;"><script src="https://gist.github.com/YouYoungTae/b7b6d77f5c6a32929f9faf62f12f8364.js"></script></li>
                    	
                    	<li style="margin: 5px;">org.springframework.web.context.ContextLoaderListener의 설정을 대체
                    	<p>Aop설정을 위한 시작점으로 @EnableAspectJAutoProxy 설정을하면   @Aspect 애노테이션이 있는 애스팩트를 스프링이 런타임시 조합하여(weaving) 구현한다. </p>
                    	</li>
                    	
                    	<li style="margin: 5px;"><script src="https://gist.github.com/YouYoungTae/835e623d931074ddbeecc5821e71c14c.js"></script></li>
                    	<li style="margin: 5px;">
                    		구현된 Aspect 클래스위에 @Aspect@Component 애노테이션으로 달아서 스프링Aop에서 처리할수 있게 한다.
                    		스프링에서 지원되는 @Before,@AfterReturning,@Around,@AfterThrowing 포인트컷을 어드바이스결합하여 처리하였다.
                    		수행결과는 콘솔로그와 화면 하단에 viewLog에서 확인할수 있게 하였다.
                    	</li>
                    	<li style="margin: 5px;"><script src="https://gist.github.com/YouYoungTae/31fbd170fc327d7f372709387a389c78.js"></script></li>
                    	<li style="margin: 5px;">
							Index,Study Controller 2개를 구현해서 포인트 컷에 따라서 어드바이스가 의도된 대로 동작하는지 확인해보았다.
                    	</li>
                    	<li style="margin: 5px;"><script src="https://gist.github.com/YouYoungTae/b7b8043b42d2b2b157dda357e63dd282.js"></script></li>                    	
                    	
                    	<li style="margin: 5px;">DispatcherServlet의 설정을 대체</li>
                    	<li style="margin: 5px;"><script src="https://gist.github.com/YouYoungTae/032e17741d864bf46e68d8ad1d1947d6.js"></script></li>                    	
                    </ul>
                </div>
            </article>
        
        
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