package Complete;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class morale {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        scan.nextLine();
        for (int i =0;i<testCase;i++){
            String[] parts = scan.nextLine().split(" ");
            Double w = Double.parseDouble(parts[0]);
            Double c = Double.parseDouble(parts[1]);
            Double lq = Double.parseDouble(parts[2]);
            out.println(String.format("%.2f",((Math.pow(w,2))/(Math.sqrt(c)))+lq));
        }
    }
}