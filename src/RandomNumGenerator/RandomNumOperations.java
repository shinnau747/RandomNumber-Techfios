package RandomNumGenerator;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumOperations {

	public static void main(String[] args) {

        int[] arraylist = new int[500];
 
        generateRandNum1(arraylist); // Creates random numbers
        sortArray1(arraylist); // Sorts random numbers
        removeduplicates(arraylist, arraylist.length);//removes duplicates from array
        
        
        System.out.print("Please enter a number between 1 and 500: ");
        Scanner sc = new Scanner(System.in);
        int input   = sc.nextInt();
        
        
        System.out.println("Sorted Array : " + Arrays.toString(arraylist));
        System.out.println("The " + input + "th smallest number is " + findNthSmallestNumber(input,arraylist) + ".");


	}  
        public static void generateRandNum1(int[] arraylist) {
            for(int i=0; i < arraylist.length; i++)
            {
            	Random r = new Random();
            	arraylist[i]  = r.nextInt(999-101+1);
            }
        }       

       
        public static void sortArray1(int[] arraylist){
            int temp;   
            for (int i=1; i<arraylist.length; i++){
                for(int j=0; j < arraylist.length-i; j++){
                    if (arraylist[j] > arraylist [j+1]){
                        temp = arraylist [j];
                        arraylist [j] = arraylist [j+1];
                        arraylist [j+1] = temp;
                    }
                }
            }
        } 
        
       public static void removeduplicates(int[] arraylist, int n){
    	   // creating a temporary array for storing
           // the unique elements
            int[] temp = new int[n];
            int j = 0;
      
            for (int i = 0; i < n - 1; i++) {
                if (arraylist[i] != arraylist[i + 1]) {
                    temp[j++] = arraylist[i];
                }
            }
      
            temp[j++] = arraylist[n - 1];
      
            // Changing back to the original array
            for (int i = 0; i < j; i++) {
                arraylist[i] = temp[i];
            }
      
        }
        

        //find nth smallest number
        public static int findNthSmallestNumber(int n, int[] numbers){
            return numbers[n-1];
        }





}
