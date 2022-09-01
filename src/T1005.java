import java.util.Arrays;
import java.util.Scanner;

public class T1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[5000];
        int ns[] = new int[n];
        for (int i = 0; i < ns.length; i++) {
            ns[i] = sc.nextInt();
        }
        for (int i = 0; i < ns.length; i++) {
            int mid=ns[i];
            while(mid!=1) {
                if((mid&1)==0) {
                    mid = mid/2;
                }else {
                    mid = (mid*3+1)/2;
                }
                arr[mid]=1;
            }
        }
        Arrays.sort(ns);
        int ans[] = new int[n];
        int j=0;
        for (int i = ns.length-1; i >=0; i--) {
            if(arr[ns[i]]==0) {
                ans[j++]=ns[i];
            }
        }
        for (int i = 0; i < j; i++) {
            if(i==j-1)
                System.out.print(ans[i]);
            else
                System.out.print(ans[i]+" ");
        }
    }
}
