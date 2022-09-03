import java.util.*;
public class T1011 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long num[][]=new long[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                num[i][j]=in.nextInt();
            }
            if(num[i][0]+num[i][1]>num[i][2]){
                System.out.println("Case #"+(i+1)+": true");
            }else{
                System.out.println("Case #"+(i+1)+": false");
            }
        }
    }
}
