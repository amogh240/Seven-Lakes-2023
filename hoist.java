import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class hoist {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();scan.nextLine();
        for (int test = 0;test<tc;test++){
            int numLineup = scan.nextInt();
            int k = scan.nextInt() % 1000000007;
            scan.nextLine();
            String crewMakeup = scan.nextLine();
            String crew = "";
            for (int repeat = 0;repeat<k;repeat++){
                crew+=crewMakeup;
            }
            int count = 0;
            for (int i = 2;i<=crew.length();i+=2){
                for (int x=0;x<=crew.length()-i;x++){
                    String cur= crew.substring(x,x+i);
                    String[] arr = cur.split("");
                    int sum = 0;
                    for (int y = 0;y<arr.length;y++){
                        sum += Integer.parseInt(arr[y]);
                    }
                    if (i/(sum+0.0)==2){
                        count++;
                    }
                }
            }
            out.println(count);
        }
    }
}