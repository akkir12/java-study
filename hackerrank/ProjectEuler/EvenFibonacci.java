import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EvenFibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        final int F1 = 1, F2 = 2;
        long f1,f2,tmp;
        long sum;
        long[] n= new long[t];
        for(int i = 0; i < t; i++){
            n[i] = in.nextLong();
        }
        for(int i = 0 ; i<n.length; i++){
            f1=F1;
            f2=F2;
            sum=F2;
            for(long j=F1; j<=n[i]; j+=f1){
                tmp = f2;
                f2 = f1 + f2;
                f1 = tmp;
                if(f2%2==0) sum+=f2;
            }
            System.out.println(sum);
        }

    }
}