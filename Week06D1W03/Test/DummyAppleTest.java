import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Viktor on 2016.11.21..
 */


public class DummyAppleTest {
    @Test
    public void getApple() throws Exception {
        DummyApple oneapple=new DummyApple();
        assertEquals("Apple",oneapple.getApple());
        //assertEquals("Apple2",oneapple.getApple());
    }

    @Test
    public void getSum() throws Exception {
        DummyApple oneapple=new DummyApple();
        ArrayList<Integer> testlist=new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            testlist.add(i*2);
        }
        assertEquals(90,oneapple.getSum(testlist));
    }

    @Test
    public void getSumWithEmptyList() throws Exception {
        DummyApple oneapple=new DummyApple();
        ArrayList<Integer> testlist=new ArrayList<Integer>();
        assertEquals(0,oneapple.getSum(testlist));
    }

    @Test
    public void getSumWithNullList() throws Exception {
        DummyApple oneapple=new DummyApple();
        ArrayList<Integer> testlist=null;
        assertEquals(0,oneapple.getSum(testlist));
    }

    @Test
    public void getSumWithOneElement() throws Exception {
        DummyApple oneapple=new DummyApple();
        ArrayList<Integer> testlist=new ArrayList<Integer>();

            testlist.add(10);

        assertEquals(10,oneapple.getSum(testlist));
    }


    @Test
    public void fibonacciTestWithZero() throws Exception {
        DummyApple oneapple=new DummyApple();
       assertEquals(0,oneapple.fibonacci(0));
    }

    @Test
    public void fibonacciTestWithNegative() throws Exception {
        DummyApple oneapple=new DummyApple();
        assertEquals(-10,oneapple.fibonacci(-10));
    }

}