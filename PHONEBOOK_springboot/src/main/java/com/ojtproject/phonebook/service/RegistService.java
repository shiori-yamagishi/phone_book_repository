package com.ojtproject.phonebook.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojtproject.phonebook.dao.PhoneBookRepository;
import com.ojtproject.phonebook.entity.PhoneBook;

public class RegistService {

	@Autowired
	public PhoneBookRepository phoneBookRepository;

	public void insert(PhoneBook phoneBook) {
		phoneBookRepository.save(phoneBook);
	}
}
