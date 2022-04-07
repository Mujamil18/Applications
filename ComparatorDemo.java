package collections;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ComparatorDemo {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        ArrayList <Student> studentDetails = new ArrayList<>();
        System.out.println("Enter the details of Student");
        System.out.println("RegNo  Name  DoB");
        studentDetails.add(new Student(1, "Mujamil" , 181199));
        studentDetails.add(new Student(2, "Shifa" , 300998));
        studentDetails.add(new Student(3, "Mehala", 210899));


        System.out.println("Unsorted");
        for(int i= 0; i< studentDetails.size(); i++)
        {
            System.out.println(studentDetails.get(i));
        }

        Collections.sort(studentDetails, new SortByReg());
        System.out.println("Sorted by Reg Number");
        for(int i= 0; i< studentDetails.size(); i++)
        {
            System.out.println(studentDetails.get(i));
        }

        Collections.sort(studentDetails, new SortByName());
        System.out.println("Sorted by Name");
        for(int i= 0; i< studentDetails.size(); i++)
        {
            System.out.println(studentDetails.get(i));
        }

    }
}
class Student
{
    int regNo;
    String name;
    int dob;

    public Student(int regNo, String name, int dob)
    {

        this.regNo= regNo;
        this.name= name;
        this.dob= dob;
    }
    public String toString()
    {
        return regNo + " " + name + " "+ dob;
    }
}
class SortByReg implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
        return a.regNo - b.regNo;
    }

}
class SortByName implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
        return a.name.compareTo(b.name);
    }
}
