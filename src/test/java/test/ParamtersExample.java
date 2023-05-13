package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import code.StringFunctions;

public class ParamtersExample {
	
	@ParameterizedTest
	@ValueSource(strings= {"madam","dad","radar"})
	public void test1(String value) {
		
		Assertions.assertTrue(StringFunctions.isPalindrome(value));
	}

}
