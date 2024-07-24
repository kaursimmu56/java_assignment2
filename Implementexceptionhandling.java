package org.example;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Implementexceptionhandling {;


    public class ExceptionHandler {
        public static void handleException(Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        public static void handleInputMismatchException(InputMismatchException e) {
            System.err.println("Input error: Please enter the correct type of data.");
        }

        public static void handleNoSuchElementException(NoSuchElementException e) {
            System.err.println("Element not found: " + e.getMessage());
        }

        public static void handleIllegalArgumentException(IllegalArgumentException e) {
            System.err.println("Illegal argument: " + e.getMessage());
        }
    }

}
