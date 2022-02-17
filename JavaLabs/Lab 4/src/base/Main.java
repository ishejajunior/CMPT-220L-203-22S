package base;

import java.util.Scanner;

public class Main {
    /**
     * # Lab Four
     * ---
     *
     * For this lab we're going to be making and using a bunch of functions.
     *
     * Our Goals are:
     * - Switch Case
     * - Looping
     * - Making our own functions
     * - Combining functions
     * - Structuring solutions
     */
    public static void main(String[] args) {
        int day=5;
        switch(day) {
            case1:
            System.out.println("Its monday:");
            break;
            case2:
            System.out.println("Its Tuesday:");
            break;
            case3:
            System.out.println("Its Wednesday:");
            break;
            case4:
            System.out.println("Its Thursday:");
            break;
            case5:
            System.out.println("Its Friday:");
            break;
        }// Give me an example of you using switch case.
        for(int x=0;x<5;x++){
        system.out.println("Hello world");
    }// Give me an example of you using a for loop
        while(x>=2){
            System.out.println("This is a while loop");
        }// Give me an example of you using a while loop
        int a, b;  

Scanner sc=new Scanner(System.in);  
System.out.print("Enter the base: ");  
a=sc.nextInt();  
System.out.print("Enter the exponent: ");  
b=sc.nextInt();    
int powerab=power(2,3);
int pythagorean=var(8,9); 

System.out.println(a +" to the power " +b + " is: "+powerab);
System.out.println("the pythagorean theorem is:"+pythagorean);
    }
    // For the following todos you'll probably want to define them below and then call them from the main function above.
    /**
     * I want you to write a function that will take in a number and raise it to the power given.
     * For example if given the numbers 2 and 3. The math that the function should do is 2^3
     * and should print out or return 8. Print the output.
     */
    public class Powernumber   {  
        static int power(int a, int b)  {  
        int power=1 ;  
        for (int i = 1; i <= b; i++)    
        power = power * a;    
        return power;  
        }
    /**
     * I want you to write a function that will take in a list and see how many times a given number is in the list.
     * For example if the array given is [2,3,5,2,3,6,7,8,2] and the number given is 2 the function should print out
     * or return 3. Print the output.
     */public Customer findUsingEnhancedForLoop(String name, List<number> numbers) {
        List<String> number = Arrays.asList("2", "3", "5","2", "3", "6");
    for (Customer number : numbers) {
        if (number.getName().equals(name)) {
            return number;
        }
    }
    return null;
}

    /**
     * Create a function named summation that will take in an int[ ] and return an int.
     * I want the function to then go through the given array and sum up digits in the array.
     * Once that’s done print or return the answer. Print the output
     */
  public class listsearch {
      static int sumo(int sumo){
    int sum=0;
    int[] cars = {10, 20, 30, 40};

    for (int i = 0; i < 4; i++) {
     sum=sum+cars[i];
    }
    return sum;
  }
}

    /**
     * Give me a function that gives the answer to the pythagorean theorem.
     * I'd like you to reuse the exponent function from above as well as the functions below to make your function.
     *
     * If you don't remember the pythagorean theorem the formula is (a^2 + b^2 = c^2).
     * Given a and b as parameters i'd like you to return c.
     *
     * If this doesn't make sense look up `Pythagorean Theorem Formula` on google.
     *
     * Once that’s done print or return the answer. Print the output
     */public class pythagoreantheorem{
         static int var(int a,int b){
        int squareda,squaredb,total;
        double c;
        squareda=a*a;
        squaredb=b*b;
        total=squareda+squaredb;
        c=Math.sqrt(total);
        return c;
     }
    }

    

    int addition(int a, int b) {
        int answer = a + b;
        return answer;
    }

    int division(int a, int b) {
        int answer = a / b;
        return answer;
    }
}
}
