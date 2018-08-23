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
        StopWatch stopWatch = new StopWatch();
        long expected = System.currentTimeMillis();

        long actual = stopWatch.getEndTime();
        assertEquals(expected, actual);
    }

    @Test
    public void getElapsedTime() {
        StopWatch stopWatch = new StopWatch();
        long expected = stopWatch.end() - stopWatch.start();

        long actual = stopWatch.getElapsedTime();
        assertEquals(expected, actual);
    }
}