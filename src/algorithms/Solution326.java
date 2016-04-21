package algorithms;

public class Solution326 {
	public boolean isPowerOfThree(int n) {
        double rslt=Math.log10((double)n)/Math.log10(3.0);
        return rslt==(int)rslt?true:false;
    }
}
