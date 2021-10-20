package parser;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import dataWriter.DataWriter;
import menu.MenuData;
import writer.WriterAuthor;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParserWriter {

    public static final String DATA = "data";
    public static final String DATA_JSON = "D://Study//Java//Library//src//main//resources//library.json";
    public static final String NAME = "name";
    public static final String PRODUCT = "product";

    public DataWriter parser() {
        ObjectMapper mapper = new ObjectMapper();
        DataWriter dataWriter = new DataWriter(null);
        MenuData menuData = new MenuData();

        List<WriterAuthor> dataWriterList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(DATA_JSON);
            JsonNode jsonNode = mapper.readValue(fileReader, JsonNode.class);
            JsonNode data = jsonNode.get(DATA);
            for (JsonNode node : data) {
                List<String> list = new ArrayList<>();
                String name = node.get(NAME).asText();
                JsonNode jsonArray = node.get(PRODUCT);
                for (JsonNode node1 : jsonArray) {
                    String str = node1.asText();
                    list.add(str);
                }
                WriterAuthor writerAuthor = new WriterAuthor(name, list);
                dataWriterList.add(writerAuthor);
            }
            System.out.println("1.Вывести весь список.");
            System.out.println("2.Поиск по автору.");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            switch (num) {
                case 1 -> {
                    menuData.sortData(dataWriterList);
                    dataWriter.setWriterList(dataWriterList);
                }
                case 2 ->
                    dataWriter.setWriterList(menuData.findData(dataWriterList));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataWriter;
    }
}
