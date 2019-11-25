package com.java.javacertification.chp_6_exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExceptionchecked {
    public static void main(String[] args) {
        System.out.print("a");
        try {
            System.out.print("b");
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            System.out.print("c");
        } catch (IOException e) {
            System.out.print("d");
            throw new RuntimeException();
        } finally {
            System.out.print("e");
            throw new RuntimeException();
        }
    }
}
