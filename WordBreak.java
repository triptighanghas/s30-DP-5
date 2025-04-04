//TC: O(n^3), where n is string's length
//SC: O(s.length()+wordDict.size())
//approach: DP

import java.util.HashSet;
import java.util.List;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length()+1];
        dp[0] =true;
        for(int i=1;i<=s.length();i++){
            for (int j=0;j<i;j++){
                if(dp[j]){
                    if(set.contains(s.substring(j,i))){
                        dp[i] = true;
                        break;
                    }
                }
            }
        }
        return dp[s.length()];
    }
}
