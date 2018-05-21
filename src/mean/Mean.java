package mean;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Mean {

	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        double mean = 0;
        double sum = 0;
        
        // Getting the set(or the array) size from the user = n
        System.out.println("Enter the set size: ");
        try{
           scanner = new Scanner(System.in);
           n = scanner.nextInt();
           
           if(n > 1){ 
            
            final Set<Double> set = new HashSet<>(n);
            // Adding elements to the SET
            for(int i = 1; i <= n ;i++){
                System.out.println("Please enter number #" + (i) + "\":\"");

                set.add(scanner.nextDouble());
            }
            
            // Additional process to the elements of the SET
            for(double s : set){
                sum += s;
            }
            
            // Getting and printing the final result of the mean value
            mean = sum / set.size();
            
            System.out.println("Mean = " + (mean));
            }
           else{
               System.out.println("Set size cannot be a zero value nor a negative value");
            }
        }
        catch(Exception e){
            System.out.println("The SET size cannot be a floating point value nor a letter");
            System.out.println(e);
            
        }
    }//end of main
    
}
