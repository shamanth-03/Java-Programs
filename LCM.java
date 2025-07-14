public class LCM {
    public static void main(String[] args){
        int a= 26;
        int b= 36;
        int gret = (a>b)?a:b;
        int lcm=1;
        for(int i=gret; i<=(a*b); i++){
            if(i%a==0 && i%b==0){
                System.out.println(i);
                break;
            }
        }
    }
}

