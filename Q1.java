class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    int rollNo;
    String name;
    int age;
    String course;

    public Student(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {

        // Age validation
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21");
        }

        // Name validation (only letters, proper spacing)
        if (!name.matches("[a-zA-Z]+( [a-zA-Z]+)*")) {
            throw new NameNotValidException("Name should not contain numbers or special characters");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Valid student
            Student s1 = new Student(101, "Ramesh Kumar", 20, "Computer Science");
            s1.display();

            System.out.println();

            // Invalid student (will trigger exception)
            Student s2 = new Student(102, "R@mesh123", 22, "IT");
            s2.display();

        } catch (AgeNotWithinRangeException e) {
            System.out.println("Age Exception: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Name Exception: " + e.getMessage());
        }
    }
}
