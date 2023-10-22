package Complete;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class pirateJimmy {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        if (scan.nextLine().equalsIgnoreCase("gold coin")){
            out.println("yes");
        }
        else{
            out.println("no");
        }    
    }
}