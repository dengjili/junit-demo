/**
 * <p>Title: ExceptionTest.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: Ericsson</p>
 * @author dengjili
 * @date 2019年5月26日
 * @version 1.0
 */
package com.ericsson.junit_demo;

import java.util.List;

import org.junit.Test;

/**
 * <p>Title: ExceptionTest</p>
 * <p>Description: <p>
 * <p>Company: Ericss/on</p> 
 * @author    dengjili
 * @date      2019年5月26日 下午11:41:56
 */
public class ExceptionTest {
	@Test(expected = NullPointerException.class)
	public void verifyException() throws Exception {
		List list = null;
		list.clear();
	}
}
