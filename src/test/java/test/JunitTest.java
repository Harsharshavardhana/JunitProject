package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import code.calculator;

public class JunitTest {
	@DisplayName(value = "Two Postive Test Numbers")
	@Test
	public void test1() {
		int Test1s = calculator.add(2, 5);
		Assertions.assertEquals(7, Test1s);
	}
	@DisplayName(value = "one Postive and one negative Test Numbers")
	@Test
	public void test2() {
		int Test1s = calculator.add(-3, 5);
		Assertions.assertEquals(2, Test1s);
	}
	@RepeatedTest(value = 1)
	@DisplayName(value = "Two Postive but negative result Test Numbers")
	@Test
	public void test3() {
		int Test1s = calculator.add(2, 5);
		Assertions.assertNotEquals(10, Test1s);
	}
}
