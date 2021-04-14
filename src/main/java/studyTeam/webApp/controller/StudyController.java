package studyTeam.webApp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import studyTeam.study.DAO.IstudyWeekMojoDAO;
import studyTeam.study.domain.StudyWeek;

@Controller
public class StudyController {

	
	
	@Autowired
	IstudyWeekMojoDAO dao;
	
	@RequestMapping("/team_pj/list")
	@GetMapping(path ="week/{weekNum}")
	public String getList(@PathVariable(name = "weekNum" ,required =false) Integer weekNum ,
			Model model)	{
		model.addAttribute("mainPageNm","week2/main.jsp");
		model.addAttribute("asidePageNm","week2/aside.jsp");
		return "team_pj/list";	
	}
}
