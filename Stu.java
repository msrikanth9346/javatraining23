class Student
{
int rollno;
String name;
static String college="MTIE";
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
class Stu 
{                                                  
public static void main(String args[])
{
Student s1=new Student(111,"srikanth");
Student s2=new Student(222,"SK");
Student.college="Mtie1";
s1.display();
s2.display();
}
}


