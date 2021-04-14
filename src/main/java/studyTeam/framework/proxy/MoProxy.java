package studyTeam.framework.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


// 프록시 패턴과 aop의 개념을 구현해본다.
@Component
public class MoProxy  {
	
	private static Logger log = LoggerFactory.getLogger(MoProxy.class);

	@Autowired
	@Qualifier("logginSystem")
	IService iService ;
	
	
	@Autowired
	@Qualifier("viewData")
	IService iService2 ;
	
	public void patternWorsk() {
			
			//로깅부터 전부 수행
			iService.viewPage();
			// 결과만 수행
			iService2.viewPage();
	}
	

	public void proxyWork() {
		
		
//		자바 리플렉션에서 재공해주는 다이나믹 프록시 사용
		ProxyService proxyService = new ProxyService();
		
		IProxyService proxy =(IProxyService) Proxy.newProxyInstance(ProxyService.class.getClassLoader(), new Class[] {IProxyService.class},
				new InvocationHandler() {
				@Override
				public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
					LocalTime start = LocalTime.now();
					log.info("로깅...................");
					
					log.info("작업시작...................");
					
					Object ret=	method.invoke(proxyService,args);
					log.info("작업완료...................");
					
					LocalTime end = LocalTime.now();
					
					return ret;
				}
			} );
		proxy.Ilogic("대출업무");
		
		proxyService.Ilogic("예금업무");
	}
	
}
