public class PlaneDto {

    String name;
    int engineCounters;

    public PlaneDto(String name, int engineCounters) {
        this.name = name;
        this.engineCounters = engineCounters;
    }

    public String getName() {
        return name;
    }

    public int getEngineCounters() {
        return engineCounters;
    }
}
