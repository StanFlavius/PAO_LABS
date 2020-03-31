package lab5;

public class OutTask implements Task {

    private String mesage;

    OutTask(String m){
        this.mesage = m;
    }

    @Override
    public void execute() {
        System.out.println(this.mesage);
    }
}
