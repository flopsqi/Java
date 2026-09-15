import java.util.ArrayList;
import java.util.Collections;
public class Pr8 {
    public static void main(String[] args){
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Поспать");
        tasks.add("Попить");
        tasks.add("Поесть");
        System.out.println(tasks);
        tasks.remove(1);
        if (tasks.contains("Поспать"))
            System.out.println("Ваша задача есть в списке");
        else
            System.out.println("Вашей задачи в списке нет!");
        Collections.sort(tasks);
        System.out.println(tasks);
    }
}

