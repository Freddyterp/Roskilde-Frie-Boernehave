import java.util.ArrayList;

public class Salary {

    Input in = new Input();

    ArrayList<Teacher> teacherArray;

    public void printMenu(ArrayList<Teacher> arr){

        this.teacherArray = arr;
        boolean salaryMenu = true;

        do {

            System.out.println("Salary menu");
            System.out.println("1) View salary");
            System.out.println("2) Edit salary");
            System.out.println("3) Main Menu");
            int choice = in.getInt();
            switch (choice) {
                case 1:
                    viewSalary();
                    break;
                case 2:
                    editSalary();
                    break;
                case 3:
                    salaryMenu = false;
                    break;
            }

        }while (salaryMenu);
    }

    public void viewSalary()
    {
        System.out.println("View salary");
        System.out.println("Employee ID: ");
        int ID = in.getInt();
        System.out.println("Week: ");
        int WeekNr = in.getInt();

        for(Teacher teach : teacherArray)
        {
            if(teach.getId() == ID)
            {
                int WeekSalary = 0;
                for(Shift shift : teach.getShiftArray())
                {
                    if(shift.getWeekNumber() == WeekNr)
                    {
                        System.out.println("Week Day: " + shift.getDay());
                        System.out.println("Shift start time: " + shift.getStartOfShift());
                        System.out.println("Shift end time: " + shift.getEndOfShift());
                        WeekSalary += (shift.getEndOfShift() - shift.getStartOfShift()) * 100;
                    }
                }
                System.out.println("Salary for that week: " + WeekSalary);
                System.out.println();
            }
        }
    }

    public void editSalary()
    {
        System.out.println("Edit salary");
    }

    //slet og opret?
}
