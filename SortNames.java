import java.util.Arrays;
import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();
        
        
        String[] names = new String[numNames];
        
        
        for (int i = 0; i < numNames; i++) {
            System.out.print("Enter name #" + (i + 1) + ": ");
            names[i] = scanner.next();
        }
        Arrays.sort(names);
        System.out.println("Sorted names in ascending order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
