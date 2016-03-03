package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	// default Decorator
	@RequestMapping(value="/web/usermenu.do", method=RequestMethod.GET)
	public String usermenu(ModelMap model) {
		return "/usermenu/menu1.jsp";
	}
	
	// admin Decorator
	@RequestMapping(value="/backend/admin.do", method=RequestMethod.GET)
	public String admin(ModelMap model) {
		return "/backend/admin.jsp";
	}

	// no Decorator
	@RequestMapping(value="/main/index.do", method=RequestMethod.GET)
	public String hello(ModelMap model) {
		return "/main/index.jsp";
	}
	@RequestMapping(value="/login/login.do", method=RequestMethod.GET)
	public String printError(ModelMap model) {
		return "/login/login.jsp";
	}
	@RequestMapping(value="/popup/popup.do", method=RequestMethod.GET)
	public String popup(ModelMap model) {
		return "/popup/popup.jsp";
	}
}
