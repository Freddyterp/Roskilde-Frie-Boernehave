import java.util.*;
public class Menu 
{
   private static Input in = new Input();
   private static login lg = new login();

   public ArrayList<Teacher> getTeacherArray() {
      return teacherArray;
   }

   static ArrayList<Teacher> teacherArray = new ArrayList<>();


   public Menu() {
      Teacher t1 = new Teacher("Theis", "Nielsen", 0);
      Teacher t2 = new Teacher("Benjamin", "Prehn", 1);
      Teacher t3 = new Teacher("Mudi", "kabab", 2);
      Teacher t4 = new Teacher("Freddy", "Terp", 3);
      teacherArray.add(t1);teacherArray.add(t2);teacherArray.add(t3);teacherArray.add(t4);
   }

   public static void startMenu() {
      Menu menu = new Menu();
      Files newFile = new Files(teacherArray);
      boolean isProgramRuning = true;
      do {
         System.out.println("Welcome to Roskildes frie boernehus.");
         System.out.println("1.) Login");
         System.out.println("2.) End Program");
         int choice;
            try {
               choice = in.getInt();

            switch (choice) {
               case 1:
                  System.out.println("Username: ");
                  String Username = in.getString();
                  System.out.println("Password: ");
                  String Password = in.getString();

                  int account = lg.checkInfo(Username, Password);

                  if (account == 0) {
                     menu.printMainMenu();
                     newFile.saveFile();
                  } else {
                     System.out.println("Username or password are wrong");

                  }
                  break;
               case 2:
                  isProgramRuning = false;
                  break;


            }
            }
            catch(Exception e){
               System.out.println("Invalid input, try again");
               in.getString();
            }
         } while (isProgramRuning) ;


   }

   public void printMainMenu(){
      System.out.println("Main Menu");
      System.out.println("1) Salary");
      System.out.println("2) Schedule");
      System.out.println("3) Log out");


      int mainChoice = in.getInt();
      switch(mainChoice){
         case 1:
            Salary sal = new Salary();
            sal.printMenu();
            break;

         case 2:
            Schedule sched = new Schedule(teacherArray);
            sched.printMenu();
            break;
         case 3:
            startMenu();
            break;

      }

   }

}
