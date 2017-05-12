package com.labs.lab2;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        if(args.length < 1){
            throw new RuntimeException("File is not specified");
        }
        Queue<Integer> queue = new Queue<>();

        try (Scanner scanner = new Scanner(new File(args[0]))) {

            while (scanner.hasNext()){
                Integer item = Integer.parseInt(scanner.next());

                if (item < 0) {
                    System.out.print(item + "; ");
                } else {
                    queue.enqueue(item);
                }
            }

            Iterator<Integer> iterator = queue.iterator();

            while (iterator.hasNext()){
                System.out.print(iterator.next() + "; ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
