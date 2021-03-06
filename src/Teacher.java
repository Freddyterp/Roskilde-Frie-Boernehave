import java.util.ArrayList;

public class Teacher {
    //attributes
    private String firstName;
    private String lastName;
    private int id;
    private int salary;
    ArrayList<Shift> shiftArray = new ArrayList<>();

    public ArrayList<Shift> getShiftArray() {
        return shiftArray;
    }

    public Teacher(String firstName, String lastName, int id, int salary )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }
    public void addShift(int weekNumber, String weekDay, int startTime, int endTime){
        shiftArray.add( new Shift(weekNumber, weekDay, startTime, endTime));
    }

    public void deleteShift(int weekNr, String day, int startTime){

        int i;
        for (i = 0; i <= shiftArray.size(); i++) {
            if(shiftArray.get(i).getWeekNumber() == weekNr &&
                    shiftArray.get(i).getDay().equals(day) &&
                    shiftArray.get(i).getStartOfShift() == startTime ){
                break;
            }

        }

        this.shiftArray.remove(i);

        System.out.println(shiftArray.toString());
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getId() {
        return id;
    }

    public int getSalary() {return salary;}

    public void setSalary(int salary) {this.salary = salary;}

    public void setId(int id) {
        this.id = id;
    }
}
