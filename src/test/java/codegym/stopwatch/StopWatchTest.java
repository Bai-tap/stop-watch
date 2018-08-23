package codegym.stopwatch;

import org.junit.Test;

import static org.junit.Assert.*;

public class StopWatchTest {

    @Test
    public void getStartTime() {
        StopWatch stopWatch = new StopWatch();
        long expected = System.currentTimeMillis();

        long actual = stopWatch.getStartTime();
        assertEquals(expected, actual);
    }

    @Test
    public void getEndTime() {
    }

    @Test
    public void start() {
    }

    @Test
    public void end() {
    }

    @Test
    public void getElapsedTime() {
    }
}