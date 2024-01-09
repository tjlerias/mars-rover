package com.tj;

import java.util.Scanner;

import static com.tj.Direction.N;

public class Main {

    public static void main(String[] args) {
        RoverService roverService = new RoverService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input instructions: ");
        String instruction = scanner.nextLine();

        System.out.println("Output: " + roverService.move(new Rover(0, 0, N), instruction));
    }
}
