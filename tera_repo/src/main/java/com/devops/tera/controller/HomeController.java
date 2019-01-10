package com.devops.tera.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 
 * @version 0.1
 * @since   2014-12-08
 */     
@Controller
public class HomeController               
{
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	     
	/**   Check Poll SCM
	 * @return 	ModelAndView	ModelAndView object
	 */
	@RequestMapping(value = "/loadHomePage", method = RequestMethod.POST)
	public ModelAndView loadHomePage() 
	{
		logger.info("In the method loadHomePage of HomeController.");//Test Commit
		return (new ModelAndView("Home"));
	}//Test commit    
}
