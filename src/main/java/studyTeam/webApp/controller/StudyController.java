package studyTeam.webApp.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import studyTeam.framework.proxy.MoProxy;
import studyTeam.study.service.LogicServicei;

@Controller
public class StudyController  {

	@Autowired
	LogicServicei logicService;
	
	@Autowired
	@Qualifier("viewLog")
	HashMap<String,String> viewLog;
	
	@Autowired
	MoProxy moProxy;
	
	@RequestMapping("/team_pj/list")

	public String getList( @RequestParam(name = "page" ,required = false)  String article,
			Model model) throws JsonProcessingException	{
		viewLog.clear();
		logicService.calcVService();
		if ( article ==null || article.equals("1")) {
			model.addAttribute("mainPageNm","week2/main.jsp");
		}else if (article.equals("2")) {
			model.addAttribute("mainPageNm","week2/article2.jsp");
		}else if (article.equals("3")) {
			model.addAttribute("mainPageNm","week2/article3.jsp");
		}
		model.addAttribute("asidePageNm","week2/aside.jsp");
		
		ObjectMapper mapper = new ObjectMapper();
		String strLog =mapper.writeValueAsString(viewLog);
		model.addAttribute("viewLog",strLog);
		return "team_pj/list";	
	}
	
	@RequestMapping("/team_pj/proxy")

	public String proxy(@PathVariable(name = "weekNum" ,required =false) Integer weekNum ,
			Model model) throws JsonProcessingException	{
		viewLog.clear();
		logicService.calcVService();
		model.addAttribute("mainPageNm","week2/main.jsp");
		model.addAttribute("asidePageNm","week2/aside.jsp");
		
		
		moProxy.patternWorsk();
		moProxy.proxyWork();
		
		
		ObjectMapper mapper = new ObjectMapper();
		String strLog =mapper.writeValueAsString(viewLog);
		model.addAttribute("viewLog",strLog);
		return "team_pj/list";	
	}
	


}
