import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n = scn.nextInt();
        int first = 0;
        int sec = 1;
        System.out.println(first );
        System.out.println(sec );

        for(int i  = 2 ;i <= n;i++){
            int next = first + sec;
            System.out.println(next);
            first = sec;
            sec = next;

        }

    }
}
