package View;

import java.util.Scanner;

public class GetAnswer
{
    public static int ChoiceInMenu()
    {
        int choice;
        while (true)
        {
            try
            {
                Scanner in = new Scanner(System.in);
                System.out.print("--> ");
                choice = in.nextInt();
                break;
            }
            catch (Exception ex)
            {
                System.out.println("Не верный ввод, необходимо указать число от нуля и выше.");
            }
        }
        return choice;
    }

    public static String GetString()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("--> ");
        return in.nextLine();
    }
}