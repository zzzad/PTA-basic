import java.util.*;
public class T1008 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int c= in.nextInt();
        int num[]=new int [n];
        for(int i=0;i<n;i++){
            num[i]=in.nextInt();
        }
        if(c>=n){
            if(c%n!=0){
                c=c%n;
            }else{
                c=0;
            }
        }
        for(int i=n-c;i<=n-1;i++){
            System.out.print(num[i]+" ");
        }
        for(int i=0;i<n-c-1;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println(num[n-c-1]);
    }
}
