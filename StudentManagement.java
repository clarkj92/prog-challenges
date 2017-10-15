/**
 * Created by JCAM6L on 6/29/2017.
 */

//https://www.reddit.com/r/dailyprogrammer/comments/1kphtf/081313_challenge_136_easy_student_management/
public class StudentManagement
{
	static String[] students;
	static int[][] grades;
	static int studentIndex = 0;

	//initializes the students and grades arrays
	public static void buildGradeBook(int numOfStudents, int numOfGrades)
	{
		students = new String[numOfStudents];
		grades = new int[numOfStudents][numOfGrades];
	}

	//adds a name to the students array and each grade to the grades array
	public static void addStudent(String name, int[] scores)
	{
		students[studentIndex] = name;

		for(int i = 0; i < scores.length; i++)
		{
			grades[studentIndex][i] = scores[i];
		}

		studentIndex++;
	}

	//print the student's name, each grade, and then the average
	public static void print(String[] students, int[][] grades)
	{
		for(int i = 0; i < students.length; i++)
		{
			System.out.print(students[i] + ": ");

			for(int j = 0; j < grades.length; j++)
			{
				System.out.print(grades[i][j] + " ");
			}

			System.out.println();
			System.out.println("average:  " + getAverage(grades[i]));
			System.out.println();
		}
	}

	//returns the average of all the grades
	public static double getAverage(int[] grades)
	{
		double total = 0;
		double average;

		for(int i = 0; i < grades.length; i++)
		{
			total += grades[i];
		}

		average = total / grades.length;

		return average;
	}

	//driver
	public static void main(String[] args)
	{
		/*
		calculateGrades(3, 5);
		addStudent("Jon", new int[]{19, 14, 15, 15, 16});
		addStudent("Jeremy", new int[]{15, 11, 10, 15, 16});
		addStudent("Jesse", new int[]{19, 17, 20, 19, 18});
		print(students, grades);
		*/

		buildGradeBook(10, 10);
		addStudent("Abigail", new int[]{11, 3, 5, 20, 4, 2, 8, 17, 4, 5});
		addStudent("Alexander", new int[]{2, 12, 20, 0, 6, 10, 3, 4, 9, 7});
		addStudent("Ava", new int[]{11, 15, 2, 19, 14, 5, 16, 18, 15, 19});
		addStudent("Ethan", new int[]{6, 12, 0, 0, 5, 11, 0, 11, 12, 15});
		addStudent("Isabella", new int[]{16, 0, 10, 7, 20, 20, 7, 2, 0, 1});
		addStudent("Jacob", new int[]{2, 14, 17, 7, 1, 11, 16, 14, 14, 7});
		addStudent("Jayden", new int[]{10, 10, 3, 16, 15, 16, 8, 17, 15, 3});
		addStudent("Madison", new int[]{10, 11, 19, 4, 12, 15, 7, 4, 18, 13});
		addStudent("Sophia", new int[]{5, 17, 14, 7, 1, 17, 18, 8, 1, 2});
		addStudent("William", new int[]{12, 12, 19, 9, 4, 3, 0, 4, 13, 14});
		print(students, grades);
	}
}