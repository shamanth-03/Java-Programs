
    

import java.util.Scanner;

public class FindPrime{
public static boolean Prime(int num){
    int count=0;
    if(num<1){
        return false;
    }
    for(int i=2; i<=Math.sqrt(num); i++){
        if(num % i==0){
           return false;
        }
    }
    return true;
}

public static void main(String []args){
    System.out.println("Enter a Number");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println("The entered number is"+" "+num);
    if(Prime(num)){
        System.out.println("The entered no is prime");
    }
    else {
        System.out.println("The entered no is not prime");
    }
}
}