package studyTeam.webApp.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import studyTeam.study.domain.StudyWeek;
import studyTeam.study.service.LogicServicei;
import studyTeam.study.service.LogicService;

@Controller
public class StudyController  {

	@Autowired
	LogicServicei logicService;
	
	@Autowired
	@Qualifier("viewLog")
	HashMap<String,String> viewLog;
	
	@RequestMapping("/team_pj/list")
	@GetMapping(path ="week/{weekNum}")
	public String getList(@PathVariable(name = "weekNum" ,required =false) Integer weekNum ,
			Model model) throws JsonProcessingException	{
		logicService.calcVService();
		model.addAttribute("mainPageNm","week2/main.jsp");
		model.addAttribute("asidePageNm","week2/aside.jsp");
		
		ObjectMapper mapper = new ObjectMapper();
		String strLog =mapper.writeValueAsString(viewLog);
		model.addAttribute("viewLog",strLog);
		return "team_pj/list";	
	}


}
