package studyTeam.framework.config;

import java.lang.annotation.Annotation;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan("studyTeam.webApp.controller")
public class WebConfig implements WebMvcConfigurer{

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		//jsp 뷰설정
//		registry.jsp("/WEB-INF/jsp/", ".jsp");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix( ".jsp");
		registry.viewResolver(resolver);
		WebMvcConfigurer.super.configureViewResolvers(registry);
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// 리소스 경로 설정 
		registry.addResourceHandler("**").addResourceLocations("/static/");
		WebMvcConfigurer.super.addResourceHandlers(registry);
	}


}
