import java.io.*;
import java.util.*;

class Files
{

    // Create new file
    private static File database = new File("workHours.txt");
    private String filename = database.getName();
    ArrayList<Teacher> teacherArray;

    public Files(ArrayList<Teacher> arr)
    {
        this.teacherArray = arr;

        try
        {
            File fileLoad = new File(filename);
            Scanner read = new Scanner(fileLoad);

            while(read.hasNext())
            {
                int ID = read.nextInt();
                int weekNr = read.nextInt();
                String weekDay = read.next();
                int startTime = read.nextInt();
                int endTime = read.nextInt();

                for(Teacher teacher : teacherArray)
                {
                    if(teacher.getId() == ID)
                    {
                        teacher.addShift(weekNr, weekDay, startTime, endTime);
                    }
                }

            }
            read.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public boolean saveFile()
    {
        try
        {
            PrintStream save = new PrintStream((new File(filename)));
            for (Teacher teacher : teacherArray)
            {
                for(Shift shift : teacher.getShiftArray())
                {
                    save.println(teacher.getId());
                    save.println(shift.getWeekNumber());
                    save.println(shift.getDay());
                    save.println(shift.getStartOfShift());
                    save.println(shift.getEndOfShift());
                }
            }
            save.close();
        } catch (IOException e)
        {
            System.out.println("ERROR: File NOT saved!");
            return false;
        }

        return true;
    }
}