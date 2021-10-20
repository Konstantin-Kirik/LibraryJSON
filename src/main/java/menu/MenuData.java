package menu;

import sortLibrary.Sorting;
import writer.WriterAuthor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MenuData implements Menu {

    @Override
    public void sortData(List<WriterAuthor> sort) {
        Collections.sort(sort, new Sorting.nameAuthor());
    }

    @Override
    public List<WriterAuthor> findData(List<WriterAuthor> find) {
        List<WriterAuthor> list = new ArrayList<>();
        WriterAuthor writerAuthor = null;
        System.out.println("Введите имя поиска!");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        for (WriterAuthor w : find) {
            if (w.getName().startsWith(name)) {
                writerAuthor = new WriterAuthor(w.getName(), w.getProduct());
                list.add(writerAuthor);
            }
        }
        return list;
    }
}
