import java.util.Scanner;
import java.util.Arrays;
//Creating the Student class
public class SylvesterImplementation{
   public static void main(String[] args) {

     //Creating scanner object
     Scanner input=new Scanner(System.in);

     //prompting the user to enter the number of grades they want to input
        System.out.println("ENTER THE NUMBER CURRENT OF STUDENTS : ");
   // the number of students the user what to input
         int numberOfStudents=input.nextInt();
     System.out.println("ENTER THE NAME OF STUDENT : ");
     //getting the name from the user
     String name=input.next();
//creating the grades array
      double m[]=new double[3];
      double grades[]=new double[m.length];
     //entering courses with user input plus the grades
			System.out.println( "ENTER "+ 3 +" GRADES FOR :" + name);
			for(int s=0;s<m.length;s++){
				m[s]=input.nextDouble();
        grades[s]=m[s];
      }
      //System.out.println(Arrays.toString(m));
//creating the student object..setting the grades,name,and the totalNoOfStudent
    Student student1=new Student(name,grades,numberOfStudents);
//printing the student detaILS
   System.out.println(student1.printStudentDetails());

  }
}
