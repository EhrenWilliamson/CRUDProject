package com.sushi.myapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import data.Sushi;
import data.SushiDAO;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private SushiDAO sushiDAO;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
//		return "home";
//	}
	
	@RequestMapping(value="/", 
			method=RequestMethod.GET)
	public String initialLoad(Model model) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return "home";
	}
	@RequestMapping(value="home.do", 
			method=RequestMethod.GET)
	public String goHome(Model model) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return "home";
	}
	@RequestMapping(value="seeSushi.do", 
			method=RequestMethod.GET)
	public ModelAndView seeSushi() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("seeList");
		mv.addObject("sushi", sushiDAO.getSushi());
		return mv;
	}
	@RequestMapping(value="addSushi.do", 
			method=RequestMethod.GET)
	public ModelAndView goToAddSushiPage(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addSushi");
		return mv;
	}
	@RequestMapping(value="seeSushi.do", 
			method=RequestMethod.POST)
	public ModelAndView addSushiToList(Sushi sushi) {
		sushiDAO.addSushi(sushi);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("seeList");
		mv.addObject("sushi", sushiDAO.getSushi());
		return mv;
	}
	
	@RequestMapping(value="removeSushi.do")
	public ModelAndView RemoveSushiFromList(Sushi sushi) {
		System.out.println(sushi);
		sushiDAO.removeSushi(sushi);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("seeList");
		mv.addObject("sushi", sushiDAO.getSushi());
		return mv;
	}
	@RequestMapping(value="editSushiForm.do")
	public ModelAndView goToEditForm(Sushi sushi) {
		System.out.println(sushi);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("editSushi");
		mv.addObject("Sushi", sushi);
		return mv;
	}
	@RequestMapping(value="editSushi.do")
	public ModelAndView editSushiInList(Sushi sushi) {
		sushiDAO.editSushi(sushi);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("seeList");
		mv.addObject("sushi", sushiDAO.getSushi());
		return mv;
	}
}
