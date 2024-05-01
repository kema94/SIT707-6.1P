package sit707_week6;


public class LoopAndStatementUtils {

	
	// Conditional loop for Part B
	public int sum(int n) {
        int result = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result += i;
            }
        } else {
            for (int i = 1; i >= n; i--) {
                result += i;
            }
        }
        return result;
    }
	
	// Conditional statement for Part B 
	public static boolean isPositive(int num) {
		      
		if(num > 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
		
    }

}
