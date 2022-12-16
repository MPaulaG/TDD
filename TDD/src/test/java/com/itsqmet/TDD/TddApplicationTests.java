package com.itsqmet.TDD;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddApplicationTests {

	// @Test
	void contextLoads() {
	}

	// 3. pintar en verde y refactoring
	public int addNum(int num1, int num2) {
		// int result= num1+ num2;
		return num1 + num2;
	}

	// @Test
	void testSum() {
		assertEquals(5, addNum(3, 2));
	}

	public String checkNum(int[] numbers) {
		if (numbers[0]%3==0) {
		return "Fizz";
	}else if (numbers[0]%5==0) {
		return "Buzz";
	}
	return null;

	}

	@Test
	void testFizz() {
		int myArr [] = {3};
		assertEquals("Fizz", checkNum(myArr));
		myArr[0]=5;
		assertEquals("Buzz", checkNum(myArr));
		myArr[0]=15;
		assertEquals("Buzz", checkNum(myArr));

	}
}
	


