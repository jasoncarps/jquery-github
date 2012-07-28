package com.jason.jquery.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/jsp")
public class SimpleController {

	@RequestMapping(value="/{page}", method=RequestMethod.GET)
	public String getPage(@PathVariable("page") String pageName) {
		return pageName;
	}
	
}
