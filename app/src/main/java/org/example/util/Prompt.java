package org.example.util;

import java.util.Scanner;

public class Prompt {

    static Scanner keyboardScanner = new Scanner(System.in);

    public static String input(String format, Object... args) {
        System.out.printf(format + " ", args);
        return keyboardScanner.nextLine();
    }

    public static int inputInt(String format, Object... args) {
        while (true) {
            try {
                return Integer.parseInt(input(format, args));
            } catch (NumberFormatException e) {
                System.out.println("숫자로 입력해 주세요.");
            }
        }
    }

    public static void close() {
        keyboardScanner.close();
    }
}
