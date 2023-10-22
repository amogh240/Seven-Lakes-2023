import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class polly {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); scan.nextLine();
        for (int x = 0; x < n; x++) {
            String line = scan.nextLine();
            for (int i = 1; i <= line.length(); i++) {
                String curr = line.substring(0, i);
                String res = "";
                int len = curr.length();
                int times = line.length() / len;
                for (int j = 0; j < times; j++) {
                    res += curr;
                }
                if (line.equals(res)) {
                    out.println(curr);
                    break;
                }
            }
        }

    }
}