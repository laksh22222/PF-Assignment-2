import java.util.Scanner;
class Main {
    public static String binary(int n){
        String bin="";
      while(n>0){
         int reminder=n%2;
         bin=reminder+bin;
         n=n/2;
      }
      return(bin);
    } 
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number:");
      int num=sc.nextInt();
       String res=binary(num);
      System.out.println(res);
    }
}