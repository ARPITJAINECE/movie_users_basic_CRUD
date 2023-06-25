package com.app.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.entities.Users;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class UsersRepositoryTest {
	@Autowired
	private UsersRepository userRepo;

	@Test
	void testSaveAllUsers() {
		List<Users> list1 = List.of(/*
									 * new Users("john", "dere", "john@dere.com"), new Users("naina", "sharma",
									 * "naina279@gmail.com"),
									 *//* new Users("abc", "def", "abcdef@gmail.com") */
				new Users("ruchi", "jain", "ruchi@jain.com"));
		List<Users> allList = userRepo.saveAll(list1);
		assertEquals(1, allList.size());
	}

}
