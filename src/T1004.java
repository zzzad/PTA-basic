import java.util.*;
public class T1004 {
    static class student{
        String name;
        String num;
        int score;
    }
    public static void main(String[] args){
        Scanner read=new Scanner(System.in);
        int num=read.nextInt();
        student s[]=new student[num];
        for(int i=0;i<num;i++){
            s[i]=new student();
            s[i].name=read.next();
            s[i].num=read.next();
            s[i].score=read.nextInt();
        }
        int min=s[0].score;
        int max=s[0].score;
        for(int i=0;i<num;i++){
            if(s[i].score<min){
                min=s[i].score;
            }
            if(s[i].score>max){
                max=s[i].score;
            }
        }
        for(int j=0;j<num;j++){
            if(s[j].score==max){
                System.out.println(s[j].name+" "+s[j].num);
            }
        }
        for(int j=0;j<num;j++){
            if(s[j].score==min){
                System.out.println(s[j].name+" "+s[j].num);
            }
        }

    }

}
