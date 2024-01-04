import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        int tot = 0;
        for(int i = 0; i < people.length; i++) {
            tot += people[i];
        }
        
        int stIdx = 0;
        int endIdx = people.length-1;
        if(stIdx != endIdx) {
            while(stIdx < endIdx) {
                if(people[stIdx] + people[endIdx] <= limit) {
                    tot -= people[stIdx] + people[endIdx];
                    stIdx += 1;
                    endIdx -=1;
                    answer += 1;
                } else {
                    tot -= people[endIdx];
                    answer += 1;
                    endIdx -=1;
                }
            }
            if(tot > 0) {
                answer += 1;
            }
        } else {
            answer = 1;
        }
        
        return answer;
    }
}