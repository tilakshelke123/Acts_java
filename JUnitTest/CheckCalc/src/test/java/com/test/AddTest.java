package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.check.Add;

public class AddTest {

	
	Add obj = new Add();
	//Adition test Cases
	@Test 
	void test() {
		int result = obj.add(20, 10);
		assertEquals(30, result , "Add Test Successfully !!!!!");
	}
	
	@Test 
	void test1() {
		int result = obj.add(20, 10);
		assertNotEquals(40, result , "not add  Test Successfully !!!!!");
	}
	
	@Test 
	void test2() {
		int result = obj.add(20, 10);
		assertTrue(result !=0 , "  Test conditition Successfully !!!!!");
	}
	
}
