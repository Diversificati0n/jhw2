package java_homework2;
import java.io.File;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

//1. Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
//Если значение null, то параметр не должен попадать в запрос.
//Пример 1:
//Параметры для фильтрации: {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"}
//Результат: SELECT * FROM USER WHERE name = 'Ivanov' and country = 'Russia' and city = 'Moscow';
//Пример 2:
//Параметры для фильтрации: {"name:null", "country:null", "city:null", "age:null"}
//Результат: SELECT * FROM USER;

    //    public static void main(String[] args) {
//        String filterParams = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":null}";
//        StringBuilder whereClause = new StringBuilder("SELECT * FROM students WHERE ");
//        JSONParser parser = new JSONParser();
//
//        try {
//            JSONObject params = (JSONObject) parser.parse(filterParams);
//            boolean first = true;
//
//            for (Object key : params.keySet()) {
//                Object value = params.get(key);
//                if (value != null) {
//                    if (!first) {
//                        whereClause.append(" and ");
//                    }
//                    whereClause.append(key).append(" = '").append(value).append("'");
//                    first = false;
//                }
//            }
//
//            System.out.println(whereClause.toString());
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//    }
//__________________________________________________________________________________________________________

//2.Напишите метод, который определит тип (расширение) файлов из текущей папки и
//выведет в консоль результат вида:
//1 Расширение файла: txt
//2 Расширение файла: pdf
//3 Расширение файла:
//4 Расширение файла: jpg

    public static void main(String[] args) {
        File directory = new File(".");
        File[] files = directory.listFiles();

        if (files != null) {
            int count = 1;
            for (File file : files) {
                String fileName = file.getName();
                int dotIndex = fileName.lastIndexOf('.');
                String extension = dotIndex == -1 ? "" : fileName.substring(dotIndex + 1);

                System.out.println(count++ + " Расширение файла: " + extension);
            }
        }
    }
}
