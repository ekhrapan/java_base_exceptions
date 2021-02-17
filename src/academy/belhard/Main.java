package academy.belhard;

public class Main {

    public static void main(String[] args) {
        nothing(0);


        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        log("[Корректное поведение]");
        try {
            int lastElement = array[array.length - 1];
            log("Последний элемент последовательности = " + lastElement);
        } catch (IndexOutOfBoundsException e) {
            log("ОШИБКА: Выход за пределы массива");
        }

        emptyLines(2);

        log("[Обработка исключения]");
        try {
            // Конфликта имен не происходит, т.к. каждый try имеет свою облать видимости
            int lastElement = array[15];
            log("Последний элемент последовательности = " + lastElement);
        } catch (NullPointerException e) {
            log("ОШИБКА: Выход за пределы массива");
        }

        emptyLines(2);

//        log("[Без обработки исключения]");
//        int lastElement = array[3];
//        log("Последний элемент последовательности = " + lastElement);
//
//        log("Программа завершена"); // Не будет выведена !!!
    }

    public static void log(String message) {
        System.out.println(message);
    }

    public static void emptyLines(int emptyLinesCount) {
        for (int i = 0; i < emptyLinesCount; i++) {
            System.out.println();
        }
    }

    public static void nothing(int n) throws MyCheckedException {
            if (n == 0) {
                throw new MyCheckedException();
            }
    }

    public static void print(Object o) {


        String s = null;
        s = (String) o;
        System.out.println(s);

//        try {
//
//
//        } catch (ClassCastException e) {
//            log(e.getMessage());
//        } catch (IndexOutOfBoundsException e) {
//            log("Error!");
//        } catch (Exception e) {
//            log("scbs");
//        }


    }
}
