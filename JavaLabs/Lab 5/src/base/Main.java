import java.util.ArrayList;  
import java.util.Arrays; 
public class drycode {
    public static void main(String[] args) {

        int current_pretzels=60;
        int current_lemonades=43;
        int current_cash=0;
        int current_tips=0;
        int [] pretzels_available={2,3,1,2,10,6,0,1,2,6,9};//list of number of pretzels bought
        int [] lemonades_available={1,3,2,6,4,8,1,7,3,2};//list of lemonades of lemonades bought
        int [] cash={1500,8,8,4,24,6,2,16,48,32,4,4,20,64,12,8,2,56,4,12,24,18,16};//list of amount got
        int [] tips={4,10,5,10,4,3};//list of tips

        for(int i=0;i<pretzels_available.length;i++){
            current_pretzels=current_pretzels-pretzels_available[i]; 
        }//for loop to get the remaining pretzels
        System.out.println("The Remaining Pretzels are:"+current_pretzels);

        for(int z=0;z<lemonades_available.length;z++){
            current_lemonades=current_lemonades-lemonades_available[z];
        }//for loop to get the remaining lemonades
        System.out.println("The remaining lemonades are:"+current_lemonades);

        for(int y=0 ;y<cash.length ;y++){
        current_cash=current_cash+cash[y];
        }//for loop to get the total profit earned
        System.out.println("The total cash obtained is:"+current_cash+"$");

        for(int a=0;a<tips.length;a++){
        current_tips=current_tips+tips[a];
        }//for loop to get total tips
        System.out.println("The total tips are:"+current_tips+"$");
    }
}
//# How my turned my code from wet to dry.(markdown assignment)

//I turned my code from wet to **dry using for loops and lists** 
//since they were four main objects all over the wet code i then decised to use them as 
//a list and then added the ellements of the array using the **for loop**
