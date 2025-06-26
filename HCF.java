

public class HCF { public static void main(String[] args){
        int a= 8;
        int b= 12;
        int smal = (a>b)?b:a;
        int hcf=1;
        for(int i=1; i<=smal; i++){
            if(a%i==0 && b%i==0){
                hcf =i;
            }
        }
        System.out.println(hcf);

    }
    
}
