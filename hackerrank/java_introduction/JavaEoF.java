import java.io.*;
import java.util.*;

public JavaEoF {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan= new Scanner(System.in);
        boolean eof=false;
        int i=1;
        do{
            String s=scan.nextLine();
            System.out.println(i++ + " " + s);
            if(!scan.hasNext()) eof=true;
            
        }while(!eof);
        
        
    }
}