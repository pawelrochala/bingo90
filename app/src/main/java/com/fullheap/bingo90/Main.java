package com.fullheap.bingo90;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {

        int number = 1;

        if (args.length > 0) {
            try {
                number = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid number of stripes, please put int value");
            }
        }

        boolean fileFlag = false;
        if (args.length > 1) {
            String file = args[1];
            if (file.equalsIgnoreCase("file")) {
                fileFlag = true;
            }
        }

        Seed seed = new Seed();

        if (fileFlag)
            try (FileWriter writer = new FileWriter("stripes.txt")) {
                for (int i = 0; i < number; i++) {
                    Stripe stripe = new Stripe(seed);
                    writer.write(stripe.toString());
                }
            } catch (IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }
        else {
            for (int i = 0; i < number; i++) {
                Stripe stripe = new Stripe(seed);
                System.out.println(stripe);
            }
        }


    }
}
