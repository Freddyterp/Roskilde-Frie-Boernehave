import java.io.*;
import java.util.*;

class Files {



// Creating new File
   private static File database = new File("Database.txt");
   
// ArrayList which contains our members
   private static ArrayList<Members> memberList = new ArrayList<Members>();
   private String fileName = database.getName();
   Input in = new Input();
      
      
   
// Constructor for the class Files which loads the file if its exists. 
 public Files() 
 {
      // int a = 0; 
     
      try {
         File fileLoad = new File(fileName);
         Scanner read = new Scanner(fileLoad);
         // Loop which runs as long the file contains data. 
         while(read.hasNext()){
            String firstName = read.next();
            String lastName = read.next();
            int age = read.nextInt();
            String address = read.next();
            boolean passive = read.nextBoolean();
            boolean competition = read.nextBoolean();
            int result = read.nextInt();
            boolean debt = read.nextBoolean();
            Members id = new Members(firstName, lastName, age, address, passive, competition, result, debt);
            memberList.add(id);
         }
         read.close();
      } catch(IOException i) {
         i.printStackTrace();
         return;
      }
      
      System.out.println("MemberList size: " + memberList.size());

}
   
   
// Method to save contacts to a file

   public boolean saveMembers() {
     
      try {
         File fileSave = new File(fileName);
         PrintStream save = new PrintStream(fileSave);
         for (Members mem : memberList) {
            save.println(mem.firstName);
            save.println(mem.lastName);
            save.println(mem.age);
            save.println(mem.address);
            save.println(mem.getPassive());
            save.println(mem.getCompetition());
            save.println(mem.getResult());
            save.println(mem.getDebt());
         }
         save.close();
      } catch(IOException i) {
         System.out.println("ERROR: File NOT saved!");
         return false;
      }
     
      return true;
   }
     
// Method to show all members in arrayList      
   
   public void showMembers() {
      
      int index = 0; 
      
      for (Members mem : memberList){
      
         System.out.println("Index# "+ index);
         index++;  
         System.out.println("FirstName: " + mem.firstName);
         System.out.println("LastName: " + mem.lastName);
         System.out.println("Age: " + mem.age+" år");
         System.out.println("Address: "+ mem.address);
         System.out.println("Passive: " + mem.getPassive());
         System.out.println("Competetion: " + mem.getCompetition());
         System.out.println("Best Result in seconds: " + mem.getResult()); 
         System.out.println("---------------------");
      
      }
   }
   
// Delete member
   public void deleteMember(int index) {
      this.memberList.remove(index);
   }
// Add new member
   public void addMember(Members id) {
      this.memberList.add(id);
   }
   
// Edit Member
   public void editMember(int index) 
   {
      memberList.set(index, createMember());
      
   }   

   private Members createMember(){
      System.out.print("Firstname: ");
      String firstName = in.getString();
      System.out.print("Lastname: ");
      String lastName = in.getString();
      System.out.print("Age: ");
      int age = in.getInt();
      System.out.print("Address: ");           
      String address = in.getString();
      System.out.print("Passive: ");
      boolean passive = in.getBool();
      System.out.print("Competition: ");
      boolean competition = in.getBool();
      System.out.print("Best Result in seconds: ");
      int result = in.getInt();
      Members id = new Members(firstName,lastName,age,address,passive,competition,result, false);
      
      return id;

}
   
   public static ArrayList viewMemberList(){
      return memberList;
   }

   
}