import java.util.*;

class StudentMap {
    HashMap<String, Integer> map = new HashMap<>();

    void addStudent(String name, int grade) {
        map.put(name, grade);
    }

    void removeStudent(String name) {
        map.remove(name);
    }

    void displayGrade(String name) {
        if (map.containsKey(name)) {
            System.out.println(name + " -> " + map.get(name));
        } else {
            System.out.println("Student not found");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        StudentMap sm = new StudentMap();

        sm.addStudent("Ramesh", 85);
        sm.addStudent("Suresh", 90);

        sm.displayGrade("Ramesh");

        sm.removeStudent("Ramesh");

        sm.displayGrade("Ramesh");
    }
}
