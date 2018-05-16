import java.util.Random;
import java.util.Scanner;

public class Table {

    private char empty = '-';
    private char [][] table = new char[10][10];

    public char getTable(int x,int y) {
        return table[x][y];
    }

    public Table (char empty){
        for (int i =0 ; i <table.length; i++) {
            for(int j = 0 ; j < table[0].length; j++){
                table [i][j] = empty; }
        }
    }

    public  boolean setTable(int x, int y, char m) {


            if (table [x][y]== empty){
            table [x][y] = m;
            return true;
       }
        else{
            System.out.println("\nTo pole jest już zajęte !!!");
            return false;
        }


    }

    public  boolean shotTable(int x, int y, char m) {
        if (table [x][y] == 'S'){
            table [x][y] = m;
            System.out.println("\nTrafiony !!!");
            return true;
        }
        else{
            table [x][y] = '?';
            System.out.println("\nPudło !!!");
            return false;
        }
    }


    void print (boolean change){
        String man = "\nTABELA CZŁOWIEKA";
        if (change==false){ man = "\nTABELA KOMPUTERA";}
        System.out.println(man+"\n 0123456789 " );
        for (int i =0 ; i <table.length; i++) {
            System.out.print(i);
            for(int j = 0 ; j < table[0].length; j++){
                System.out.print( table [i][j] );
            }
            System.out.println(i);
        }
        System.out.print(" 0123456789");
    }
}
