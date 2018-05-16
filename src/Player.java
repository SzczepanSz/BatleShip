import java.util.Scanner;

public class Player {

    private char man;


    Scanner read = new Scanner(System.in);

    public char getMan() {
        return man;
    }



    public Player() {
        this.man = 'M';
    }
    int deployMan(char change) {
        int x =0;
        int y =0;
        if (change =='X' ){
            do{
            System.out.print("\nPodaj wspóżędną X : ");
            x = read.nextInt();
            }while (x > 9 || x < 0);
            return x;
        }
        else {
            do {
                System.out.print("\nPodaj wspóżędną Y : ");
                y = read.nextInt();
            }while (y > 9 || y < 0);
            return y;


        }
    }

}
