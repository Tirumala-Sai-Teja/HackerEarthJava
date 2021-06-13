//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

       */
        Scanner s = new Scanner(System.in);
        String a1 = s.nextLine();
        String a2= s.nextLine();
        int c=0;
        
        for(int i=0;i<a1.length();i++)
        {
            if(a1.charAt(i)==(a2.charAt(i))){
                c++;
            }
        }                 
        System.out.println(c);    

        
    }
}
