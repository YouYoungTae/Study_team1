package studyTeam.webApp.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import studyTeam.study.service.LogicServicei;

@Controller
public class IndexController  {
	
	@Autowired
	LogicServicei logicService;

	@Autowired
	@Qualifier("viewLog")
	HashMap<String,String> viewLog;
	
	
	@RequestMapping("/index")
	public String index(Model model) throws JsonProcessingException {
		
		viewLog.clear();
		logicService.checkVService();
		model.addAttribute("data","new Mv");

		ObjectMapper mapper = new ObjectMapper();
		String strLog =mapper.writeValueAsString(viewLog);
		model.addAttribute("viewLog",strLog);
		return "index";
	}

	
}
