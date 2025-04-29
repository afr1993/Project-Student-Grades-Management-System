import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[10];
        double sum,average ;
        sum = 0;
        average = 0;
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;

        System.out.println("Enter grades for 10 students: ");
        for (int i = 0; i < grades.length; i++){
            System.out.println("Enter grade for student "+(i+1));
            grades[i] = scanner.nextDouble();
            sum += grades[i];
            if(grades[i] > highest){
                highest = grades[i];
            }

            if(grades[i] <= lowest){
                lowest = grades[i];
            }
        }
        average = sum / grades.length;

        for(int i = 0; i < grades.length; i++){
            System.out.println("The grade for the student "+(i+1)+" :"+grades[i]);
        }
        System.out.println("Average grade : "+average);
        System.out.println("Lowest grade : "+lowest);
        System.out.println("Highest  grade : "+highest);



    }
}