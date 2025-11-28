package com.cdac.JUnitDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestHelloWorld {

	@Test
	public void tc1() {
		HelloWorld hw = new  HelloWorld();
		assertEquals(hw.sayHelloW(), "hello world");
	}
	
	

	@Test
	public void tc2() {
		HelloWorld hw = new  HelloWorld();
		assertEquals(hw.sayHelloW(), "Hellow World");
	}
	
	@Test
	public void tc3() {
		VivekChampak vk = new VivekChampak();
		assertEquals(vk.add(4, 5));
	}
}
