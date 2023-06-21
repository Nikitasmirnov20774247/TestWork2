package Classes;

public class Counter implements AutoCloseable
{
    private static int counter = 0;

    public Counter() {

    }

    public static int getCounter()
    {
        return counter;
    }

    public void add() throws RuntimeException
    {
        if (counter == 20) throw new RuntimeException("Достигнуто максимальное количество животных");
        int tmp = counter;
        counter ++;
        if (tmp == counter) throw new RuntimeException("Увеличение счётчика не произошло");
    }

    @Override
    public void close() throws RuntimeException {

    }
}