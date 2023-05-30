package Third;

public class Main {public static void main(String[] args) {
    Computer[] computers = new Computer[5];

    for (int i = 0; i < 5; i++) {
        String name = "Computer " + (i + 1);
        computers[i] = new Computer(name);
    }

    for (Computer computer : computers) {
        System.out.println(computer.getName());
    }
}
}

