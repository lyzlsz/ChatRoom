package test.Cilent;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* cilent Tester. 
* 
* @author <Authors name> 
* @since <pre>08/22/2019</pre> 
* @version 1.0 
*/ 
public class cilentTest {


    /**
     * 在每个方法执行前执行
     * @throws Exception
     */
    @Before
public void before() throws Exception {

}

    /**
     * 在每个方法执行后执行
     * @throws Exception
     */
    @After
public void after() throws Exception { 
} 

/** 
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception { 
//TODO: Test goes here...
   // int port =
    int result = 1+1;
    Assert.assertTrue(result==3);
} 


} 
