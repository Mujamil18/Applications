package collections;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        HashSet <String> set1= new HashSet<String>();
        set1.add("Mujamil");
        set1.add("Shifa");
        set1.add("Harishaa");
        set1.add("Mehala");
        System.out.println(set1);
        set1.remove(1); // does not remove any element
        set1.remove("Shifa"); //this removes the element
        System.out.println(set1);
        HashSet<String> set2= new HashSet<String>();
        set2.add("Leena");
        set2.add("Chithra");
        set2.add("Thenmozhi");
        set2.add("Sneha");
        System.out.println("Another set" + set2);
        set1.addAll(set2);
        System.out.println("After adding set2" + set1);
        set1.removeAll(set2);
        set1.add("Mujamil");
        set1.add("Shifa");
        System.out.println("There is no duplication of elements is HashSet " + set1);
        System.out.println("Hashcode value of the set " + set1.hashCode());

    }
}
