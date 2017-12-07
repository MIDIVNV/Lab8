import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;


public class  Lab8
{

    public static void main(String args[]) throws IOException
    {

        ArrayList<String> obj = new ArrayList<>();

        System.out.println("Добавление и удаление элементов: ");
        obj.add("Diana");
        obj.add("Student");
        obj.add("Student");
        obj.add("Diana1");
        obj.add("Diana2");
        obj.add("Diana3");
        System.out.println("Список:"+obj);

        obj.add(0, "Диана");
        obj.add(1, "гр.573902");
        System.out.println("Список после добавления элементов:"+obj);

        //Remove elements
        obj.remove("Диана");
        obj.remove("гр.573902");
        System.out.println("Список после удаления:"+obj  +"\n");


        System.out.println("Поиск повторений: ");
        HashMap<String, Integer> letters = new HashMap<String, Integer>();
        for (int i = 0; i < obj.size(); i++)
        {
            String tempChar = obj.get(i);
            if (!letters.containsKey(tempChar))
            {
                letters.put(tempChar, 1);
            }
            else
            {
                letters.put(tempChar, letters.get(tempChar) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : letters.entrySet()) {
            System.out.println(""+ entry.getKey() + ", Количество повторений этого слова  = " + entry.getValue());
        }

        System.out.println("\n" + "Перестановка элементов элементов: ");
        Collections.reverse(obj);
        System.out.println("После изменения" + obj +"\n");

        System.out.println("Статистика по всем элементам: ");

                System.out.println("Самое длинное слово: "+ Collections.max(obj));
                System.out.println("Самое короткое слово: " + Collections.min(obj));


        System.out.println("\n" + "Список после сортировки");
        Comparator<String> byLength = new Comparator<String>()
        {
            public int compare (String s1, String s2)
            {
                return s1.length () - s2.length ();
            }
        };
        Collections.sort(obj, byLength);
        System.out.println(obj);

    }
}

