import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class armada {
    public static void main(String[] args) throws IOException {
    
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt(); scan.nextLine();
       for (int i = 0; i < n; i++) {
        int cipher = scan.nextInt() % 26;
        String line = scan.nextLine().substring(1).toUpperCase();
        String res = "";
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int j = 0; j < line.length(); j++) {
            char c = line.charAt(j);
            if (Character.isLetter(c)) {
                int index = letters.indexOf(c);
                if (index + cipher >= 26) {
                    index = (index + cipher) % 26;
                    res += letters.charAt(index);
                }
                else if (index + cipher < 0) {
                    index = 26 + (index + cipher);
                    res += letters.charAt(index);
                }
                else {
                    res += letters.charAt(index + cipher);
                }
                
            }
            else {
                res += c;
            }

        
        }
        out.println(res);


       }
        
    }
}