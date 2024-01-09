package com.tj;

import org.junit.Before;
import org.junit.Test;

import static com.tj.Direction.N;
import static com.tj.Direction.S;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RoverServiceTest {

    private RoverService roverService;

    @Before
    public void setUp() {
        roverService = new RoverService();
    }

    @Test
    public void test1() {
        String actual = roverService.move(new Rover(0, 0, N), "LMLMLMLMLM");
        assertThat(actual).isEqualTo("0, 1, W");
    }

    @Test
    public void test2() {
        String actual = roverService.move(new Rover(0, 0, N), "MMMM");
        assertThat(actual).isEqualTo("0, 4, N");
    }

    @Test
    public void test3() {
        String actual = roverService.move(new Rover(0, 0, N), "RRRRR");
        assertThat(actual).isEqualTo("0, 0, E");
    }

    @Test
    public void test4() {
        String actual = roverService.move(new Rover(0, 0, N), "LRLRLRLR");
        assertThat(actual).isEqualTo("0, 0, N");
    }

    @Test
    public void test5() {
        String actual = roverService.move(new Rover(0, 0, N), "MMRMMRMRRM");
        assertThat(actual).isEqualTo("2, 2, N");
    }

    @Test
    public void test6() {
        String actual = roverService.move(new Rover(0, 0, N), "RRLL");
        assertThat(actual).isEqualTo("0, 0, N");
    }

    @Test
    public void test7() {
        String actual = roverService.move(new Rover(4, 4, S), "MMRMML");
        assertThat(actual).isEqualTo("2, 2, S");
    }

    @Test
    public void test8() {
        String actual = roverService.move(new Rover(2, 2, S), "mrMRMRmr");
        assertThat(actual).isEqualTo("2, 2, S");
    }

    @Test
    public void moveRoverNullInstruction() {
        String actual = roverService.move(new Rover(0, 0, N), null);
        assertThat(actual).isEqualTo("0, 0, N");
    }

    @Test
    public void moveRoverEmptyInstruction() {
        String actual = roverService.move(new Rover(0, 0, N), "");
        assertThat(actual).isEqualTo("0, 0, N");
    }

    @Test
    public void moveRoverBlankInstruction() {
        String actual = roverService.move(new Rover(0, 0, N), " ");
        assertThat(actual).isEqualTo("0, 0, N");
    }

    @Test
    public void moveRoverCaseInsensitiveSuccess() {
        String actual = roverService.move(new Rover(0, 0, N), "lmlmlmlmlm");
        assertThat(actual).isEqualTo("0, 1, W");
    }

    @Test
    public void moveRoverInvalidInstruction() {
        String instruction = "LMLMLMLMLMLMABC";
        Rover rover = new Rover(0, 0, N);

        assertThatThrownBy(() -> roverService.move(rover, instruction))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("Invalid instruction: " + instruction);
    }
}