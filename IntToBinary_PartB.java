import java.util.Scanner;
public class IntToBinary_PartB {
public static int[] binary(int n){
    
int temp = n;
int bits = 0;
while (temp > 0) {
temp /= 2;
bits++;
}
       
    int[] arr=new int[bits];
    int i=0;
    while(n>0){
    int reminder=n%2;
    arr[i]=reminder; n=n/2; i++;
}
    return(arr);
}
public static void main(String[] args) {
  
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt();
int[] res=binary(num);
  
for(int i=res.length-1;i>=0;i--){
System.out.print(res[i]);
}
}
}