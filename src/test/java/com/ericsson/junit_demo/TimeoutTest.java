/**
 * <p>Title: TimeoutTest.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: Ericsson</p>
 * @author dengjili
 * @date 2019年5月26日
 * @version 1.0
 */
package com.ericsson.junit_demo;

import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;

/**
 * <p>Title: TimeoutTest</p>
 * <p>Description: </p>
 * <p>Company: Ericsson</p> 
 * @author    dengjili
 * @date      2019年5月26日 下午11:43:48
 */
public class TimeoutTest {
	@Ignore
	@Test(timeout = 2000L)
	public void verifyFastZipCodeMatch() throws Exception {
		TimeUnit.SECONDS.sleep(3);
	}
}
