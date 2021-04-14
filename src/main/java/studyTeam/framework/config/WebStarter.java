package studyTeam.framework.config;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

public class WebStarter implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
		setConfiguration(servletContext);
		registerCharacterEncodingFilter(servletContext);
	}
	
	private void setConfiguration(ServletContext servletContext) {
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!_setConfiguration");
		//웹과 상없는 요소의 빈들을 등록
		AnnotationConfigWebApplicationContext  context  = new AnnotationConfigWebApplicationContext();
		context.register(AppConfig.class);
		//등록된 Context를 서블릿 리스너에 등록 
		//dispatcher 서블릿과 분리해야할 빈들을 선행처리
		servletContext.addListener( new ContextLoaderListener(context));
		
		AnnotationConfigWebApplicationContext  webContext  = new AnnotationConfigWebApplicationContext();
		webContext.register(WebConfig.class);
		
		ServletRegistration.Dynamic dispatcherServlet= servletContext.addServlet("servlet",
				new DispatcherServlet(webContext));
		
		dispatcherServlet.setLoadOnStartup(1);
		dispatcherServlet.addMapping("/");
		
	}
	
	private void registerCharacterEncodingFilter(ServletContext servletContext) {
//	    FilterRegistration.Dynamic characterEncodingFilter = servletContext.addFilter("encodingFilter", new CharacterEncodingFilter());
//	    characterEncodingFilter.setInitParameter("encoding", "UTF-8");
//	    characterEncodingFilter.setInitParameter("forceEncoding", "true");
//	    characterEncodingFilter.addMappingForServletNames(EnumSet.allOf(DispatcherType.class), true, "/*");
	}
}
