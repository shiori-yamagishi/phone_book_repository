package com.ojtproject.phonebook.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ojtproject.phonebook.entity.PhoneBook;
import com.ojtproject.phonebook.form.SearchForm;
import com.ojtproject.phonebook.service.RegistService;
import com.ojtproject.phonebook.service.SearchService;

public class PhoneBookController {

	@Autowired
	SearchService searchService;
	RegistService registService;
	//UpdateService updateService;

	@GetMapping
	String list(Model model) {

		//List<PhoneBook> phoneBook = searchService.findAll();
		//model.addAttribute("phonebook", phoneBook);
		return "list";
	}

	@GetMapping("create")

	String create(@ModelAttribute SearchForm searchForm) {
		return "create";
	}

	@PostMapping("create")
	String regist(@ModelAttribute SearchForm searchForm) {
		PhoneBook phoneBook = new PhoneBook();

		BeanUtils.copyProperties(searchForm, phoneBook);


		//customerService.insert(phoneBook));

		return "redirect:/";
	}

}
