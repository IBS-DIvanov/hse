package com.example.demo;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests extends Assert {

    //TODO: write connect test

    @Before
    public void testInitialize() {

    }

    @Test (timeout = 100000)
    public void contextLoads() {
    }

}

