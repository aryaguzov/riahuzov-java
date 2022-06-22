import util.InputUtil;

import java.util.Arrays;

import static util.InputUtil.close;
import static util.InputUtil.outputDescriptionAndReadLine;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("Задание 3: на входе есть числовой массив, необходимо вывести элементы массива кратные 3");
        int[] array = parseAndConvert(outputDescriptionAndReadLine("Введите массив целых чисел через пробел:"));
        filterAndPrint(array);
        System.out.println("Задание 3 завершено.");
        close();
    }

    private static void filterAndPrint(int[] array) {
        Arrays.stream(array)
                .filter(num -> num != 0 && num % 3 == 0)
                .forEach(System.out::println);
    }

    private static int[] parseAndConvert(String line) {
        return Arrays.stream(line.split(" "))
                .mapToInt(InputUtil::parse)
                .toArray();
    }
}
