import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Multiples35 {

    static long cal(long iter, long term){
        return iter * (iter+1) * term /2;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        long a,b,c;
        long sum;
        int[] n= new int[t];
        for(int i = 0; i < t; i++){
            n[i] = in.nextInt();
        }
        for(int i = 0 ; i<n.length; i++)
        {
            a= (n[i]-1)/3;
            b= (n[i]-1)/5;
            c= (n[i]-1)/15;
            sum= cal(a,3) + cal(b,5) -cal(c,15);
            System.out.println(sum);

        }
    }
}
