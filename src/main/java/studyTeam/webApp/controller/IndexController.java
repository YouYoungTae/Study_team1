package studyTeam.webApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController  {
	
	@RequestMapping("/index")
	public String index(Model model) {
		
		model.addAttribute("data","new Mv");
		return "index";
	}
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//
//		ModelAndView mv = new ModelAndView("index");
//		mv.addObject("data", "IndexController Hello");
//		return mv;
//		
//	}
	
	
	
}
