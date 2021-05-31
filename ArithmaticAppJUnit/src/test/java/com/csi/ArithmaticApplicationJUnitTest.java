package com.csi;

import org.junit.Test;

import junit.framework.Assert;

public class ArithmaticApplicationJUnitTest {
	ArithmaticApplicationJUnit s1 = new ArithmaticApplicationJUnit();

	@Test
	public void addTest() {
		Assert.assertEquals(9, s1.add(4, 5));
	}

	@Test
	public void subTest() {
		Assert.assertEquals(5, s1.sub(9, 4));
	}

	@Test
	public void multiTest() {
		Assert.assertEquals(20, s1.multi(4, 5));
	}


}
