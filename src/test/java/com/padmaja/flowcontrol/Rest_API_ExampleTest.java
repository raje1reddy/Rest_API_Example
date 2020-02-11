package com.padmaja.flowcontrol;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class Rest_API_ExampleTest {

        private Rest_API_Example restAPIExample;
        @BeforeClass
        public static void setUpClass()
        {
            System.out.println("set up class");
            // ForLoopExample forLoopExample = new ForLoopExample();
        }
        @Before
        public void setUp(){
            restAPIExample = new Rest_API_Example();
        }

        @After
        public void tearDown(){
            System.out.println("tear down");
            restAPIExample = null;
        }
        @Test
        public void whileLoopExamplenum9table() {
            int result = restAPIExample.tablesExample(9,false);
            System.out.println(result);
            int expectedresult = 6;
            assertEquals(expectedresult,result);
        }
        @Test
        public void WhileLoopExample2num9() {
            Rest_API_Example restAPIExample = new Rest_API_Example();
            int result = restAPIExample.whileLoopExample2(9,true);
            System.out.println(result);
            int expectedresult = 6;
            assertEquals(expectedresult,result);
        }

    @Test
    public void whileLoopExample_num99_true() {
        int result = restAPIExample.tablesExample(99,true);
        System.out.println(result);
        int expectedresult = 98;
        assertEquals(expectedresult,result);
    }


    @Test
    public void WhileLoopExample4_num0_false() {
        Rest_API_Example restAPIExample = new Rest_API_Example();
        int result = restAPIExample.whileLoopExample2(0,false);
        System.out.println(result);
        int expectedresult = -1;
        assertEquals(expectedresult,result);
    }
    @Test
    public void whileLoopExample5_num999_true() {
        int result = restAPIExample.tablesExample(999,true);
        System.out.println(result);
        int expectedresult = 998;
        assertEquals(expectedresult,result);
    }

    @Test
    public void whileLoopExample5_num9999_true() {
        int result = restAPIExample.whileLoopExample2(9999,true);
        System.out.println(result);
        int expectedresult = 9995;
        assertEquals(expectedresult,result);
    }
    @Test
    public void whileLoopExample6_num0_false() {
        int result = restAPIExample.tablesExample(0,false);
        System.out.println(result);
        int expectedresult = -1;
        assertEquals(expectedresult,result);
    }

    @Test
    public void whileLoopExample7_numnegative_true() {
        int result = restAPIExample.tablesExample(-9,true);
        System.out.println(result);
        int expectedresult = -10;
        assertEquals(expectedresult,result);
    }

    @Test
    public void whileLoopExample8_numinvalid_false() {
        int result = restAPIExample.tablesExample(-99999999,false);
        System.out.println(result);
        int expectedresult = -100000006;
        assertEquals(expectedresult,result);
    }

    @Test
    public void whileLoopExample6_num00_false() {
        int result = restAPIExample.whileLoopExample2(0,true);
        System.out.println(result);
        int expectedresult = -1;
        assertEquals(expectedresult,result);
    }
    @Test
    public void whileLoopExample8_numinvalid1_false() {
        int result = restAPIExample.whileLoopExample2(-99999999,false);
        System.out.println(result);
        int expectedresult = -100000000;
        assertEquals(expectedresult,result);
    }


    @Test
    public void whileLoopExample7_numnegative1_true() {
        int result = restAPIExample.whileLoopExample2(-9,false);
        System.out.println(result);
        int expectedresult = -10;
        assertEquals(expectedresult,result);
    }

}



