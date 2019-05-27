/**
 * <p>Title: ParameterTest.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: Ericsson</p>
 * @author dengjili
 * @date 2019年5月26日
 * @version 1.0
 */
package com.ericsson.junit_demo;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.ericsson.junit.demo.Calculate;

/**
 * <p>Title: ParameterTest</p>
 * <p>Description: </p>
 * <p>Company: Ericsson</p> 
 * @author    dengjili
 * @date      2019年5月26日 下午11:53:52
 */

@RunWith(Parameterized.class)
public class ParameterCalculateTest {
	private int x;
	private int y;
	private int result;

	public ParameterCalculateTest(int x, int y, int result) {
		this.x = x;
		this.y = y;
		this.result = result;
	}
	
	@Test
	public void verifyGoodZipCode() throws Exception {
		Calculate calculate = new Calculate();
		int compute = calculate.compute(x, y);
		Assert.assertEquals("f(x,y)!=x+y+1", result, compute);
	}
	
	@Parameters
	public static List<Integer[]> regExValues() {
		return Arrays.asList(new Integer[][] { { 2,2,5}, { 3,3,7 },
			{ 4,3,8 } , { 5,6,12 } });
	}
}
