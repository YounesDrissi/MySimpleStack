package dcll.ydri.MySampleStack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStackImlpTest {


    SampleStack sampleStack;

    @Before
    public void setUp() throws Exception {

        sampleStack = new SimpleStackImlp();
        System.out.println("je suis exécuté avant chaque test");
    }

    @Test
    public void testIsEmpty() throws Exception {
        Assert.assertEquals(true, sampleStack.isEmpty());
        sampleStack.push(new Item("testIsEmpty"));
        Assert.assertEquals(false, sampleStack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        Assert.assertEquals(sampleStack.getSize(), 0);
        sampleStack.push(new Item("testSize"));
        Assert.assertEquals(sampleStack.getSize(), 1);
    }

    @Test
    public void testPush() throws Exception {
        Item item = new Item(new Integer(8));
        Assert.assertEquals(0, sampleStack.getSize());
        sampleStack.push(item);
        Assert.assertEquals(1, sampleStack.getSize());
        Item item1 = sampleStack.peek();
        Assert.assertTrue(item1.getValue() instanceof Integer);
        Assert.assertEquals(8, item1.getValue());
        Assert.assertEquals(item.getValue(), item1.getValue());
    }

    @Test
    public void testPeek() throws Exception {
        Item item = new Item(new Integer(8));
        Assert.assertEquals(0, sampleStack.getSize());
        sampleStack.push(item);
        Assert.assertEquals(1, sampleStack.getSize());
        Item item1 = sampleStack.peek();
        Assert.assertEquals(1, sampleStack.getSize());
        Assert.assertTrue(item1.getValue() instanceof Integer);
        Assert.assertEquals(8, item1.getValue());
        Assert.assertEquals(item.getValue(), item1.getValue());
    }

    @Test
    public void testPop() throws Exception {
        Item item = new Item(new Integer(8));
        Assert.assertEquals(0, sampleStack.getSize());
        sampleStack.push(item);
        Assert.assertEquals(1, sampleStack.getSize());
        Item item1 = sampleStack.pop();
        Assert.assertEquals(0, sampleStack.getSize());
        Assert.assertTrue(item1.getValue() instanceof Integer);
        Assert.assertEquals(8, item1.getValue());
        Assert.assertEquals(item.getValue(), item1.getValue());
    }
}