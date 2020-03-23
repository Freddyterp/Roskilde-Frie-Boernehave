import java.util.ArrayList;

public class login
{
    public static ArrayList<String> Usernames = new ArrayList<String>();
    public static ArrayList<String> Passwords = new ArrayList<String>();

    public login()
    {
        Usernames.add("Chairman");
        Usernames.add("Accountant");
        Usernames.add("Coach");
        Passwords.add("Chairman");
        Passwords.add("Accountant");
        Passwords.add("Coach");
    }


    public int checkInfo(String username, String password)
    {
        for (int i = 0; i < Usernames.size(); i++)
        {
            if(username.equals(Usernames.get(i)))
            {
                if(password.equals(Passwords.get(i)))
                {
                    return i;
                }
                else
                {
                    return 4;
                }
            }
        }
        return 4;
    }
}