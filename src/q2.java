import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[6];
        int first=0;
        int second=0;
        int third=0;
        int fourth=0;
        int fifth=0;
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks: ");
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < marks.length; i++) {
            if (marks[i]>=70) {
                first+=1;
            }
            else if(marks[i]>=60) {
                second+=1;
            }
            else if(marks[i]>=50) {
                third+=1;
            }
            else if(marks[i]>=40) {
                fourth+=1;
            }
            else{
                fifth+=1;
            }
        }
        System.out.println("The number of marks equal and above 70 are: "+first);
        System.out.println("The number of marks equal and above 60 are: "+second);
        System.out.println("The number of marks equal and above 50 are: "+third);
        System.out.println("The number of marks equal and above 40 are: "+fourth);
        System.out.println("The number of marks below 40 are: "+fifth);

    }
}
