import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        int SIZE = (int) (Math.random() *8) + 3;
        int[] testScores = new int[SIZE];
        char[] letterGrades = new char[SIZE];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of test scores to be entered: " + SIZE);

        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter test score " + (i + 1) + ": ");
            testScores[i] = scanner.nextInt();
        }
        for (int i = 0; i < SIZE; i++){
            letterGrades[i] = getLetterGrade(testScores[i]);
        }
        printGrades(testScores, letterGrades);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);

        scanner.close();



    }
    public static char getLetterGrade(int score) {
        if (score >= 90 && score <=100){
            return 'A';
        }
        else if (score >= 80 && score < 90) {
            return 'B';
        }
        else if (score >= 70 && score < 80) {
            return 'C';
        }
        else if (score >= 60 && score < 70) {
            return 'D';
        }
        else {
            return 'F';
        }
    }
    public static void printGrades(int[] testScores, char[] letterGrades){
        System.out.println("\nScore\tGrade");
        for (int i = 0; i < testScores.length; i++) {
            System.out.println(testScores[i] + "\t\t " + letterGrades[i]);
        }
    }
    public static void printHighestScore(int[] testScores) {
        int highest = testScores[0];
        for (int score : testScores){
            if(score > highest){
                highest = score;
            }
        }
        System.out.println("Highest score: " + highest);

    }
    public static void printLowestScore(int[] testScores) {
        int lowest = testScores[0];
        for (int score : testScores){
            if (score < lowest) {
                lowest = score;
            }
        }
        System.out.println("Lowest score: " + lowest);
    }
    public static void printAverageScore(int[] testScores) {
        int total = 0;
        for (int score : testScores){
            total += score;
        }
        double average = (double) total / testScores.length;
        System.out.println("Average score: " + average);
    }
}
