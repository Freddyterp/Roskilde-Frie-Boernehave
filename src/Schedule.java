import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Schedule {
    Input in = new Input();
    ArrayList<Teacher> teacherArray = new ArrayList<>();

    public Schedule(ArrayList<Teacher> teacherArray) {
        this.teacherArray = teacherArray;
    }


    public void printMenu(){
        System.out.println("Schedule menu");
        System.out.println("1) View schedule");
        System.out.println("2) Add shift");
        System.out.println("3) Delete shift");
        System.out.println("4) Main menu");
        int choice = in.getInt();
        switch(choice) {
            case 1:
                viewShift();
                break;

            case 2:
                addShift(teacherArray);
                break;

            case 3:
                deleteShift();
                break;
            case 4:
                Menu menu = new Menu();
                menu.printMainMenu();
                break;
        }
    }

    public void viewShift(){
        //placeholder
        System.out.println("View schedule");

    }

    public void addShift(ArrayList<Teacher> arr){



        System.out.println("ID:");
        int id = in.getInt();



        System.out.println("Week Number:");
        int weekNumber = in.getInt();


        System.out.println("Day of the week:");
        String dayOfTheWeek = in.getString();


        System.out.println("Start time of the shift:");
        int startTime = in.getInt();


        System.out.println("End time of the shift: ");
        int endTime = in.getInt();

        for (Teacher teacher : arr) {
            if (teacher.getId() == id) {
                teacher.addShift(weekNumber, dayOfTheWeek, startTime, endTime);

            }

        }

    }

    public void deleteShift(){
        //refactor
        System.out.println("id");
        int choice = in.getInt();
        int id = choice;
        System.out.println("Week");
        choice = in.getInt();
        int week = choice;
        System.out.println("DAy");
        String stringChoice = in.getString();
        String day = stringChoice;
        System.out.println("Start of shift");
        choice = in.getInt();
        int startTime = choice;
        System.out.println("end of shift");
        choice = in.getInt();
        int endOfShift = choice;


        for (Teacher teach: teacherArray) {
            if(teach.getId() == id) {
                teach.deleteShift(week, day, startTime);
            }
        }



    }


}
