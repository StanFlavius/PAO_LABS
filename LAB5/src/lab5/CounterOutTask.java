package lab5;

public class CounterOutTask implements Task{

    public static int nr;

    CounterOutTask(){
        this.nr++;
    }

    @Override
    public void execute() {
        System.out.println(this.nr);
    }
}
