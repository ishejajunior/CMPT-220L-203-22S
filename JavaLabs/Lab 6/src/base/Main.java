package base;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] names = {"Ricky", "Isheja", "Junior"};

        System.out.println("Printing array:");
         for (int i = 0; i < names.length; i++){
         System.out.println(names[i]);
        }// Create an Array, Populate it, and Print it out


        ArrayList<String> names1 = new ArrayList<>();
        names1.add("ricky");
        names1.add("junior");
        names1.add("Isheja");
        System.out.println(names1);// Create an ArrayList, Populate it, and Print it out
        
        LinkedList<String> iphone = new LinkedList<String>();
        iphone.add("Iphone4");
        iphone.add("Iphone5");
        iphone.add("Iphone6");
        iphone.add("Iphone7");
        iphone.add("Iphone8");
        iphone.add("Iphone9");
        iphone.add("IphoneX");
        System.out.println(iphone);// Create an LinkedList, Populate it, and Print it out

        Queue<String> bankline = new LinkedList<String>();
        bankline.add("customer1");
        bankline.add("customer2");
        bankline.add("customer3");
        bankline.add("customer4");
        System.out.println(bankline);// Create an Queue, Populate it, and Print it out

        Stack<String> plates = new Stack<String>();
        plates.push("plate1");
        plates.push("plate2");
        plates.push("plate3");
        plates.push("plate4");
        System.out.println(plates);// Create an Stack, Populate it, and Print it out

        // Using the information in the Lab 6 Jupyter Notebook create an instance of plant here.
        Plant moss = new Plant();
        moss.fam_name="caleb";
        moss.name="MOSS";
        moss.watering='5';
        System.out.println(moss);
        System.out.println("Printing the objects:");
        for (int a = 0; a < 3; a++){
        System.out.println(moss);
       }
        
    }
}
