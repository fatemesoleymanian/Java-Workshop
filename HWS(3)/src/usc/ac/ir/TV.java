package usc.ac.ir;



public abstract class TV {
    String channel1="Family Channel";
    String channel2="Teenagers Channel";
    String channel3="Young Channel";
    String channel4="Channel Four";
    TV (){
        System.out.println("select one\n1.turning off\n2.turning on\n3.channel finding\n4.select and watch channels\n5.removing channel\n6.adding channel\n7.reset factory");
    }


    void turningOFF(){}

    void turningON(){}

    void channelFINDING(){}

    void selectAndWATCHTV(){
        System.out.println("1.Family Channel\n2.Teenagers Channel\n3.Young Channel\n4.Channel Four");

    }

    void removingCHANNEL(){
        System.out.println("Which Channel Do You Want To Remove ?");

    }
    void addingCHANNEL(){
        System.out.println("Enter The Channel You Want To Add :");
    }
    void resetFACTORY(){}

}
