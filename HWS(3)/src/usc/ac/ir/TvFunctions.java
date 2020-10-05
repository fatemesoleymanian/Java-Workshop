package usc.ac.ir;

import java.util.*;

public class TvFunctions extends TV {

    Scanner scanner=new Scanner(System.in);

    @Override
    public void turningOFF() {
        System.out.println("P O W E R O F F ...");
    }

    @Override
    public void turningON() {
        System.out.println("TV ON ...");

    }

    @Override
    public void channelFINDING() {
        System.out.println("CHANNEL FINDING ?");
        String str=scanner.next();
        if (str.equals("yes"))
        {
            System.out.println("CHANNEL FINDING PROCESS .");
            for (int i=0 ;i<10 ; i++){
                int c='=';
                char a=(char)c;
                System.out.print( a );
                for (int j=0 ; j<20000000 ;j++);
            }
            System.out.println("\nCHANNEL FINDING FINISHED .");
            super.selectAndWATCHTV();
        }
    }

    @Override
    public void selectAndWATCHTV() {
        super.selectAndWATCHTV();
        int channel=scanner.nextInt();
        switch (channel){
            case 1 :
                System.out.println("* * * W A T C H I N G  F A M I L Y  C H A N N E L * * *");
                break;
            case 2 :
                System.out.println("* * * W A T C H I N G  T E E N A G E R S  C H A N N E L * * *");
                break;
            case 3 :
                System.out.println("* * * W A T C H I N G  Y O U N G  C H A N N E L * * *");
                break;
            case 4 :
                System.out.println("* * * W A T C H I N G  C H A N N E L  F O U R * * *");
        }



    }

    @Override
    public void removingCHANNEL() {
        super.removingCHANNEL();
        int remove=scanner.nextInt();
        switch (remove){
            case 1 :
                System.out.println(super.channel1+" "+"REMOVED . . .");
                System.out.println("1.Teenagers Channel\n2.Young Channel\n3Channel Four");
                break;
            case  2 :
                System.out.println(super.channel2+" "+"REMOVED . . .");
                System.out.println("1.Family Channel\n2.Young Channel\n3.Channel Four");
                break;
            case 3 :
                System.out.println(super.channel3+" "+"REMOVED . . .");
                System.out.println("1.Family Channel\n2.Teenagers Channel\n3.Channel Four");
                break;
            case 4 :
                System.out.println(super.channel4+" "+"REMOVED . . .");
                System.out.println("1.Family Channel\n2.Teenagers Channel\n3.Young Channel");
        }

    }

    @Override
    public void addingCHANNEL() {
        super.addingCHANNEL();
        String newChannel=scanner.next();
        System.out.println(newChannel+" "+"Was Added To List Of Existing Channels As Fifth Channel");
        super.selectAndWATCHTV();
        System.out.println("5."+newChannel+" "+"channel");

    }

    @Override
    public void resetFACTORY() {
        System.out.println("NO  CHANNEL AVAILABLE . . . ");
        System.out.println("To Access Channels Select 'Channel Finding' .");


    }
}
