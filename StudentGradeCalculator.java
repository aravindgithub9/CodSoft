package com.aravind.www;

	import java.util.Scanner;

	public class StudentGradeCalculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of subjects: ");
	        int numSubjects = scanner.nextInt();

	        int totalMarks = 0;
	        for (int i = 1; i <= numSubjects; i++) {
	            System.out.print("Enter marks obtained in subject " + i + ": ");
	            int marks = scanner.nextInt();
	            totalMarks = totalMarks + marks;
	        }

	        double avgPercentage = (double) totalMarks / (numSubjects * 100) * 100;

	        char grade;
	        if (avgPercentage >= 90) {
	            grade = 'A';
	        } else if (avgPercentage >= 80) {
	            grade = 'B';
	        } else if (avgPercentage >= 70) {
	            grade = 'C';
	        } else if (avgPercentage >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }

	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + avgPercentage + "%");
	        System.out.println("Grade: " + grade);

	        scanner.close();
	    }
	}

