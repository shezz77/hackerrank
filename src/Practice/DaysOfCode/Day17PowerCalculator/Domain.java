package Practice.DaysOfCode.Day17PowerCalculator;

/**
 * Created by {Shehzada} on 29-Dec-16.
 */
public class Domain {
    public static int powerCalculator(int n, int p) throws Exception{
        if (n < 0 || p < 0 ){
            throw new Exception("n or p should be no-negative");
        }else {
            return (int)Math.pow(n, p);
        }
    }
}
