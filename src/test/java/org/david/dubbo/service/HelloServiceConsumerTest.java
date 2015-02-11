
package org.david.dubbo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * @author david
 * @date 2015.2.10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring.xml")
public class HelloServiceConsumerTest {

    @Autowired
    private HelloServiceConsumer helloServiceConsumer;

    @Test
    public void test(){
        String res = helloServiceConsumer.helloFjx();
        System.out.println(res);
        assertEquals("Hello david",res);
    }


}
