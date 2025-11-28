package com.cdac.JUnitDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestString {
	@Test
	public void m1() {
		String s1 = new String("hello");
		String s2 = new String("hello");
		assertEquals(s1,s2);
	}
	

}
