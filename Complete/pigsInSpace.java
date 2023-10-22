package Complete;
import static java.lang.System.*;
import java.util.*;
import java.io.*;

public class pigsInSpace {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("pigsInSpace.dat"));
        ArrayList<movie> arr = new ArrayList<movie>();
        while (scan.hasNextLine()){
            movie cur = new movie(scan.nextLine());
            arr.add(cur);
        }
        Collections.sort(arr);
        for (movie mov : arr){
            out.println(mov);
        }
        
    }
}
class movie implements Comparable<movie>{
    String name;
    public movie(String n){
        name = n;
    }
    public String reverseString(){
  /*       String newName = "";
        for (int i = name.length()-1;i>=0;i--){
            newName+=name.charAt(i)+"";
        }
        return newName;
        */
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        return sb.toString();
    }
    public int compareTo(movie other){
        return this.reverseString().compareTo(other.reverseString());
    }
    public String toString(){
        return name;
    }
}