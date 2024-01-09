package com.tj;

import static com.tj.Direction.N;

public class Main {
    public static void main(String[] args) {
        String output = moveRover(new Rover(0, 0, N), "LMLMLMLMLM");
        if (output.equals("0, 1, W")) {
            System.out.println("True");
        }
    }

    private static String moveRover(Rover rover, String instruction) {

    }

    private static String parseInstruction(String instruction) {

    }
}