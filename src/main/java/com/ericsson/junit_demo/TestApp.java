package com.ericsson.junit_demo;

import com.ericsson.junit.demo.Calculate;

/**
 * Hello world!
 *
 */
public class TestApp 
{
    public static void main( String[] args )
    {
    	Calculate calculate = new Calculate();
        int result = calculate.compute(100, 100);
		System.out.println(result);
    }
}
