import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int vacn[]=new int[n];
        int pat[]=new int[n];
        for(int i=0;i<n;i++)
        {
            vacn[i]=s.nextInt();
        }   
        for(int i=0;i<n;i++)
        {
            pat[i]=s.nextInt();
        } 
        boolean isPos=true;
        for(int i=0;i<n;i++){
            if(vacn[i]<pat[i]){
               isPos=false;
                break;
            }
        }
        if(isPos)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
