import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class message {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int n = scan.nextInt(); scan.nextLine();
        ArrayList<Double> answers = new ArrayList<Double>();
        for (int i = 0; i < n; i++) {
            String type = scan.nextLine();
            int seconds = scan.nextInt(); scan.nextLine();
            for (int j = 0; j < str.length(); j++) {
                if (type.charAt(j) == '#') {
                    type = type.substring(0, j - 1) + type.substring(j+1);
                    j -= 2;
                }
            }
            int correct = 0;
            int minLen = Math.min(str.length(), type.length());
            for (int j = 0; j < minLen; j++) {
                if (type.charAt(j) == str.charAt(j)) {
                    correct++;
                }
            }
            double answer = ( correct / 5.0) / (seconds / 60.0);
            answers.add(answer);
            out.println(String.format("%.2f", answer));
        }
        double highest = 0;
        for (double d : answers) {
            if (d > highest) {
                highest = d;
            }
        }
        out.println("The highest pirate words per minute is " + String.format("%.2f", highest));
    }
}