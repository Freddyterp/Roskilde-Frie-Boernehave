import java.util.*;
public class Menu 
{
   private static Input in = new Input();
   private static login lg = new login();
   private static Files newFile = new Files();



   public static void startMenu()
   {
      boolean isProgramRuning = true;
      do
      {
         System.out.println("Welcome to Roskildes frie boernehus.");
         System.out.println("1.) Login");
         System.out.println("2.) End Program");
         int Choice = in.getInt();
         switch(Choice)
         {
            case 1:
               System.out.println("Username: ");
               String Username = in.getString();
               System.out.println("Password: ");
               String Password = in.getString();
      
               int account = lg.checkInfo(Username, Password);
               switch(account)
               {
                  case 0:
                     //print main menu
                  break;

                  default:
                     System.out.println("Username or password are wrong");
                     break;
               }
               break;
            case 2:
               isProgramRuning = false;
               break;
         }
      }while (isProgramRuning == true);
   }

}
