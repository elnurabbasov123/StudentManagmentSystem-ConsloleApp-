package util;

import java.util.Scanner;

public class MenyuUtil {
    public static void showMenyu(){
        System.out.println("Please select menyu");

        Menyu.showAllMenyu();

        Scanner sc=new Scanner(System.in);
        int selectedMenyuNumber=sc.nextInt();

        Menyu selectedMenyu= Menyu.find(selectedMenyuNumber);
        selectedMenyu.process();

    }
    public static void processMenyu(Menyu menyu){
        menyu.process();
    }
}
