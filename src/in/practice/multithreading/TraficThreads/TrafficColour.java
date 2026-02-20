package in.practice.multithreading.TraficThreads;

public enum TrafficColour {

    RED(5000),
    YELLOW(3000),
    GREEN(8000);

    private final int onTimeInMills;

    TrafficColour(int onTimeInMills){
        this.onTimeInMills = onTimeInMills;
    }

    public int getOnTimeInMills() {
        return onTimeInMills;
    }
}
