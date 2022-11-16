package com.programs;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmaticTest {
	ArithmeticOpration aob=new ArithmeticOpration();

	@Test
	public void addTest() {
		assertEquals(10,aob.add(5, 5));
	}
	@Test
	public void subTest() {
		assertEquals(20,aob.sub(40, 20));
	}
	@Test
	public void mulTest() {
		assertEquals(100,aob.mul(10, 10));
	}
	@Test
	public void divTest() {
		assertEquals(4,aob.div(8, 2));
	}
	@Test
	public void modTest() {
		assertEquals(100,aob.mul(10, 10));
	}

}
