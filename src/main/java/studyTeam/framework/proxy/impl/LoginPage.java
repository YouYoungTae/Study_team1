package studyTeam.framework.proxy.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import studyTeam.framework.proxy.IService;

@Component("loginPage")
public class LoginPage implements IService {
	
	@Autowired
	@Qualifier("viewData")
	IService iService;
	@Override
	public String viewPage() {
		System.out.println( "LoginPage" +"viewPage");
		if ( iService !=null) {
			return	iService.viewPage();
		}
		return "LoginPage";
	}

}
