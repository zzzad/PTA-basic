import java.util.*;
public class T1006 {
    public static void main(String[] args){
        Scanner reader =new Scanner(System.in);
        int n=reader.nextInt();
        int num[]=new int[3];
        for(int i=0;n!=0;i++){
            num[i]=n%10;
            n/=10;
        }
        for(int i=0;i<num[2];i++){
            System.out.print("B");
        }
        for(int i=0;i<num[1];i++){
            System.out.print("S");
        }
        for(int j=1;j<=num[0];j++){
            System.out.print(j);
        }
    }
}
