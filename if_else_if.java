import java.util.Scanner;
public class if_else_if {
    public static void main(String[] args) {
        //to print wether a number is positive or not using if else if
        Scanner scn = new Scanner(System.in);
        int n =  scn.nextInt();
        if(n>0){
            System.out.println("positive");
        }else if(n<0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
         
    }
}
