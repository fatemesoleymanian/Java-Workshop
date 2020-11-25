package usc.ac.ir;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DocumentControlling documentControlling=new DocumentControlling();
        int choose=Integer.parseInt(scanner.nextLine());

        switch (choose){
            case 1:
                documentControlling.createDoc();
                break;
            case 2:
                documentControlling.show();
                break;
            case 3:
                documentControlling.changes();
                break;
            case 4:
                documentControlling.delete();
                break;
            default:
                System.out.println("wrong answer");
                return;
        }
    }
}
