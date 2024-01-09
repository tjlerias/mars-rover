package com.tj;

public class RoverService {
    private static final char SPIN_LEFT = 'L';
    private static final char SPIN_RIGHT = 'R';
    private static final char MOVE = 'M';

    public String move(Rover rover, String instruction) {
        if (instruction == null || instruction.isEmpty() || instruction.isBlank()) {
            return formatOutput(rover);
        }

        if (!instruction.matches("(?i)[LRM]+")) {
            throw new IllegalArgumentException("Invalid instruction: " + instruction);
        }

        parseInstruction(rover, instruction);

        return formatOutput(rover);
    }

    private String formatOutput(Rover rover) {
        return String.format("%d, %d, %s", rover.getX(), rover.getY(), rover.getDirection());
    }

    private void parseInstruction(Rover rover, String instruction) {
        for (char movement : instruction.toUpperCase().toCharArray()) {
            switch (movement) {
                case SPIN_LEFT:
                    rover.spinLeft();
                    break;
                case SPIN_RIGHT:
                    rover.spinRight();
                    break;
                case MOVE:
                    rover.move();
                    break;
                default:
                    throw new IllegalArgumentException("Invalid movement: " + movement);
            }
        }
    }
}