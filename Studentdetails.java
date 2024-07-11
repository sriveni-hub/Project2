import java.util.*;
class Studentdetails
                  {
                    public static void main (String args[])
                    {

                     //creation of scanner object

                     Scanner sc=new Scanner(System.in);

                     int rollno,semester;
                     String  name,branch;
                     float marks;
                     char gender;

                     System.out.println("Enter the details of a student");
                     System.out.println("Enter the student name");
                     name=sc.nextLine();
                     System.out.println("Enter the student branch");
                     branch=sc.nextLine();
                     System.out.println("Enter the student semester");
                     semester=sc.nextInt();
                     System.out.println("Enter the student gender");
                     branch=sc.next().charAt(0);
                     System.out.println("Enter the student roll number");
                     rollno=sc.nextInt();
                     System.out.println("Enter the student marks");
                     marks=sc.nextFoat();
  
                  
                     System.out.println("Student details are:");
                     System.out.println("Student name:"+name);
                     System.out.println("Student branch:"+branch);
                     System.out.println("Student semester:"+semester);
                     System.out.println("Student gender are:"+gender);
                     System.out.println("Student details are:"+rollno);
                     System.out.println("Student marks:"+marks);

                     }
                  
                 }
                     

                     

                     