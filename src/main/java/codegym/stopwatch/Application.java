package codegym.stopwatch;

public class Application {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] list = SortRandomNumber.list();

        System.out.println(stopWatch.start());
        SortRandomNumber.sort(list);
        System.out.println(stopWatch.end());
        System.out.println(stopWatch.getElapsedTime());
    }
}
