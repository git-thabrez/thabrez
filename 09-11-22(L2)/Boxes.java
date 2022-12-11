import java.util.*;
public class Boxes {
	public static void main(String[] args) {
		
	}
	 public int[] minOperations(String boxes) {
	        int n = boxes.length();
	        int[] left = new int[n];
	        int[] right = new int[n];
	        for (int i = 1, cnt = 0; i < n; ++i) {
	            if (boxes.charAt(i - 1) == '1') {
	                ++cnt;
	            }
	            left[i] = left[i - 1] + cnt;
	        }
	        for (int i = n - 2, cnt = 0; i >= 0; --i) {
	            if (boxes.charAt(i + 1) == '1') {
	                ++cnt;
	            }
	            right[i] = right[i + 1] + cnt;
	        }
	        int[] ans = new int[n];
	        for (int i = 0; i < n; ++i) {
	            ans[i] = left[i] + right[i];
	        }
	        return ans;
	    }
	 public int[] minOperations1(String boxes) {
	        int n = boxes.length();
	        int[] ans = new int[n];
	        for (int i = 1, cnt = 0; i < n; ++i) {
	            if (boxes.charAt(i - 1) == '1') {
	                ++cnt;
	            }
	            ans[i] = ans[i - 1] + cnt;
	        }
	        for (int i = n - 2, cnt = 0, s = 0; i >= 0; --i) {
	            if (boxes.charAt(i + 1) == '1') {
	                ++cnt;
	            }
	            s += cnt;
	            ans[i] += s;
	        }
	        return ans;
	    }

}
