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

	public String divisionTest(int[] nums) {
		if (nums[0] % 15 == 0) {
			return "FizzBuzz";
		} else if (nums[0] % 3 == 0) {
			return "Fizz";
		} else if (nums[0] % 5 == 0) {
			return "Buzz";
		}
		return divisionTest(nums);
	}

	@Test
	void testFizz() {
		int myArr[] = { 15 };
		assertEquals("FizzBuzz", divisionTest(myArr));
		myArr[0] = 3;
		assertEquals("Fizz", divisionTest(myArr));
		myArr[0] = 5;
		assertEquals("Buzz", divisionTest(myArr));
		myArr[0] = 5;
		assertEquals("Buzz", divisionTest(myArr));
	}
	}
}
