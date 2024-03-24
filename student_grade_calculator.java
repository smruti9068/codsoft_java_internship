import java.util.Scanner;

public class student_grade_calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the mark of subject_1 out of 100: ");
      double s1=sc.nextDouble();
      System.out.println("Enter the mark of subject_2 out of 100: ");
      double s2=sc.nextDouble();
      System.out.println("Enter the mark of subject_3 out of 100: ");
      double s3=sc.nextDouble();
      double sum=s1+s2+s3;
      double average=sum/3;
      char grade;
      if(average>=90)
    	  grade='A';
      else if(average>=80)
    	  grade='B';
      else if(average>=70)
    	  grade='c';
      else if(average>=60)
    	  grade='D';
      else if(average>=50)
    	  grade='E';
      else 
    	  grade='F';
      System.out.println("TOTAL MARKS= "+ sum);
      System.out.println("AVERAGE PERCENTAGE= "+ average);
      System.out.println("GRADE= "+ grade);
	}
}
