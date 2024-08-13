import java.util.Scanner;
class Main{
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = scan.nextInt();
    if(n==1 || n<=0){
        System.out.println("Invalid number");
    }
    for(int i =2;i<=n;i++){
        if(n%i==0){
            System.out.println("Number is  not prime number");
        }
        else{
            System.out.println("Number is prime number");
        }
    }


    }
}