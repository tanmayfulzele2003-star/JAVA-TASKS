class InvalidAgeException extends Exception {
    public InvalidAgeException(String msg) {
        super(msg);
    }
}

class Voter {
    int voterId;
    String name;
    int age;

    Voter(int id, String n, int a) throws InvalidAgeException {
        if (a < 18) {
            throw new InvalidAgeException("invalid age for voter");
        }
        voterId = id;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(voterId + " " + name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Voter v = new Voter(1, "Amit", 20);
            v.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
