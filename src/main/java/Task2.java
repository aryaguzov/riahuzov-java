import static util.InputUtil.outputDescriptionAndReadLine;

public class Task2 {
    private static final String DEFAULT_NAME = "Вячеслав";

    public static void main(String[] args) {
        System.out.println("Задание 2: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, " +
                "если нет, то вывести \"Нет такого имени\"");
        String name = outputDescriptionAndReadLine("Введите имя:");
        checkAndPrint(name);
        System.out.println("Задание 2 завершено.");
    }

    private static void checkAndPrint(String name) {
        if (name.equals(DEFAULT_NAME)) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
