package usc.ac.ir;

public class Main {

    public static void main(String[] args) {

        MainMenu mainMenu=new MainMenu();
        try {
            mainMenu.menu();
        } catch (SellExceptions sellExceptions) {
            sellExceptions.printStackTrace();
        }

    }
}
