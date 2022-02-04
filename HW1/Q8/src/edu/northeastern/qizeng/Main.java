package edu.northeastern.qizeng;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String grade = "A";
        String meaning = gradeMeaning(grade);
        System.out.println("The meaning of grade "+ grade + " is " + meaning);
    }

    private static String gradeMeaning(String grade) {
        String meaningOfGrade = "";
        switch (grade) {
            case "A":
                meaningOfGrade = "Excellent";
                break;
            case "B":
                meaningOfGrade = "Good";
                break;
            case "C":
                meaningOfGrade = "Average";
                break;
            case "D":
                meaningOfGrade = "Deficient";
                break;
            case "F":
                meaningOfGrade = "Failing";
                break;
            default:
                meaningOfGrade = "NO meaning";
                break;
        }
        return meaningOfGrade;
    }
}
