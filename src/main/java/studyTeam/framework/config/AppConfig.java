package studyTeam.framework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

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


	
}
