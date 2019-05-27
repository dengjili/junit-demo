/**
 * <p>Title: JunitSuite.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: Ericsson</p>
 * @author dengjili
 * @date 2019年5月27日
 * @version 1.0
 */
package com.ericsson.junit_demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * <p>Title: JunitSuite</p>
 * <p>Description: </p>
 * <p>Company: Ericsson</p> 
 * @author    dengjili
 * @date      2019年5月27日 上午12:03:58
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        JunitTest1.class,
        JunitTest2.class
})

public class JunitSuite {

}
