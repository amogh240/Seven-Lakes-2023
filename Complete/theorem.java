package Complete;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class theorem {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); scan.nextLine();
        String str = "argh matey";
        for (int i = 0; i < n; i++) {
            boolean isWrong = false;
            String news = scan.nextLine().toLowerCase();
            for (int j = 0; j < news.length(); j++) {
                if (str.indexOf(news.substring(j, j +1)) == -1) {
                    isWrong = true;
                }
            }
            if (isWrong) {
                out.println("No");

            }
            else {
                out.println("Yes");
            }
                    
        }
        
    }
}