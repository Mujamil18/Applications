package collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo
{
    public static void main(String[] args)
    {
        Vector <Integer> vector= new Vector<>();

        for(int i=1; i<=10 ; i++)
        {
            vector.add(i);
        }
        vector.remove(3);

        System.out.println(vector);
        Iterator<Integer> itr= vector.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
