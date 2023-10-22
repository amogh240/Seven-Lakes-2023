import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class cannon {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();scan.nextLine();
        for (int i = 0;i<tc;i++){
            int c = scan.nextInt();
            int capacity = scan.nextInt() * c;
            scan.nextLine();
            int count = 0;
            String[] arr= scan.nextLine().split(" ");
            for (int x=0;x<arr.length;x++){
                count+=Integer.parseInt(arr[x]);
            }
            int needed = capacity -count;
            int constant = 0;
            int cost = scan.nextInt();
            int bulk = scan.nextInt();
            while (needed>0){
                needed-=bulk;
                constant++;
            }
            out.println(cost*constant + " coins");
        }
    }
}