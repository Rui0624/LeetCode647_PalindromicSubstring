
public class Solution {
	public int countSubstrings(String s) {
        if(s.isEmpty())
        	return 0;
        int n = s.length();
        int res = 0;
        for(int i = 0; i < n; i++){
        	for(int j = 0; i - j >= 0 && i + j < n && s.charAt(i - j) == s.charAt(i + j); j++){
        		res++;
        	}
        	
        	for(int j = 0; i - 1 - j >= 0 && i + j < n && s.charAt(i - 1 - j) == s.charAt(i + j); j++){
        		res++;
        	}
        }
        
        return res;
    }
	
	
}
