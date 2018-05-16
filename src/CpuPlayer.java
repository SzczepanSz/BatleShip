import java.util.Random;


public class CpuPlayer extends Player{
    private char com = 'C';
    public CpuPlayer(){
        this.com='C';
    }
    int deployCom() {
        Random ran = new Random();
    return ran.nextInt (10);
    }

    public char getCom() {
        return com;
    }
}
