import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class ship {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); scan.nextLine();
        for (int i = 0; i < n; i++) {
        int x = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt(); scan.nextLine();
        if (x<=a)
            out.println("Plastic");
        else if (x<=b)
            out.println("Wood");
        else if (x<=c)
            out.println("Metal");
        }
    }
}