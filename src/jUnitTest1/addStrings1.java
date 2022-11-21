package jUnitTest1;

import static org.junit.Assert.*;

import org.junit.Test;

import jUnitTestPackage.jUnitFunctions;

public class addStrings1 {

	@Test
	public void test() {
		jUnitFunctions1 junit = new jUnitFunctions1();
		String result=junit.addStrings("Hello","World");
		assertEquals("HelloWorld",result);
	}

}
