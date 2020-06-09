package com.ojtproject.phonebook.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ojtproject.phonebook.entity.PhoneBook;

@Repository
public interface PhoneBookRepository extends JpaRepository<PhoneBook, Integer> {

	//void save(PhoneBook phoneBook);

	//**登録SQL*/
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO phone_book (name,phone_number,id) VALUES (:name,:phoneNumber,:Id)", nativeQuery = true)
	public void regist(String name, String phoneNumber, int Id);

	//@Query("SELECT name, phone_number FROM phone_book")
	//List<PhoneBook> findAll();

}
