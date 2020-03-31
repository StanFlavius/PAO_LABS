package lab5;

public class CounterOutTask implements Task{

    public static int nr;

    CounterOutTask(){
        nr = 0;
    }

    @Override
    public void execute() {
        nr++;
        System.out.println(nr);
    }
}
