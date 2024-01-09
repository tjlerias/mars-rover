package com.tj;

import static com.tj.Direction.N;

public class Main {

    public static void main(String[] args) {
        RoverService roverService = new RoverService();

        roverService.move(new Rover(0, 0, N), "LMLMLMLMLM");
    }
}
