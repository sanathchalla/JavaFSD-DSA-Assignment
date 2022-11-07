package com.gl.javafsd.dsa.balancedbrackets;

public class BalancedBracketsCheckerTest {
	
	public static void main(String[] args) {
		
		test("([[{}]])");
		test("([[{}]]))");
	}
	
	static void test(String brackets) {
		
		BalancedBracketChecker checker = new BalancedBracketChecker(brackets);
		boolean result = checker.check();
		if (result) {
			System.out.println("The entered String" + brackets + "has Balanced Brackets" );
		}else {
			System.out.println("The entered String" + brackets + "do not contain Balanced Brackets");
		}
			
	}

}
