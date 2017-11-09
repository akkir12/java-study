import java.io.*;
import java.util.*;

public class JavaLoops {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.printf("%d x %d = %d\n", x , i , x*i);
        }
    }
}