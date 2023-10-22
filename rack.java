import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class rack {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int testCaseNum = scan.nextInt();
        scan.nextLine();
         for (int i = 0;i< testCaseNum;i++){
            String[] times = {scan.next(),scan.next()};
            scan.nextLine();
            String[] pm = times[0].split(":");
            int h1 = (Integer.parseInt(pm[0])) * 60;
            int m1 = Integer.parseInt(pm[1]);
            int t1 = h1+m1;
            String[] am = times[1].split(":");
            int h2 = (Integer.parseInt(am[0])) * 60 + 720;
            int m2 = (Integer.parseInt(am[1]));
            int t2 = h2+m2;
            if (t2-t1>=480){
                out.println("getting the ZZZs");
            }
            else {
                out.println("gonna take a nap");
            }
        }
        scan.close();
    }
    
    
}