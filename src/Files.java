import java.io.*;
import java.util.*;

class Files
{

    // Create new file
    private static File database = new File("workHours.dat");
    private String filename = database.getName();
    Input in = new Input();

    public Files(ArrayList<Teacher> arr)
    {
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

                for(Teacher teacher : arr)
                {
                    if(teacher.getID() = ID)
                    {

                    }
                }
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}