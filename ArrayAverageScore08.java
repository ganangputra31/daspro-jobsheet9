import java.util.Scanner;
public class ArrayAverageScore08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number Student: ");
        int numberstudent = sc.nextInt();

        int []score = new int [numberstudent];
        double totalpassed = 0,totalfailed = 0;
        double averagepassed , averagefailed;
        int numberpassed = 0, numberfailed = 0;

        for (int i = 0; i < numberstudent; i++) {
            System.out.print("Enter student score " + ( i + 1) + ": ");
            score[i] = sc.nextInt();

            if(score[i] > 70) {
                totalpassed += score[i];
                numberpassed++;
            }else{
                totalfailed += score[i];
                numberfailed++;

            }
        }
        averagepassed = totalpassed / numberpassed;
        averagefailed = totalfailed / numberfailed;
        System.out.println("The average score of students who passed is : " + averagepassed );
        System.out.println("The average score of students who failed is " + averagefailed );
        
    }
}
