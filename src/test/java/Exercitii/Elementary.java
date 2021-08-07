package Exercitii;

import org.junit.Test;

import java.util.Scanner;

public class Elementary {


    @Test
    public void test() {

    }

    public static void main(String[] args) {
        //helloWorld();
        //userName();
        //userAliceBob();
        //askForNumber();
        //chooseBetweenSumAndProduct();
        //multiplicationTable();
        //allPrimeNumbers();
        guessSecretNumber();

    }

    //1. Write a program that prints ‘Hello World’ to the screen.
    public static void helloWorld() {
        System.out.println("Hello world!");
    }

    //2. Write a program that asks the user for their name and greets them with their name.
    public static void userName() {
        System.out.println("What's your name? ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        System.out.println("Hello " + userInput);
    }

    //3. Modify the previous program such that only the users Alice and Bob are greeted with their names.
    public static void userAliceBob() {
        Scanner scanner = new Scanner(System.in);
        String userInput1 = scanner.nextLine();
        if (userInput1.contains("Alice") || (userInput1.contains("Bob"))) {
            System.out.println("Hello! ");
        } else {
            System.out.println("------");
        }

    }

    //4. Write a program that asks the user for a number n and prints the sum of the numbers 1 to n
    public static void askForNumber() {
        System.out.println("What is your favorite number?");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int choise = scan.nextInt();
        int suma = 0;
        for (int i = 1; i <= number; i++) {

            suma = suma + i;
        }

        System.out.println("Suma este: " + suma);

    }

    //5. Modify the previous program such that only multiples of three or five are considered in the sum, e.g. 3, 5, 6, 9, 10, 12, 15 for n=17
    public static void multiplesThreeFive() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
    }

    //6. Write a program that asks the user for a number n and gives them the possibility to choose between computing the sum and computing the product of 1,…,n.
    public static void chooseBetweenSumAndProduct() {
        System.out.println("Introdu un numar x: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String cuvant = sc.nextLine();
        int sum = 0;
        int produs = 1;

        for (int i = 1; i <= num; i++) {
            if (cuvant.contains("suma")) {
                sum = sum + i;
            } else {
                produs = produs * i;
            }
        }
        int result;
        if (cuvant.contains("suma")) {
            result = sum;
        } else {
            result = produs;
        }
        System.out.println("Rezultatul este: " + result);


    }

    //7. Write a program that prints a multiplication table for numbers up to 12.
    public static void multiplicationTable() {
        int prod = 1;
        for (int i = 1; i <= 12; i++) {
            {
                System.out.println(i + " * " + 12 + " =  " + 12 * i);
            }


        }
    }

    //8.Write a program that prints all prime numbers. (Note: if your programming language does not support arbitrary size numbers, printing all primes up to the largest number you can easily represent is fine too.)
    public static void allPrimeNumbers() {

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println("prim " + i);
            }
        }

    }

    public static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;


    }

    //9.Write a guessing game where the user has to guess a secret number. After every guess the program tells the user whether their number was too large or too small.
    //At the end the number of tries needed should be printed. t counts only as one try if they input the same number multiple times consecutively.I
    public static void guessSecretNumber() {
        System.out.println("Enter your number: ");

        int secretNumber = 3;
        int userInput = -1;
        Scanner sc = new Scanner(System.in);
        int tries =7;
        while (userInput != secretNumber && tries!=0) {
            userInput = sc.nextInt();
            if (userInput < secretNumber) {
                System.out.println("Numarul e mai mare");

            } else if (userInput > secretNumber) {
                System.out.println("Nr e mai mic");
            }
            tries--;
        }
    }
}


//Write a program that prints the next 20 leap years.

