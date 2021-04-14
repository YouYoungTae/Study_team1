package studyTeam.framework.config;

import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;

import studyTeam.study.domain.StudyWeek;

@Configuration
@ComponentScan(
		basePackages="studyTeam"
		,excludeFilters = { 
				@ComponentScan.Filter( type=FilterType.ANNOTATION ,
				classes = {org.springframework.stereotype.Controller.class})
		}
)
@EnableAspectJAutoProxy
public class AppConfig  {
	
	@Bean("study1")
	public StudyWeek study1() {
		return new StudyWeek();
	}
	
	@Bean("viewLog")
	public HashMap<String,String>  viewLog() {
		return new HashMap<String,String>();
	}
}
