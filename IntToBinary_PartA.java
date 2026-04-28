import java.util.Scanner;

public class IntToBinary_PartA {
    public static  void main(String[] args)
   { Scanner sc=new Scanner(System.in);
     System.out.println("Enter an integer number:");
     int n= sc.nextInt();
      
    String bin ="";
    while(n>0){
      int rem = n % 2;
      bin = rem+bin;
       n=n/2;
    }
    System.out.println(bin);
   }
}