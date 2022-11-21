package jUnitTest1;

import static org.junit.Assert.*;

import org.junit.Test;

import jUnitTestPackage.jUnitFunctions;

public class testAddNumbers1 {

	@Test
	public void test() {
		jUnitFunctions1 junit = new jUnitFunctions1();
		int result=junit.addNumbers(100,200);
		assertEquals(300,result);
	}

}
