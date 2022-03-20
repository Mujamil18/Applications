import java.util.*;

public class QueueApplication
{
    public static void main(String[] args)
    {
        Queue<Integer> reception= new LinkedList<>();
        Queue<Integer> waiting= new LinkedList<>();
        InterviewQueue interview= new InterviewQueue();
        interview.receptionQueue(reception);
        System.out.println(reception);
        interview.waitingQueue(waiting, reception);
        System.out.println("Candidates in the Waiting hall");
        System.out.println(waiting);
        System.out.println("Candidates in the Reception");
        System.out.println(reception);
        System.out.println();
        interview.interviewRoom(reception, waiting);

    }
}
class InterviewQueue {
    int candidates;

    public void receptionQueue(Queue<Integer> reception)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Candidates ");
        candidates = sc.nextInt();
        for (int i = 1; i <= candidates; i++)
        {
            reception.add(i);
        }

    }

    public void waitingQueue(Queue<Integer> waiting, Queue<Integer> reception)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of candidates allowed to the waiting hall");
        int wait_candidates = sc.nextInt();
        for (int i = 1; i <= wait_candidates; i++)
        {
            reception.remove(i);
            waiting.add(i);
        }
    }

    public void interviewRoom(Queue<Integer> reception, Queue<Integer> waiting)
    {
        int interviewperson = 0;

        for (int j = 0; j < candidates; j++)
        {
            for (int i = 0; i < waiting.size(); i++)
            {
                interviewperson = waiting.peek();
            }
            System.out.print("In the Interview Room: " + interviewperson + "\n");
            waiting.remove();
            if (reception.size() <= 0) 
            {
                System.out.println("Candidates in the Waiting hall --> " + waiting);
                System.out.println("Candidates in the Reception --> " + reception);
                System.out.println();
            } 
            else 
            {
                int temp = reception.remove();
                waiting.add(temp);
                System.out.println("Candidates in the Waiting hall --> " + waiting);
                System.out.println("Candidates in the Reception --> " + reception);
                System.out.println();
            }
        }

    }
}
