package junits;
import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import code.StringFunctions;

import org.junit.jupiter.api.Assertions;

public class DynamicTestExample {
	
	@TestFactory
	public Collection<DynamicTest> method1() {

		return Arrays.asList(

				DynamicTest.dynamicTest("Positive Test",
						() -> Assertions.assertTrue(StringFunctions.isPalindrome("liril"))),
				DynamicTest.dynamicTest("Negative Test",
						() -> Assertions.assertFalse(StringFunctions.isPalindrome("Sanjeev"))),
				DynamicTest.dynamicTest("Negative Test",
						() -> Assertions.assertFalse(StringFunctions.isPalindrome("Sanjay")))

		);

	}


}
