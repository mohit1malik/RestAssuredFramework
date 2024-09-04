package JavaCode.practicePrograms;

public class SingletonClass {
    private static SingletonClass instance;


    private SingletonClass(){}

    public static SingletonClass getInstance(){
        if(instance== null){
            instance =  new SingletonClass();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hellow world!");
    }
}
