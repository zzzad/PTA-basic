import java.util.*;
public class T1007{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int max = reader.nextInt();
        if(max%2 == 0)
            max = max-1;
        int flag = 0;
        int count = 0;
        while(max > 2){
            int i = 3 ;
            while(  i <= Math.sqrt(max)  ){
                if(max%i != 0){
                    i+=2;
                }else {
                    i=0;
                    break;
                }
            }
            if(i!=0){
                flag++;
            }else{
                flag = 0;
            }
            if(flag == 2 ){
                count++;
                flag = 1;
            }
            max-=2;
        }
        System.out.println(count);
    }
}

