import java.util.Scanner;
import java.util.Stack;
public class CustomerCare
{
    Scanner sc= new Scanner(System.in);
    Stack<String> services = new Stack<>();
    public static void main(String[] args)
    {
        CustomerCare myObj= new CustomerCare();
      myObj.selectLanguage();
      System.out.println(myObj.services);
    }

    void selectLanguage()
    {
        System.out.println("Choose your Language: \n 1.Tamil \n 2.English");
        int choice= sc.nextInt();
        sc.nextLine();
        switch(choice)
        {
            case 1:
                services.push("Tamil");
                tamilMenu();
                break;

            case 2:
                services.push("English");
                englishMenu();
                break;

        }
    }

    void tamilMenu()
    {
      System.out.println("ஒரு தேர்வை உள்ளிடவும்: \n 1.ரீசார்ஜ் \n 2.பாலன்ஸ்\n 3.சலுகைகள்\n 9.பின் செல்ல\n 0.வெளியேறு");
      int option= sc.nextInt();
      switch(option)
      {
          case 1:
              services.push("ரீசார்ஜ்");
              tamilRecharge();
              break;
          case 2:
              services.push("பாலன்ஸ்");
              tamilBalance();
              break;

          case 3:
              services.push("சலுகைகள");
              break;
          case 9:
              System.out.println(services);
              services.pop();
              System.out.println("After Pop: " + services);
              selectLanguage();
              break;
          case 0:
              System.out.println("Thanks for visiting");
              break;
      }
    }

    void englishMenu()
    {
        System.out.println("Enter an option: \n 1.Recharge \n 2.Balance\n 3.Offers\n 9.Back\n 0.Exit");
        int option= sc.nextInt();
        switch(option)
        {
            case 1:
                services.push("Recharge");
                englishRecharge();
                break;

            case 2:
                services.push("Balance");
                englishBalance();
                break;

            case 3:
                services.push("Offers");
                break;

            case 9:
                System.out.println(services);
                services.pop();
                System.out.println("After Pop: " + services);
                selectLanguage();
                break;

            case 0:
                System.out.println("Thanks for visiting ");
                break;
        }
    }
    void tamilRecharge()
    {
        System.out.println("ஒரு தேர்வை உள்ளிடவும்:\n 1.901: 3GB/D + UL,70D\n 2.839: 2GB/D + UL,84D\n " +
                "3.478: 2GB/D + UL,56D\n 4.299: 2GB/D + UL, 28D\n 9.பின் செல்ல\n 0.வெளியேறு\n");
        int option= sc.nextInt();
        sc.nextLine();
        switch(option)
        {
            case 1:
                System.out.println("901 பேக் செயல்படுத்தப்பட்டது");
                break;
            case 2:
                System.out.println("839 பேக் செயல்படுத்தப்பட்டது");
                break;
            case 3:
                System.out.println("478 பேக் செயல்படுத்தப்பட்டது");
                break;
            case 4:
                System.out.println("299 பேக் செயல்படுத்தப்பட்டது");
                break;
            case 9:
                services.pop();
                tamilMenu();
                break;
            case 0:
                System.out.println("வருகைக்கு நன்றி");
                break;
        }
    }
    void englishRecharge() {
        System.out.println("Enter an option:\n 1.901: 3GB/D + UL,70D\n 2.839: 2GB/D + UL,84D\n " +
                "3.478: 2GB/D + UL,56D\n 4.299: 2GB/D + UL, 28D\n 9.பின் செல்ல\n 0.வெளியேறு\n");
        int option = sc.nextInt();
        sc.nextLine();
        switch (option) {
            case 1:
                System.out.println("901 Pack Activated");
                break;
            case 2:
                System.out.println("839 Pack Activated");
                break;
            case 3:
                System.out.println("478 Pack Activated");
                break;
            case 4:
                System.out.println("299 Pack Activated");
                break;
            case 9:
                services.pop();
                englishMenu();
                break;
            case 0:
                System.out.println("Thanks for Visiting");
                break;
        }
    }
    void tamilBalance()
    {
        System.out.println("ஒரு தேர்வை உள்ளிடவும்: \n 1.Talktime Balance\n 2.Data Balance\n 9.பின் செல்ல\n 0.வெளியேறு\n");
        int option= sc.nextInt();
        switch(option)
        {
            case 1:
                System.out.println("Your Talktime balance is: ");
                break;
            case 2:
                System.out.println("Your Data Balance is: ");
                break;
            case 9:
                services.pop();
                tamilMenu();
                break;
            case 0:
                System.out.println("வருகைக்கு நன்றி");
                break;
        }
    }
    void englishBalance()
    {
        System.out.println("Enter an option: \n 1.Talktime Balance\n 2.Data Balance\n 9.Back\n 0.Exit)");
        int option= sc.nextInt();
        switch(option)
        {
            case 1:
                System.out.println("Your Talktime balance is: ");
                break;
            case 2:
                System.out.println("Your Data Balance is: ");
                break;
            case 9:
                services.pop();
                englishMenu();
                break;
            case 0:
                System.out.println("Thanks for visiting");
                break;
        }
    }

}

