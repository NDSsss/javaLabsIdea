public class Runner implements Comparable{
    private String name;
    private int time;
    private int position;

    public Runner(String name, int time, int position){
        this.name = name;
        this.time = time;
        this.position = position;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        return time-((Runner)o).time;
    }
}
