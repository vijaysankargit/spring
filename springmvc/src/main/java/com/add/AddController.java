package com.add;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	Addservice addService = new Addservice();

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam int t1, @RequestParam int t2) {

		int result = addService.add(t1,t2);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("res",result);
		return mv;
	}

}


