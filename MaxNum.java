package tnsJava;
import java.util.*;

public class MaxNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int Max_number = (a > b) ? a : b;
        System.out.println(Max_number + " is Max");

	}

}
