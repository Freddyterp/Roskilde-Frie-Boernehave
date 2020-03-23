public class Salary {

    Input in = new Input();

    public void printMenu(){
        System.out.println("Salary menu");
        System.out.println("1) View salary");
        System.out.println("2) Edit salary");
        System.out.println("3) Main Menu");
        int choice = in.getInt();
        switch(choice){
            case 1:
                viewSalary();
                break;
            case 2:
                editSalary();
                break;
            case 3:
                Menu menu = new Menu();
                menu.printMainMenu();
                break;
        }


    }

    public void viewSalary(){
        System.out.println("View salary");
    }

    public void editSalary(){
        System.out.println("Edit salary");
    }

    //slet og opret?
}
