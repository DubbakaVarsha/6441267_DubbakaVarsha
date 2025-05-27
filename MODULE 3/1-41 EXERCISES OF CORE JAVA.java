//exercise 1
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

//exercise 2

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result;
        switch (op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': 
                if (num2 != 0) result = num1 / num2;
                else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        System.out.println("Result: " + result);
    }
}

//Exercise 3

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

//Exercise 4

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}

//Exercise 5

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

//Exercise 6

public class DataType {
    public static void main(String[] args) {
        int i = 10;
        float f = 5.5f;
        double d = 10.12345;
        char c = 'A';
        boolean b = true;

        System.out.println("int: " + i);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + b);
    }
}

//Exercise 7

public class TypeCastingExample {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d;
        System.out.println("Double to int: " + i);

        int j = 7;
        double k = j;
        System.out.println("Int to double: " + k);
    }
}

//Exercise 8

public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result);
    }
}

//Exercise 9

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        if (marks >= 90) System.out.println("Grade: A");
        else if (marks >= 80) System.out.println("Grade: B");
        else if (marks >= 70) System.out.println("Grade: C");
        else if (marks >= 60) System.out.println("Grade: D");
        else System.out.println("Grade: F");
    }
}

//Exercise 10

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;
        int guess;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Guess a number (1–100): ");
            guess = sc.nextInt();
            if (guess < numberToGuess) System.out.println("Too low!");
            else if (guess > numberToGuess) System.out.println("Too high!");
            else System.out.println("Correct! The number was " + numberToGuess);
        } while (guess != numberToGuess);
    }
}

//Exercise 11

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = sc.nextInt();
        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " is " + fact);
    }
}

//Exercise 12

public class MethodOverloading {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Add ints: " + add(2, 3));
        System.out.println("Add doubles: " + add(2.5, 3.7));
        System.out.println("Add three ints: " + add(1, 2, 3));
    }
}

//Exercise 13

import java.util.Scanner;

public class RecursiveFibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
    }
}

//Exercise 14

import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double avg = (double) sum / n;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}

//Exercise 15

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}

//Exercise 16

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

//Exercise 17

import java.util.Scanner;

class Car {
    String make, model;
    int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter car make: ");
        String make = sc.nextLine();

        System.out.print("Enter car model: ");
        String model = sc.nextLine();

        System.out.print("Enter car year: ");
        int year = sc.nextInt();

        Car car = new Car(make, model, year);
        car.displayDetails();
    }
}

//Exercise 18

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal generic = new Animal();
        Animal dog = new Dog();

        generic.makeSound();  
        dog.makeSound();     
    }
}

//Exercise 19

interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Playing the guitar");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing the piano");
    }
}

public class Main {
    public static void main(String[] args) {
        Playable g = new Guitar();
        Playable p = new Piano();

        g.play();
        p.play();
    }
}


//Exercise 20

import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int a = sc.nextInt();
        System.out.print("Enter denominator: ");
        int b = sc.nextInt();

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}

// Exercise 21

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Access Denied: Age must be 18 or older.");
        } else {
            System.out.println("Access Granted: Welcome!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

// Exercise 22

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to write to file: ");
        String input = sc.nextLine();

        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(input);
            writer.close();
            System.out.println("Data successfully written");

        } catch (IOException e) {
            // Fallback output for environments like Programiz
            System.out.println("File writing not allowed in this environment.");
            System.out.println("Simulated write: " + input);
        }
    }
}

// Exercise 23

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            System.out.println("File contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}

//Exercise 24

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student names (type 'exit' to finish):");
        while (true) {
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("exit")) break;
            students.add(name);
        }

        System.out.println("Students entered:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}

//Exercise 25

import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student ID and name (type -1 to stop):");
        while (true) {
            System.out.print("ID: ");
            int id = sc.nextInt();
            if (id == -1) break;
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            studentMap.put(id, name);
        }

        System.out.print("Enter ID to search: ");
        int searchId = sc.nextInt();
        if (studentMap.containsKey(searchId)) {
            System.out.println("Name: " + studentMap.get(searchId));
        } else {
            System.out.println("Student ID not found.");
        }
    }
}

//Exercise 26

class MyThread extends Thread {
    private String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " - " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");

        t1.start();
        t2.start();
    }
}

//Exercise 27

