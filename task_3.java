import java.util.ArrayList;
import java.util.Collections;

public class StringArrayManager {
    // Список для хранения строк
    private ArrayList<String> strings;

    // Конструктор для инициализации пустого списка
    public StringArrayManager() {
        strings = new ArrayList<>();
    }

    // Метод для добавления строки
    public void addString(String str) {
        strings.add(str);
        Collections.sort(strings, (a, b) -> Integer.compare(a.length(), b.length())); // Сортировка строк по длине
    }

    // Метод для нахождения максимальной по длине строки
    public String getMaxLengthString() {
        if (strings.isEmpty()) {
            return null; // Если список пуст, возвращаем null
        }
        return strings.get(strings.size() - 1); // Максимальная строка будет в конце
    }

    // Метод для вычисления средней длины строк
    public double getAverageLength() {
        if (strings.isEmpty()) {
            return 0; // Если список пуст, возвращаем 0
        }
        int totalLength = 0;
        for (String str : strings) {
            totalLength += str.length();
        }
        return (double) totalLength / strings.size(); // Средняя длина
    }

    // Метод для вывода всех строк
    public void printStrings() {
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
