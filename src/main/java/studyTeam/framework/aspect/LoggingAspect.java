package studyTeam.framework.aspect;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Aspect
@Component
@DependsOn( value= {"logicService" ,"viewLog"})
public class LoggingAspect {
	
	
	@Autowired
	@Qualifier("viewLog")
	HashMap<String,String> viewLog;
	private static Logger log = LoggerFactory.getLogger(LoggingAspect.class);
	
	/// 첫번재 와일드 카드 수정자 ///캐치 실패 , mvc 인터셉터를 활용해아 할듯 
	@Around("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
	public void reUsePoint(JoinPoint joinPoint) {
		log.info("-----------reUsePoint");
		
		String view =joinPoint.toLongString()+"/n/r" +joinPoint.getArgs() +"/n/r" + joinPoint.getTarget() +"/n/r"+ joinPoint.getThis();
		viewLog.put("reUsePoint", view);

	}
 	
 	@Before("execution(* studyTeam.study.service.LogicServicei.checkVService(..))")
	public void reUsePoint1(JoinPoint joinPoint) {
		log.info("-----------reUsePoint1");
		String view =joinPoint.toLongString()+"--Args--" +
				joinPoint.getArgs() +"--Target--" +
				joinPoint.getTarget() +"--This--"+
				joinPoint.getThis() +"--time --" +
				LocalDateTime.now().format( DateTimeFormatter.ISO_DATE_TIME);
		viewLog.put("패키지,클래스, 메소드명을 특정해서 포인트 컷설정", view);
	}
 	@Before("execution(* studyTeam.study.service.*.*VService(..))")
	public void reUsePoint2(JoinPoint joinPoint) {
		log.info("-----------reUsePoint2");
		String view =joinPoint.toLongString()+"--Args--" +
				joinPoint.getArgs() +"--Target--" +
				joinPoint.getTarget() +"--This--"+
				joinPoint.getThis() +"--time --" +
				LocalDateTime.now().format( DateTimeFormatter.ISO_DATE_TIME);
		viewLog.put("패키지와 일부 메소드명을 특정해서 포인트 컷설정", view);
	}
 	@AfterReturning(pointcut= "execution(* studyTeam.study.service.*.checkVService(..))" ,returning ="result")
	public void reUsePoint3(JoinPoint joinPoint ,Object result) {
		log.info("-----------reUsePoint3");
		String view =joinPoint.toLongString()+"--Args--" +
				joinPoint.getArgs() +"--Target--" +
				joinPoint.getTarget() +"--This--"+
				joinPoint.getThis() +"--time --" +
				LocalDateTime.now().format( DateTimeFormatter.ISO_DATE_TIME);
		viewLog.put("패키지와 메소드명을 특정해서 포인트 컷설정", view);
	}
 	
 	
 	@Around("execution(* studyTeam.study.service.LogicServicei.checkVService(..))")
 	public void mojoTran(JoinPoint joinPoint) {
		log.info("-----------mojoTran");
		
		String view =joinPoint.toLongString()+"--Args--" +
				joinPoint.getArgs() +"--Target--" +
				joinPoint.getTarget() +"--This--"+
				joinPoint.getThis() +"--time --" +
				LocalDateTime.now().format( DateTimeFormatter.ISO_DATE_TIME);
		viewLog.put(" 어라운드 구현", view);
 	}
 	
 	@AfterThrowing("execution(* studyTeam.study.service.LogicServicei.checkVService(..))")
 	public void mojoError(JoinPoint joinPoint) throws Throwable {
		log.info("-----------mojoTran");
		
		String view =joinPoint.toLongString()+"--Args--" +
				joinPoint.getArgs() +"--Target--" +
				joinPoint.getTarget() +"--This--"+
				joinPoint.getThis() +"--time --" +
				LocalDateTime.now().format( DateTimeFormatter.ISO_DATE_TIME);
		viewLog.put(" 애프터 스로링 구현", view);
 	}
}
