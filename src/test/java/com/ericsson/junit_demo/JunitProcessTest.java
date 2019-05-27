/**
 * <p>Title: JunitProcessTest.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: Ericsson</p>
 * @author dengjili
 * @date 2019年5月27日
 * @version 1.0
 */
package com.ericsson.junit_demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * <p>Title: JunitProcessTest</p>
 * <p>Description: </p>
 * <p>Company: Ericsson</p> 
 * @author    dengjili
 * @date      2019年5月27日 上午12:00:09
 */
public class JunitProcessTest {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("in after class");
	}

	@Before
	public void before() {
		System.out.println("in before");
	}

	@After
	public void after() {
		System.out.println("in after");
	}

	@Test
	public void testCase1() {
		System.out.println("in test case 1");
	}

	@Test
	public void testCase2() {
		System.out.println("in test case 2");
	}

}
