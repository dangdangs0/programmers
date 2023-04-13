import java.math.BigInteger;

public class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger answer;
        BigInteger up=new BigInteger("1");
        BigInteger down=new BigInteger("1");
        BigInteger min=new BigInteger("1");
        
        for(int i=balls;i>0;i--){
            up=up.multiply(BigInteger.valueOf(i));
        }
        for(int i=share;i>0;i--){
            down=down.multiply(BigInteger.valueOf(i));
        }
        
        for(int i=balls-share;i>0;i--){
            min=min.multiply(BigInteger.valueOf(i));
        }
        
        answer=up.divide(down.multiply(min));
        return answer;
    }
}
