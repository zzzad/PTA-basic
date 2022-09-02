import java.util.*;
public class T1010{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] a = new int[1000];
        int[] b = new int[1000];
        int[] c = new int[1000];
        int i = 0;
        while(in.hasNext()) {
            a[i++] = in.nextInt();
        }
        int n = i;
        int k=0,flag=0;
//         System.out.print(n);
        for(int j=0;j<n;j++){
            b[k]=a[j]*a[j+1];
            b[k+1]=a[j+1]-1;
            k+=2;
            j++;
        }
        for(int j=0;j<k;j++){
            if(b[j+2]==-1){
                flag=1;
                break;
            }
            c[j]=b[j];
        }
        if(flag==1){
            for(int j=0;j<k-3;j++){
                System.out.print(c[j]+" ");
            }
            System.out.print(c[k-2]);
        }else if(flag==0){
            for(int j=0;j<k-1;j++){
                System.out.print(c[j]+" ");
            }
            System.out.print(c[k]);
        }
    }
}