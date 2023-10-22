import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class mutiny {
    static ArrayList<Pirate> pirates = new ArrayList<Pirate>();
    static int optimal = 0;
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = scan.nextInt(); scan.nextLine(); 
        int[] swords = new int[n];
        int[] attacks = new int[n];
        for (int i = 0; i < n; i++) {
            attacks[i] = scan.nextInt();
        }
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            swords[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            pirates.add(new Pirate(attacks[i], swords[i]));
        }


        solve(n-1, 0, 0, max);
        out.println(optimal);
        

    }
    static void solve(int n, int currStrength, int currSwords, int max) {
        if (n < 0 || currStrength > max) {
            return;
        }
        Pirate pirate = pirates.get(n);
        int newStrength = currStrength + pirate.attackVal;
        int newSwords = currSwords + pirate.numSwords;
        if (newStrength <= max) {
            if (newSwords > optimal) {
                optimal = newSwords;
            
            }
            solve(n-1, newStrength, newSwords, max);
        }
        solve(n-1, currStrength, currSwords, max); 
    }
    
}

class Pirate {
    int attackVal;
    int numSwords;

    public Pirate(int attackVal, int numSwords) {
        this.attackVal = attackVal;
        this.numSwords = numSwords;
    }

    public String toString() {
        return attackVal + " " + numSwords;
    }
}