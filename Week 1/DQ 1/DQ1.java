import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;
      int num3;
      int num4;
      
      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      num3 = scnr.nextInt();
      num4 = scnr.nextInt();


        double average_arith = (num1+num2+num3+num4)/4.0;
        double product_arith = num1*num2*num3*num4;

        int result1 = (int) average_arith;
        int result2 = (int) product_arith;

        System.out.printf("%d %d\n",result2,result1);
        System.out.printf("%.3f %.3f\n",product_arith,average_arith);

   }
}
