public class Palindrome {
    public static int Rev(int num){
        int res=0;
        while (num!=0){
            int rem= num%10;
            res=(res*10)+rem;
            num=num/10;

        }
        return res;
    }
    public static void main(String[] args){
        int num =1210;
        int res= Rev(num);
        if(num==res){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
