class Programming {
    public Programming() {
        System.out.println("I love programming languages");
    }

    public Programming(String language) {
        System.out.println("I love " + language);
    }
}

public class ProgrammingDemo {
    public static void main(String[] args) {
        Programming programming1 = new Programming();
        Programming programming2 = new Programming("Java");
        Programming programming3 = new Programming("Python");
    }
}