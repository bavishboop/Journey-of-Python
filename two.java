import java.util.Scanner;

/**
 * two.java — Java basics in one runnable program.
 *
 * How to run:
 *   javac two.java
 *   java two
 *
 * In Java, the public class name must match the file name (two).
 * Execution always starts at main(String[] args).
 */
public class two {

    public static void main(String[] args) {
        // ---------- 1. COMMENTS ----------
        // Single-line comment
        /*
         * Multi-line comment
         */

        // ---------- 2. PRINTING ----------
        System.out.println("=== Java Basics ===");
        System.out.print("print stays on the same line. ");
        System.out.println("println adds a newline.");

        // ---------- 3. VARIABLES AND DATA TYPES ----------
        // Primitive types: stored as the value itself
        byte tiny = 100;           // 8-bit integer  (-128 to 127)
        short small = 30000;       // 16-bit integer
        int age = 18;              // 32-bit integer (most common)
        long big = 9_000_000_000L; // 64-bit integer; L is required
        float price = 9.99f;       // 32-bit decimal; f is required
        double pi = 3.14159;       // 64-bit decimal (most common)
        char letter = 'A';         // single character in single quotes
        boolean isStudent = true;  // true or false

        // Reference type: String is an object, not a primitive
        String name = "Alex";

        System.out.println("\n--- Variables ---");
        System.out.println(name + " is " + age + " years old. Student? " + isStudent);
        System.out.println("byte=" + tiny + " short=" + small + " long=" + big);
        System.out.println("float=" + price + " double=" + pi + " char=" + letter);

        // Multiple variables, then reassignment
        int x = 5, y = 10;
        x = 20; // ints can change; use final for constants
        final int DAYS_IN_WEEK = 7;
        System.out.println("x=" + x + " y=" + y + " DAYS_IN_WEEK=" + DAYS_IN_WEEK);

        // ---------- 4. OPERATORS ----------
        System.out.println("\n--- Operators ---");
        int a = 10, b = 3;
        System.out.println("a+b=" + (a + b) + " a-b=" + (a - b));
        System.out.println("a*b=" + (a * b) + " a/b=" + (a / b) + " (integer division)");
        System.out.println("a%b=" + (a % b) + " (remainder)");
        System.out.println("10.0/3=" + (10.0 / 3)); // true division with doubles

        a += 5; // same as a = a + 5
        a++;    // increment by 1
        System.out.println("after += and ++, a=" + a);

        System.out.println("a > b: " + (a > b));
        System.out.println("true && false: " + (true && false));
        System.out.println("true || false: " + (true || false));
        System.out.println("!true: " + (!true));

        // ---------- 5. STRINGS ----------
        System.out.println("\n--- Strings ---");
        String greeting = "Hello";
        String full = greeting + " " + name; // concatenation
        System.out.println(full);
        System.out.println("length=" + full.length());
        System.out.println("upper=" + full.toUpperCase());
        System.out.println("contains 'ell': " + greeting.contains("ell"));
        System.out.println("char at 0: " + greeting.charAt(0));

        // ---------- 6. USER INPUT ----------
        Scanner input = new Scanner(System.in);
        System.out.println("\n--- Input ---");
        System.out.print("Enter your first name: ");
        String userName = input.nextLine();

        System.out.print("Enter an integer: ");
        int userNumber = input.nextInt();

        System.out.print("Enter a decimal: ");
        double userDecimal = input.nextDouble();
        input.nextLine(); // clear leftover newline after nextInt/nextDouble

        System.out.println("Hi " + userName + "! You entered " + userNumber
                + " and " + userDecimal);

        // ---------- 7. DECISIONS (if / else / switch) ----------
        System.out.println("\n--- If / else ---");
        if (userNumber > 0) {
            System.out.println(userNumber + " is positive.");
        } else if (userNumber < 0) {
            System.out.println(userNumber + " is negative.");
        } else {
            System.out.println("You entered zero.");
        }

        // ternary: condition ? valueIfTrue : valueIfFalse
        String evenOdd = (userNumber % 2 == 0) ? "even" : "odd";
        System.out.println(userNumber + " is " + evenOdd + ".");

        System.out.println("\n--- Switch ---");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Another day");
                break;
        }

        // ---------- 8. LOOPS ----------
        System.out.println("\n--- Loops ---");
        System.out.print("for: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("while: ");
        int n = 3;
        while (n > 0) {
            System.out.print(n + " ");
            n--;
        }
        System.out.println();

        System.out.print("do-while: ");
        int d = 0;
        do {
            System.out.print(d + " ");
            d++;
        } while (d < 3);
        System.out.println();

        System.out.print("break at 3, skip 2 with continue: ");
        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                continue; // skip this iteration
            }
            if (i == 4) {
                break; // leave the loop
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // ---------- 9. ARRAYS ----------
        System.out.println("\n--- Arrays ---");
        int[] scores = {90, 85, 78, 92};
        System.out.println("first score=" + scores[0] + " length=" + scores.length);
        scores[2] = 80; // change an element (indexes start at 0)

        int sum = 0;
        for (int score : scores) { // enhanced for-each loop
            sum += score;
            System.out.print(score + " ");
        }
        System.out.println("\naverage=" + (sum / (double) scores.length)); // cast to double

        String[] colors = new String[3];
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "blue";
        System.out.println("colors[1]=" + colors[1]);

        // ---------- 10. METHODS ----------
        System.out.println("\n--- Methods ---");
        sayHello(userName);
        int doubled = doubleIt(userNumber);
        System.out.println(userNumber + " doubled is " + doubled);
        System.out.println("max(7, 12)=" + max(7, 12));

        // ---------- 11. OBJECTS (simple class) ----------
        System.out.println("\n--- Objects ---");
        Person person = new Person(userName, age);
        person.introduce();

        input.close();
        System.out.println("\n=== Done. You covered Java basics. ===");
    }

    /** void means this method returns nothing. */
    public static void sayHello(String who) {
        System.out.println("Hello, " + who + "!");
    }

    /** Returns an int. static means you can call it from main without an object. */
    public static int doubleIt(int value) {
        return value * 2;
    }

    public static int max(int first, int second) {
        if (first > second) {
            return first;
        }
        return second;
    }
}

/**
 * A class is a blueprint. An object is one instance of that class.
 * Fields hold data. Methods define behavior.
 */
class Person {
    String name;
    int age;

    // Constructor: runs when you write new Person(...)
    Person(String name, int age) {
        this.name = name; // this.name is the field; name is the parameter
        this.age = age;
    }

    void introduce() {
        System.out.println("I am " + name + " and I am " + age + ".");
    }
}
