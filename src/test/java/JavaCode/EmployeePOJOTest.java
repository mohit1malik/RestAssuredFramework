package JavaCode;

public class EmployeePOJOTest {

    public static void main(String args[]){
        EmployeePOJO obj = new EmployeePOJO();

        obj.setID(1);
        obj.setName("Mohit");

        System.out.println(obj.getID());
        System.out.println(obj.getName());

    }
}
