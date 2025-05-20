package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws FileNotFoundException {
        try {

            FileInputStream fis = new FileInputStream("data.txt");

            Scanner scanner = new Scanner(fis);

            // other code not shown

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
