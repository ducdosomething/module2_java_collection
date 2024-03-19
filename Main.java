import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Duc", 23);
        students.put("Huy", 24);
        students.put("An", 23);
        students.put("Quy", 28);
        students.put("Quan", 23);

        System.out.println("Student list: ");
        System.out.println(students);
        System.out.println("-----------------------");

        students.put("Phong", 22);
        System.out.println("Student list after add: ");
        System.out.println(students);
    }
}