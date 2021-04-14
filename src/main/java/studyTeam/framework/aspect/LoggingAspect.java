package studyTeam.framework.aspect;

import org.apache.juli.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	private Logger log = LoggerFactory.getLogger(LoggingAspect.class);
	
	/// 첫번재 와일드 카드 수정자
	@Before("execution(* *.*(..))")
	public void beforeLog(JoinPoint joinPoint) {
		
		log.info("class");
		     joinPoint.getClass()
		log.info("logging__filter");
	}
}
