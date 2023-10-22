import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class chop {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();scan.nextLine();
        for (int i = 0;i<tc;i++){
            int count = 0;
            int len = scan.nextInt();scan.nextLine();
            String[] arr = new String[len];
            arr = scan.nextLine().split(" ");
            for (int x = 1; x<arr.length-1;x++){
                int b = Integer.parseInt(arr[x-1]);
                int cur = Integer.parseInt(arr[x]);
                int a = Integer.parseInt(arr[x+1]);
                if (cur>b && cur>a){
                    count++;
                }
            }
            out.println(count);
        }
    }
}