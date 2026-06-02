import java.util.Scanner;
public class StudentExcellence {
    int rollNo;
    String name,branch,gender;
    int age;
    int marks1,marks2,marks3;
    double percentage;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roll No:");
        rollNo=sc.nextInt();
        System.out.println("Enter Name:");
        name=sc.next();
        System.out.println("Enter Branch:");
        branch=sc.next();
        System.out.println("Enter Gender:");
        gender=sc.next();
        System.out.println("Enter Age:");
        age=sc.nextInt();
        System.out.println("Enter Marks for Subject 1:");
        marks1=sc.nextInt();
        System.out.println("Enter Marks for Subject 2:");
        marks2=sc.nextInt();
        System.out.println("Enter Marks for Subject 3:");
        marks3=sc.nextInt();
    }
    void calculate_percentage(){
        percentage=(marks1+marks2+marks3)/3.0;
    }
    void display(){
        System.out.println("--------Student Excellence-------");
        System.out.println("Roll No:"+rollNo);
        System.out.println("Name:"+name);
        System.out.println("Branch:"+branch);
        System.out.println("Gender:"+gender);
        System.out.println("Age:"+age);
        System.out.println("Marks for Subject 1:"+marks1);
        System.out.println("Marks for Subject 2:"+marks2);
        System.out.println("Marks for Subject 3:"+marks3);
        System.out.println("-----------------------------");
        System.out.println("Percentage:"+percentage);
    
    }
public static void main(String[]args){
    StudentExcellence student=new StudentExcellence();
    student.input();
    student.calculate_percentage();
    student.display();
}
}