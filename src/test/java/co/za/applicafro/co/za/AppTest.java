package co.za.applicafro.co.za;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    App[] app = new App[4];
    String [] name = {"Siya","Aya","Me","nene"};

    @Test
    public void testArray(){
        app[0] = new App();
        app[1] = new App();
        app[2] = new App();
        app[3] = new App();

        app[0].setName("siya");
        Assert.assertArrayEquals(name,app);
    }
}
