package collections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo
{
    ArrayList<Details> list = new ArrayList<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayListDemo object = new ArrayListDemo();
        int choice;
        do {
            System.out.println("Enter a choice: \n 1.Register\n 2.View Details");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Details details = new Details();
                    object.addDetails(details);
                    break;
                case 2:
                    object.showDetails();
                    break;
                default:
                    System.out.println("Enter a valid choice");

            }
        } while (choice != 0);
    }

    public void addDetails(Details details)
    {
        list.add(details);
    }
    public void showDetails()
    {
        for(Details i: list)
        {
            System.out.println("Name: " + i.getName());
            System.out.println("Register Number: " + i.getRegNo());
            System.out.println("Data of Birth: " + i.getDob());
            System.out.println("Address: ");
            System.out.println("Door No: " + i.getDoorNo());
            System.out.println("Street: " + i.getStreet());
            System.out.println("Area: " + i.getArea());
            System.out.println("City: " + i.getCity());
            System.out.println("State: " + i.getState());
            System.out.println("Pin Code: " + i.getPincode());

        }
    }
}

class Address
{
    int doorNo;
    String street;
    String area;
    String city;
    String state;
    int pincode;
}
class Details implements Serializable {
    Scanner in = new Scanner(System.in);
    String name;
    int regNo;
    int dob;
    Address address;

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public int getDob() {
        return dob;
    }

    public int getDoorNo() {
        return address.doorNo;
    }

    public String getStreet() {
        return address.street;
    }

    public String getArea() {
        return address.area;
    }

    public String getCity() {
        return address.city;
    }

    public String getState() {
        return address.state;
    }

    public int getPincode() {
        return address.pincode;
    }

    Details() {
        System.out.print("Name : ");
        name = in.nextLine();
        System.out.print("Register Number: ");
        regNo = in.nextInt();
        System.out.print("Date of Birth: ");
        dob = in.nextInt();
        System.out.println("Address: ");
        address = new Address();
        System.out.print("Door No: ");
        address.doorNo = in.nextInt();
        System.out.print("Street: ");
        address.street = in.nextLine();
        System.out.print("Area: ");
        address.area = in.nextLine();
        System.out.print("City: ");
        address.city = in.nextLine();
        System.out.print("State: ");
        address.state = in.nextLine();
        System.out.print("Pincode: ");
        address.pincode = in.nextInt();
    }
}
