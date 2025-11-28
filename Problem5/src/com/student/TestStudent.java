package com.student;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		double marks[] = new double[5];

		System.out.println(" Welcome to the Student Mnaagement System !!!");
		System.out.println(" Enter the Id :- !!!");
		int id = sc.nextInt();
		System.out.println(" Enter the Name :- ");
		String name = sc.next();
		System.out.println(" Enter the class :- ");
		String Class = sc.next();
		System.out.println(" Enter the diviSion :- ");
		String diviSion = sc.next();
		System.out.println("Enter marks in 5 subjects:");
		double total = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("Subject " + (i + 1) + ": ");
			marks[i] = sc.nextDouble();
			total += marks[i];
		}
		s1.setPercenTage((total / marks.length));
		double percenTage = s1.getPercenTage();
		String grade = calculateGrade(percenTage);
		Student s = new Student(id, name, Class, diviSion, grade, marks, percenTage);
System.out.println(s);
	}

	private static String calculateGrade(double percentage) {
		if (percentage >= 80)
			return "A";
		else if (percentage >= 70)
			return "B";
		else if (percentage >= 60)
			return "C";
		else if (percentage >= 50)
			return "D";
		else
			return "F";
	}

}
