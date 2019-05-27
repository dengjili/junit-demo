/**
 * <p>Title: CalculateTest.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: Ericsson</p>
 * @author dengjili
 * @date 2019年5月27日
 * @version 1.0
 */
package com.ericsson.junit_demo;

import org.junit.Assert;
import org.junit.Test;

import com.ericsson.junit.demo.Calculate;

/**
 * <p>Title: CalculateTest</p>
 * <p>Description: </p>
 * <p>Company: Ericsson</p> 
 * @author    dengjili
 * @date      2019年5月27日 上午12:32:05
 */
public class CalculateTest {
	@Test
	public void calculateTest() {
		Calculate calculate = new Calculate();
        int result = calculate.compute(100, 100);
        Assert.assertEquals(201, result);
	}
}
