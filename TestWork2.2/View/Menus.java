package View;

import Classes.Animal;
import java.util.LinkedList;

public class Menus
{
    public static void MainMenu(String str)
    {
        if(str == "Main")
        {
            System.out.println("Вы можете оствить ваше животное на время или обучить новым коммандам:\n1. Оставить животное\n2. Обучить животное\n3. Посмотреть список животных в питомнике\n4. Выбрать животное, для просмотра списка известных команд\n0. Уйти\n");
        }
        if(str == "TypeAnimal")
        {
            System.out.println("Мы занимаемся следующими животными, какое вы хотите добавить:\n1. Домашними животными\n2. Вьючными животными\n0. Назад\n");
        }
        if(str == "ShowKindPets")
        {
            System.out.println("Наши питомник имеет условия для приёма следующих домашних животных:\n1. Собаки\n2. Кошки\n3. Хомячки\n0. Назад\n");
        }
        if(str == "ShowKindPackAnimals")
        {
            System.out.println("Наши питомник имеет условия для приёма следующих вьючных животных:\n1. Лошади\n2. Ослы\n3. Верблюды\n0. Назад\n");
        }
    }

    public static void ShowListAnimals(LinkedList<Animal> lstAnimals)
    {
        String divider = "-".repeat(80);
        System.out.println(divider);
        System.out.printf("| %7s | %20s | %20s | %20s |\n", "номер", "имя", "тип животного", "вид животного");
        System.out.println(divider);
        for (int i = 0; i < lstAnimals.size(); i++)
        {
            System.out.printf("| %7s | %20s | %20s | %20s |\n", i, lstAnimals.get(i).getName(), lstAnimals.get(i).getTypeAnimal(), lstAnimals.get(i).getKindAnimal());
            System.out.println(divider);
        }
    }

    public static void ShowListMakeCommands(Animal animal)
    {
        System.out.println(animal.getName() + " может выполнять следующие команды:");
        for (int i = 0; i < animal.getCommands().size(); i++)
        {
            System.out.printf("\t%d. %s%n", i, animal.getCommands().get(i));
        }
        System.out.println();
    }
}