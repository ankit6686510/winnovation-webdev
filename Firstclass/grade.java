import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int marks =  scn.nextInt();
         if(marks >=90 && marks <=100){
            System.out.println("grade is A");
         }else if(marks>=80 && marks< 90){
            System.out.println("grade is B");
         }
         else if(marks>=70 && marks< 80){
            System.out.println("grade is C");
         }
         else if(marks>=60 && marks< 70){
            System.out.println("grade is D");
         }
         else if(marks>=0 && marks< 60){
            System.out.println("grade is f");
         }else{
            System.out.println("invalid marks");
         }
         
    }
}
