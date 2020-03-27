import java.util.ArrayList;


public class Schedule {
    Input in = new Input();
    ArrayList<Teacher> teacherArray;

    public Schedule(ArrayList<Teacher> teacherArray) {
        this.teacherArray = teacherArray;
    }


    public void printMenu(){
        boolean ScheduleMenu = true;
        do {


            System.out.println("Schedule menu");
            System.out.println("1) View schedule");
            System.out.println("2) Add shift");
            System.out.println("3) Delete shift");
            System.out.println("4) Main menu");
            try {
                int choice = in.getInt();
                switch (choice) {
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
                        ScheduleMenu = false;
                        break;
                }
            }
            catch(Exception e){
                System.out.println("Invalid input");
                System.out.println();
                in.getString();
            }
        }while(ScheduleMenu);
    }

    public void viewShift(){

        System.out.println("Select employee to view");

        int i = 0;
        for(Teacher teach : teacherArray)
        {
            i++;
            System.out.println(i + ") id: " +teach.getId() + " " + teach.getFirstName() + " " + teach.getLastName());

        }

        int choice = in.getInt();
        switch(choice){
            case 1:
                teacherArray.get(0).printShifts();
                break;
            case 2:
                teacherArray.get(1).printShifts();
                break;
            case 3:
                teacherArray.get(2).printShifts();
                break;
            case 4:
                teacherArray.get(3).printShifts();
                break;

        }
        System.out.println();

    }

    public void addShift(ArrayList<Teacher> arr){

        int id;

        System.out.println("Select employee to assign shift");

        id = selectTeacher();

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
        int index;

        System.out.println("Select employee from whom you are removing a shift");

        index = selectTeacher();

        teacherArray.get(index).printShifts();

        int choice = in.getInt();
        teacherArray.get(index).shiftArray.remove(choice - 1);

    }

    private int selectTeacher() {
        int id = -1;
        int i = 0;
        for(Teacher teach : teacherArray)
        {
            i++;
            System.out.println(i + ") id: " +teach.getId() + " " + teach.getFirstName() + " " + teach.getLastName());

        }

        int choice = in.getInt();

        switch(choice){
            case 1:
                id = 0;
                break;
            case 2:
                id = 1;
                break;
            case 3:
                id = 2;
                break;
            case 4:
                id = 3;
                break;

        }
        return id;
    }


}
