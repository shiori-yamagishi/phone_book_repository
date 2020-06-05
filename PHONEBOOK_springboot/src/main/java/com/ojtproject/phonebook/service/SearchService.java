package com.ojtproject.phonebook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojtproject.phonebook.dao.PhoneBookRepository;
import com.ojtproject.phonebook.entity.PhoneBook;

public class SearchService {

	@Autowired
    public PhoneBookRepository phoneBookRepository;

    public List<PhoneBook> findAll() {
        return phoneBookRepository.findAll();
    }

    public void delete(int id) {
        phoneBookRepository.deleteById(id);
    }

}
