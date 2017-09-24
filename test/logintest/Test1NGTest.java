package logintest;
//////////////////   class must locate on source classes folder ( no test folder ) ///////////////


import java.awt.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
/**
 *
 * @author python27
 */
@Listeners(TestListener1.class)
public class Test1NGTest extends Test1 {
    @Test
    public void testpass() throws Exception {
        String pass3 = Test1.TextField1;
        String pass4 = Test1.CurrentUrl1;
        //System.out.print( pass3+"33333333333333333333333333\n");
        Assert.assertEquals(pass4, pass3);
        
    }
   
    @Test
    public void testLogin() throws Exception {
        int pass3 = LoginOk22;
        
        Assert.assertEquals(1, pass3);
    }
    @Test
    public void testsearch() throws Exception {
        int pass3 = Searchok22;
        
        Assert.assertEquals(1, pass3);
    }
    
    
}
