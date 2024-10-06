import java.util.Scanner;
public class q1 {
public static void main (String [] args){
    Scanner sc=new Scanner (System.in);
    int [] marks=new int[6];
    for(int i=0;i<marks.length;i++){
        System.out.println("Enter the marks: ");
        marks[i]=sc.nextInt();
    }

    for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]);
    }


}
}