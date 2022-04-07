package collections;
import java.util.*;
public class TreeSetDemo {
    public static void main(String[] args)
    {
        //TreeSet with String elements
        TreeSet<String> treeSet = new TreeSet<>();

        //adding the elements to the treeset
        treeSet.add("Mujamil");
        treeSet.add("Shifa");
        treeSet.add("Ajith");
        treeSet.add("Harishmaa");
        treeSet.add("Bala");
        treeSet.add("Eganathan");
        treeSet.add("Thenmozhi");
        System.out.println(treeSet);

        //TreeSet with Integer elements
        TreeSet<Integer> tSet= new TreeSet<>();
        tSet.add(19);
        tSet.add(25);
        tSet.add(13);
        tSet.add(15);
        tSet.add(21);
        System.out.println(tSet);

        //check if the above string exist in the treeset or not
        System.out.println(treeSet.contains("Mujamil"));
        System.out.println(treeSet.contains("Mehala"));

        //prints the first element of the treeset
        System.out.println(treeSet.first());
        //prints the last element of the treeset
        System.out.println(treeSet.last());

        //finds the higher and lower value of the given integer
        int val= 21;
        System.out.println(tSet.higher(val));
        System.out.println(tSet.lower(val));

        //to traverse the treeset in descending order
        System.out.println(tSet.descendingSet());

    }
}
