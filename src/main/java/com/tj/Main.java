package com.tj;

import java.util.Scanner;

import static com.tj.Direction.N;

public class Main {

    public static void main(String[] args) {
        RoverService roverService = new RoverService();

        Scanner scanner = new Scanner(System.in);
        String instruction;

        System.out.println("Input 'exit' as instruction to end program.");
        do {
            System.out.println("Input instructions: ");
            instruction = scanner.nextLine();
            if (!instruction.equalsIgnoreCase("exit")) {
                System.out.println("Output: " + roverService.move(new Rover(0, 0, N), instruction));
            }
        } while (!instruction.equalsIgnoreCase("exit"));
    }
}
