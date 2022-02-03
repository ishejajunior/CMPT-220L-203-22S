package base;

public class Main {
    /**
     * # Lab Two
     *
     * Ok for this lab we're going to reiterate a lot of the things that we went over in class.
     *
     * Our Goals are:
     * - Conditionals
     *     - If
     *     - Else
     *     - Else If
     */
    public static void main(String[] args) {
        if (20>18){
            system.out.println("20 is greater than 18");
        }// Make an if statement that triggers a print or println statement

        if(20>18){
            system.out.println("20 is greater than 18");
        }else{
            system.out.println("18 is greater than20");
        }// Make an if, else statement where the else statement triggers a print or println statement

        if(20>18){
                system.out.println("20 is greater than 18");
        }
        else if(20>18){
            system.out.println("20 is greater than 18");
        }else{
            system.out.println("18 is greater than20");
        }// Make an if, else if, else statement where the else if statement triggers a print or println statement

        int x=3;
        int y=4;
        if(x>y){
            system.out.println("variable x is the greatest number");
        }else{
            system.out.println("variable y is the greatest number");
        }// Make 2 variables and use them in an if else conditional print from one of the sections

        int age=19;
        char citizenship=US;
        if(age>=18 && citizenship=US){
            system.out.println("You are eligible to vote");
        }// Make an if statement using 2 variables and an AND(&&) statement that triggers a print or println statement
        
        if (age>=18 || citizenship=US){
            system.out.println("please proceed to vote");
        }// Make an if statement using 2 variables and an OR(||) statement that triggers a print or println statement
    }  
}
