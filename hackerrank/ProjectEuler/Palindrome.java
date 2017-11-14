import java.util.*;


public class Palindrome{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer a;
        StringBuffer s;
        boolean isPalindrome;
        int ans=101101;
        int t = in.nextInt();
        int[] n= new int[t];
        for(int i = 0; i < t; i++){
            n[i] = in.nextInt();
        }
        for(int i=0; i<n.length; i++){
            for(int j=n[i]-1; j >=101101; j--){
                a=j;
                isPalindrome = false;
                s= new StringBuffer(a.toString());
                if(s.reverse().toString().equals(a.toString())){
                    for(int k =100; k < 1000; k++) {
                        if (j % k == 0) {
                            if(j / k <1000) {
                                isPalindrome = true;
                                break;
                            }
                        }
                    }
                    if(isPalindrome) {
                        ans=j;
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
        in.close();
    }
}