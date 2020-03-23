import java.util.Scanner;

public class Input
{
    Scanner in = new Scanner(System.in);

    String getString()
    {
        return in.next();
    }

    int getInt()
    {
        return in.nextInt();
    }

    float getFloat()
    {
        return in.nextFloat();
    }

    double getDouble()
    {
        return in.nextDouble();
    }

    char getChar()
    {
        return in.next().charAt(0);
    }

    byte getByte()
    {
        return in.nextByte();
    }

    boolean getBool()
    {
        return in.nextBoolean();
    }

    long getLong()
    {
        return in.nextLong();
    }

    short getShort()
    {
        return in.nextShort();
    }
}