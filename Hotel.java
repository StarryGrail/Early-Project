import java.util.Scanner;
public class Hotel {

   public static void main(String[]args){
   
     Scanner scanner = new Scanner(System.in);

   myMethod(scanner);
  

     scanner.close();
  }
  
       static void myMethod(Scanner scanner){


      String name1 = "Asshley";
      String id2 = "2023";
      
      System.out.println("Welcome to SioGo Hotel");

      System.out.println("Enter you Employee Name");
      String name = scanner.nextLine();

      System.out.println("Enter you Employee ID");
      String id = scanner.nextLine();

      if(!name.equals(name1) && id.equals(id2)){
        System.out.println("Invalid Employee Name");
        myMethod(scanner);

      }else if(name.equals(name1) && !id.equals(id2)){
        System.out.println("Invalid Employee ID");
        myMethod(scanner);
      }else if(!name.equals(name1) && !id.equals(id2)){
        System.out.println("Invalid Credentials");
        myMethod(scanner);
      }else{
        System.out.println("System is Ready to use");
        myMethod1(scanner);
      }

    

     }

       static void myMethod1(Scanner scanner){
      
      

      System.out.println("Selection Menu");

      System.out.println("[A] - Customer Reservation");

      System.out.println("Enter you choice");
      String menu = scanner.next();

      switch(menu){

        case "A":
          System.out.println("Customer Reservation");
          myMethod4(scanner);
          break;

        default:
           myMethod1(scanner);

      }
      
     }

       static void myMethod2(Scanner scanner){

        
         System.out.println("Kindly Press \"y\" if you wish to save the information and \"n\" if no ");
         String press = scanner.next();

         switch(press){

          case "y":
           System.out.println("Room Type Single Deluxe");
           break;

          case "n":
           System.out.println("End of Transaction");
           break;

          default:
            myMethod2(scanner);
         }
 
     }

       static void myMethod3(Scanner scanner){

        

         System.out.println("Kindly Press \"y\" if you wish to save the information and \"n\" if no ");
         String press = scanner.next();

         switch(press){

          case "y":
           System.out.println("Room Type: VIP Room");
           break;

          case "n":
           System.out.println("End of Transaction");
           break;

          default:
            myMethod3(scanner);
         }

    

     }

      static void myMethod4(Scanner scanner){

      System.out.println("1. Single Deluxed");
      System.out.println("2. VIP Room");

        System.out.println("Room Type: ");
        String room = scanner.next();
        scanner.nextLine();

      switch(room){

        case "1":
          myMethod5(scanner);
          break;

        case "2":
          
          myMethod6(scanner);
          break;

        default:
        myMethod4(scanner);

         
      }

      
     }

        static void myMethod5(Scanner scanner){
        
          System.out.println("Customer's Full Name");
          String Fname = scanner.nextLine();

          System.out.println("Enter your Address");
          String address = scanner.nextLine();

          System.out.println("Enter you Birthday MM/DD/YYYY");
          String Bday = scanner.nextLine();

          System.out.println("Enter your Marital Status");
          String Mstatus = scanner.nextLine();

          System.out.println("Enter the total number of Pax");
          int pax = scanner.nextInt();

          String Bdayy = Bday.substring(6);
          int bday = Integer.parseInt(Bdayy);

          int bdayy = 2023 - bday;

          System.out.println("Kindly Check the Information Below if it is correct.");
         
          System.out.println("First Name:                             " + Fname.substring(0,18));
          System.out.println("Middle Initial:                         " + Fname.substring(19,20));
          System.out.println("Last Name:                              " + Fname.substring(21));
          System.out.println("Address:                                " + address);
          System.out.println("Age:                                    " + bdayy);
          System.out.println("Birthday:                               " + Bday);
          System.out.println("Marital Status:                         " + Mstatus);
          System.out.println("Total Number of Pax:                    " + pax);

          myMethod2(scanner);

          double Sprice = 500.0;
          double pay = Sprice * pax;

          
          System.out.println("Total Amount to be paid: " + pay );

          System.out.println("Reservation Fee:");
          double Rfee = scanner.nextDouble();
          
          double payment = pay - Rfee;

          System.out.println("Amount to be paid: " + payment);
          System.out.println("Change: ");

          System.out.println("Thank you for choosing SioGo Hotel. Have a nice Stay!");

     }

        static void myMethod6(Scanner scanner){

      System.out.println("Customer's Full Name");
          String fname = scanner.nextLine();

          System.out.println("Enter your Address");
          String addr = scanner.nextLine();

          System.out.println("Enter you Birthday MM/DD/YYYY");
          String Bdaay = scanner.nextLine();

          System.out.println("Enter your Marital Status");
          String Mastatus = scanner.nextLine();

          System.out.println("Enter the total number of Pax");
          int paxx = scanner.nextInt();

          String Bdaayy = Bdaay.substring(6);
          int bdday = Integer.parseInt(Bdaayy);

          int bdaayy = 2023 - bdday;

          System.out.println("Kindly Check the Information Below if it is correct.");
         
          System.out.println("First Name:                             " + fname.substring(0,18));
          System.out.println("Middle Initial:                         " + fname.substring(19,20));
          System.out.println("Last Name:                              " + fname.substring(21));
          System.out.println("Address:                                " + addr);
          System.out.println("Age:                                    " + bdaayy);
          System.out.println("Birthday:                               " + Bdaay);
          System.out.println("Marital Status:                         " + Mastatus);
          System.out.println("Total Number of Pax:                  " + paxx);

          myMethod3(scanner);
          
          double Vprice = 5000.0;
          double payy = Vprice * paxx;
 

          System.out.println("Total Amount to be paid: " + payy );

          System.out.println("Reservation Fee: ");
          double Rffee = scanner.nextDouble();

          double paymentt = payy - Rffee;

          System.out.println("Amount to be paid: " + paymentt);
          System.out.println("Change: ");



          System.out.println("Thank you for choosing SioGo Hotel. Have a nice Stay!");
          
         
          
     }
   
 
}
