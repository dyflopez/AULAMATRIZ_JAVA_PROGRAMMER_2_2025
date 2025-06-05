package exceptiosPlus;

//Checked
//debe ser manejado por el desarroolador ya sea un throw o un try/catch
public class MyCheckedException extends Exception{
    public MyCheckedException(String message) {
        super(message);
    }

    public MyCheckedException(String message, Throwable cause) {
        super(message, cause);
    }
}
