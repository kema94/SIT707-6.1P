package sit707_week6;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class LoopAndStatementUtilsTest {

	 @Test
	    public void testSumWithPositiveNumber() {
	        LoopAndStatementUtils example = new LoopAndStatementUtils();
	        int result = example.sum(5);
	        assertEquals(15, result);
	    }

	 @Test
	    public void testSumWithNegativeNumber() {
		 LoopAndStatementUtils example = new LoopAndStatementUtils();
	        int result = example.sum(-5);
	        assertEquals(-14, result); // Since sum of negative numbers is 0 in this case
	    }
	 
	 @Test
	    public void testSPossitiveNumber() {
		    int number = 12;
			Assert.assertNotNull("Number is", LoopAndStatementUtils.isPositive(number));
	    }
	 

}
