package lab5;

public class OutTask implements Task {

    String mesage;

    OutTask(String m){
        this.mesage = m;
    }

    @Override
    public void execute() {
        System.out.println(this.mesage);
    }
}
