package academy.belhard;

public class MyCheckedException extends RuntimeException {

    public MyCheckedException() {
        super("Проверяемое исключение");
    }
}
