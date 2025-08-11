public class Prime2 {
public static boolean IsPrime(int num){
    if(num<=1){
        return false;
    }
    for(int i=2; i<=Math.sqrt(num); i++){
        if(num%1==0){
            return false;
        }
    }
    return true;

}
public static void main(String[] args){
    int num=7;
    if(IsPrime(num)){
        System.out.println("prime");
    }
    else {
        System.out.println("Not");
    }

}
}
