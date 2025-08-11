public class Prime {
    public static int CheckPrime(int num){
        int count = 0;
        for(int i=1; i<=num; i++){
            if(num % i ==0){
                count++;
                if(count>2){
                    break;
                }
            }
        }
        return count;

    }
    public static void main(String[] args){
        int num=89;
        int count = CheckPrime(num);
        if(count==2){
            System.out.println("Prime");
        }
        else {
            System.out.println("not prime");
        }
    }
}
