package JavaCode;

public class SingletonTest {
    public static void main(String args[]) {
        SingletonClass object = SingletonClass.getInstance();

        object.showMessage();

    }
}
