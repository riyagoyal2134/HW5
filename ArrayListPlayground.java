package HW5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPlayground {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
    // Question 1
    // Write Java statements that do the following:
    // a) Declare an arrayList nums of 15 elements of type int.
    // b) Output the value of the tenth element of the array nums.
    // c) Set the value of the 5th element of the array alpha to 99.
    // d) Set the value of the 9th element of the array alpha to the sum of the 6th and 13th elements of the array nums.
    
    ArrayList <Integer> nums = new ArrayList <Integer>(15);
    nums.add(1);
    nums.add(2);
    nums.add(3);
    nums.add(4);
    nums.add(5);
    nums.add(6);
    nums.add(7);
    nums.add(8);
    nums.add(9);
    nums.add(10);
    nums.add(11);
    nums.add(12);
    nums.add(13);
    nums.add(14);
    nums.add(15);
    System.out.println(nums.get(9));
    ArrayList <Integer> alpha = new ArrayList <Integer>();
    alpha.add(1);
    alpha.add(1);
    alpha.add(1);
    alpha.add(1);
    alpha.add(1);
    alpha.add(1);
    alpha.add(1);
    alpha.add(1);
    alpha.add(1);
    alpha.set(4,99);
    alpha.set(8,nums.get(5)+ nums.get(12));
    System.out.println(alpha);

    // Question 2
    // a) create an arrayList of Strings that contain each day of the week.(starting on monday)
    // b) output each of the days of the week
    // c) output the days of the week we have class
    // d) output the days of the week that we don't have class 
    // e) change the arrayList to start on Sunday

    ArrayList <String> weekday = new ArrayList<String>();
    weekday.add("Monday");
    weekday.add("Tuesday");
    weekday.add("Wednesday");
    weekday.add("Thursday");
    weekday.add("Friday");
    weekday.add("Saturday");
    weekday.add("Sunday");
    System.out.println(weekday);
    System.out.println("The days of the week are:");
    System.out.println(weekday.get(0));
    System.out.println(weekday.get(1));
    System.out.println(weekday.get(2));
    System.out.println(weekday.get(3));
    System.out.println(weekday.get(4));
    System.out.println(weekday.get(5));
    System.out.println(weekday.get(6));
    System.out.println("The days of the week we have class are:");
    System.out.println(weekday.get(1));
    System.out.println(weekday.get(3));
    System.out.println("The days of the week we do have class are:");
    System.out.println(weekday.get(0));
    System.out.println(weekday.get(2));
    System.out.println(weekday.get(4));
    System.out.println(weekday.get(5));
    System.out.println(weekday.get(6));
    System.out.println("The ArrayList before update:"+ weekday);
    String Day= "Sunday";
    weekday.remove(weekday.indexOf(Day));
    weekday.add(0, Day);
    System.out.println("The ArrayList after update:"+ weekday);

    // Question 3 
    // a) create an ArrayList and prompt the user for numbers to add to it until the number 0 is selected
    // b) return the largest and smallest number
    // c) return the ArrayList sorted smallest to largest
    // d) take that ArrayList see if its size is divisible by 3 and then output the ArrayList in a matrix format
    // NOTE: make the matrix n X 3 so it can be n rows by 3 columns 
    // EX. ArrayList [1,2,3,4,5,6,7,8,9]
    // 1 2 3
    // 4 5 6
    // 7 8 9
    // NOTE: If the ArrayList is NOT divisible by 3 ask the user for more numbers and add them until it is
    // ArrayList Size: 7
    // Please enter 2 more numbers to create the matrix...
    // 

        ArrayList<Integer> userInputArray = new ArrayList<Integer>();
        System.out.println("Enter the numbers to add in ArrayList");
        System.out.println("Number:");
        int data = keyboard.nextInt();
        while (data!=0) {
            userInputArray.add(data);
            System.out.println(userInputArray);
            System.out.println("Number:");
            data = keyboard.nextInt();
        }
        System.out.println("TOTAL ENDED --- ");
        System.out.println("The ArrayList is "+ userInputArray);  
        int n = userInputArray.size();
        System.out.println("ArrayList elements are :");
        for (int i = 0; i < n; i++) {
            System.out.print(userInputArray.get(i) + " ");
        }
        System.out.println();
        int max = Collections.max(userInputArray);
        System.out.println("The Largest Number is : " + max);
   
        int min = Collections.min(userInputArray);
        System.out.println("The Smallest Number is : " + min); 
        Collections.sort(userInputArray);
        System.out.println("The ArrayList after Sorting is"+ userInputArray);
        System.out.println(userInputArray);
        int no =userInputArray.size();
        int div = no %3;
        int num1= 0;
        int num2 = 0;
        while(!(div == 0)){
            if(div == 1){
                System.out.println("Please enter 2 numbers to create the matrix:");
                System.out.println("Enter the numner 1:");
                num1 = keyboard.nextInt();
                userInputArray.add(num1);
                System.out.println("Please enter number 2: ");
                num2 = keyboard.nextInt();
                userInputArray.add(num2);
                no = userInputArray.size();
                div = no % 3;
            }
            else if(div == 2){
                System.out.println("Please enter 1 more number to create the matrix:");
                System.out.println("Enter the number:");
                num1= keyboard.nextInt();
                userInputArray.add(num1);
                no = userInputArray.size();
                div = no % 3;
            }
        }
        System.out.println(userInputArray);
        // Now this step will output the marix
                no = userInputArray.size();
                int capacity = no /3;
                int b = capacity;
                ArrayList<ArrayList<Integer>> Matrix = new ArrayList<>();
                int count = 0;
                for(int i=0;i<b;i++) {
                    ArrayList<Integer> Row = new ArrayList<>();
                    for(int k=0;k<3;k++) {
                        Row.add(userInputArray.get(k+count));
                    }
                    count +=3; 
                    Matrix.add(Row);
                    
                }
                for(int row=0;row<Matrix.size();row++) {
                    for(int col=0;col<Matrix.get(row).size();col++) {
                        System.out.print(Matrix.get(row).get(col)+" ");
                    }
                    System.out.println(" ");
                }

    }
}
