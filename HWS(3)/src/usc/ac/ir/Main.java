package usc.ac.ir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        TV use=new TvFunctions();
        int option=scanner.nextInt();

        switch (option)
        {
            case 1:
                use.turningOFF();
                break;
            case 2:
                use.turningON();
                break;
            case 3 :
                use.channelFINDING();
                break;
            case 4:
                use.selectAndWATCHTV();
                break;
            case 5 :
                use.removingCHANNEL();
                break;
            case 6:
                use.addingCHANNEL();
                break;
            case 7:
                use.resetFACTORY();

        }


    }
}
