package academy.belhard;

public class MyUncheckedException extends RuntimeException {

    public MyUncheckedException() {
        super("Непроверяемое исключение");
    }
}
