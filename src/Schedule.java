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
        }while(ScheduleMenu);
    }

    public void viewShift(){
        //placeholder
        System.out.println("View schedule");
        for(Teacher teach : teacherArray)
        {
            System.out.println(teach.getShiftArray());
        }
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
        int id = in.getInt();
        System.out.println("Week");
        int week = in.getInt();
        System.out.println("DAy");
        String day = in.getString();
        System.out.println("Start of shift");
        int startTime = in.getInt();


        for (Teacher teach: teacherArray) {
            if(teach.getId() == id) {
                teach.deleteShift(week, day, startTime);
            }
        }



    }


}
