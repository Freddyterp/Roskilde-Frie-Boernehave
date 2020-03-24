public class Schedule {
    Input in = new Input();

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
                addShift();
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

    public void addShift(){

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

    }

    public void deleteShift(){
        //placeholder
        System.out.println("delete shift");
    }


}
