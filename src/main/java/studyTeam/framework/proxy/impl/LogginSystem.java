package studyTeam.framework.proxy.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import studyTeam.framework.proxy.IService;

@Component("logginSystem")
public class LogginSystem implements IService {
	
	
	
	@Autowired
	@Qualifier("loginPage")
	IService iService;
	@Override
	public String viewPage() {
		System.out.println( "LogginSystem_" +"viewPage");
		if ( iService !=null) {
			return	iService.viewPage();
		}
		
		return "LogginSystem";
	}

}
