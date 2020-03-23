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
        //placeholder
        System.out.println("add shift");
    }

    public void deleteShift(){
        //placeholder
        System.out.println("delete shift");
    }


}