import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println(names);
    }
}

//Exercise 28

import java.util.*;
import java.util.stream.*;

public class StreamEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> even = numbers.stream()
                                    .filter(n -> n % 2 == 0)
                                    .collect(Collectors.toList());
        System.out.println(even);
    }
}

//Exercise 29

import java.util.*;

record Person(String name, int age) {}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        Person person = new Person(name, age);
        System.out.println("You entered: " + person);

        scanner.close();
    }
}

//Exercise 30

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value:");
        String input = scanner.nextLine();

        Object obj;
        if (input.matches("-?\\d+")) {
            obj = Integer.parseInt(input);
        } else if (input.matches("-?\\d*\\.\\d+")) {
            obj = Double.parseDouble(input);
        } else {
            obj = input;
        }

        switch (obj) {
            case Integer i -> System.out.println("You entered an Integer: " + i);
            case Double d -> System.out.println("You entered a Double: " + d);
            case String s -> System.out.println("You entered a String: " + s);
            default -> System.out.println("Unknown type");
        }

        scanner.close();
    }
}



//Exercise 31

import java.sql.*;

public class JDBCConnect {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:students.db");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                System.out.println(rs.getInt("id") + ": " + rs.getString("name"));
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


//Exercise 32


import java.sql.*;

public class StudentDAO {
    Connection conn;

    StudentDAO() throws SQLException {
        conn = DriverManager.getConnection("jdbc:sqlite:students.db");
    }

    void insertStudent(int id, String name) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("INSERT INTO students (id, name) VALUES (?, ?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.executeUpdate();
    }

    void updateStudent(int id, String name) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("UPDATE students SET name=? WHERE id=?");
        ps.setString(1, name);
        ps.setInt(2, id);
        ps.executeUpdate();
    }
}

//Exercise 33

import java.sql.*;

public class BankTransfer {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:bank.db")) {
            conn.setAutoCommit(false);

            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE accounts SET balance = balance - 100 WHERE id = 1");
            stmt.executeUpdate("UPDATE accounts SET balance = balance + 100 WHERE id = 2");

            conn.commit();
            System.out.println("Transaction successful");

        } catch (SQLException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}

//Exercise 34

module-info.java in com.utils:
module com.utils {
    exports com.utils;
}

module-info.java in com.greetings:
module com.greetings {
    requires com.utils;
}

//Exercise 35

Server:
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1234);
        Socket socket = server.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        out.println("Hello client!");
        System.out.println("Client: " + in.readLine());

        socket.close();
        server.close();
    }
}

Client:
import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        System.out.println("Server: " + in.readLine());
        out.println("Hello server!");

        socket.close();
    }
}

//Exercise 36

import java.net.http.*;
import java.net.URI;
import java.io.IOException;

public class HttpExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com"))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status: " + response.statusCode());
        System.out.println("Body: " + response.body());
    }
}


//Exercise 37

Demo.java:
public class Demo {
    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        System.out.println(square(5));
    }
}

Command to Compile and Inspect:
javac Demo.java
javap -c Demo

Sample Output (bytecode):
Compiled from "Demo.java"
public class Demo {
  public Demo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static int square(int);
    Code:
       0: iload_0
       1: iload_0
       2: imul
       3: ireturn

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: iconst_5
       4: invokestatic  #3                  // Method square:(I)I
       7: invokevirtual #4                  // Method java/io/PrintStream.println:(I)V
      10: return
}

//Exercise 38

Steps:
Write a simple program like:
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
Compile:
javac Hello.java
Use a decompiler like:
JD-GUI
CFR
Sample CFR usage:
sh
Copy
Edit
java -jar cfr.jar Hello.class

//Exercise 39

import java.lang.reflect.*;
public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("java.lang.String");
        Method[] methods = cls.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }
}

//Exercise 40

public class VirtualThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 100_000; i++) {
            Thread.startVirtualThread(() -> System.out.println("Running virtual thread"));
        }
    }
}

//Exercise 41

import java.util.concurrent.*;
import java.util.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = List.of(
            () -> "Task 1",
            () -> "Task 2",
            () -> "Task 3"
        );

        List<Future<String>> results = executor.invokeAll(tasks);
        for (Future<String> result : results) {
            System.out.println(result.get());
        }

        executor.shutdown();
    }
}