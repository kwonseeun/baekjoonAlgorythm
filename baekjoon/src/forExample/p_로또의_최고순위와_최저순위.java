package forExample;

public class p_로또의_최고순위와_최저순위 {
	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0}; // 당첨가능한 최고순위, 최저순위
        int cntNum =0; // 0 제외 당첨번호개수
        int cnt0 = 0; // 0 개수

        for(int i: win_nums){
            for(int j=0;j<lottos.length;j++){
                if(i==lottos[j]) {cntNum++; break;}
            }
        }
        for(int i : lottos){
                if(i==0) cnt0++;
            }  
        
        answer[0] = 7-(cntNum+cnt0);
        answer[1] = (cntNum==0)? 6: 7-cntNum;
        
        return answer;
    }
}
