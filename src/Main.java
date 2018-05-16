import java.math.*;
import java.lang.Object;
import java.util.AbstractCollection;
import java.util.AbstractList;
import  java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.lang.Integer;

public class Main {
    public final static int SCREEN_HEIGHT = 30;
    static void clearScreen (){
        for (int i = 0; i < SCREEN_HEIGHT; i++)
            System.out.println();
    }

    public static void main(String[] args) {
        int x,y;
        char change = 'X';
        boolean dupa = true;
       int ileMan = 0;
        int ileCpu = 0;



        Table manTable = new Table('-');
        Table cpuTable = new Table('-');
        Player manPlayer = new Player();
        CpuPlayer cpuPlayer = new CpuPlayer();


       //Ustawienie statków komputera
        for (int i = 0; i<5;i++){
            x= cpuPlayer.deployCom();
            y=cpuPlayer.deployCom();
            System.out.println(x +" "+y);
            if (dupa != cpuTable.setTable(x,y,'S')){
                i--;
            }else{}

        }
        cpuTable.print(false);

        //Ustawienie statków gracza

        for (int i = 0; i<5;i++){
            change = 'X';
            x = manPlayer.deployMan(change );
            change = 'Y';
            y = manPlayer.deployMan(change);

            if (dupa != manTable.setTable(x,y,'S')){
                i--;
            }else{}
        }
        manTable.print(true);

        //rozgrywka

        do{
            change = 'X';
            x = manPlayer.deployMan(change );
            change = 'Y';
            y = manPlayer.deployMan(change);
            if (cpuTable.shotTable(x,y,'*')== true) {
                System.out.println(ileMan++);
            }
            x= cpuPlayer.deployCom();
            y=cpuPlayer.deployCom();
            if (manTable.shotTable(x,y, '*')== true) {
                System.out.println(ileCpu++);
            }
            cpuTable.print(false);
            manTable.print(true);
        }while (ileCpu != 5 && ileMan!=5);
        if (ileCpu == 5){
            System.out.println("\nWygrał komputer !!!");
        }if (ileMan == 5){
            System.out.println("\nWygrał człowiek !!!");
        }


    }
}