package studyTeam.framework.proxy.impl;

import org.springframework.stereotype.Component;

import studyTeam.framework.proxy.IService;

@Component("viewData")
public class ViewData implements IService {
	
	IService iService;
	
	@Override
	public String viewPage() {
		System.out.println( "ViewData" +"viewPage");
		if ( iService !=null) {
			return	iService.viewPage();
		}
		return "ViewData";
		
	}

}
