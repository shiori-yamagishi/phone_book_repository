package com.ojtproject.phonebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ojtproject.phonebook.form.SearchForm;
import com.ojtproject.phonebook.service.SearchService;

@Controller
public class PhoneBookController {

	@Autowired
	private SearchService searchService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
		return searchService(new SearchForm(), mav);
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public ModelAndView searchService(SearchForm searchForm, ModelAndView mav) {
		searchService.execute(searchForm, mav);
		return mav;

	}


}
