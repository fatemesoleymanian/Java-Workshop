package usc.ac.ir;
import java.util.Scanner;

public class Sell {
    public Sell() {
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardPassword() {
        return cardPassword;
    }

    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
    }

    public String getCardSecondPassword() {
        return cardSecondPassword;
    }

    public void setCardSecondPassword(String cardSeccondPassword) {
        this.cardSecondPassword = cardSeccondPassword;
    }

    String cardNumber;
    String cardPassword;
    String cardSecondPassword;
    public void sell()throws SellExceptions{
        Cars cars=new Cars();
        SellExceptions sellExceptions=new SellExceptions("Hey");
        MainMenu mainMenu=new MainMenu();
        Scanner scanner=new Scanner(System.in);
        Rules rules=new Rules();
        ShasiBoland shasiBoland=new ShasiBoland();
        Savari savari=new Savari();

        System.out.println("Are you sure this is the car you want to buy?\nAnswer with yes or no:");
        String ans=scanner.nextLine();
        if(ans.equals("Yes")||ans.equals("Y")||ans.equals("y")||ans.equals("yes")){
            System.out.println("Redirecting to Payment section\nPlease Wait...");
            try {
                Thread.sleep(8 * 1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Enter Your Card Number(Card Numbers Include 16 Character):");
            setCardNumber(scanner.nextLine());
            System.out.println("Enter Your Card Password(Card Password MaxiMum Is 8 And Minimum Is 6):");
            setCardPassword(scanner.nextLine());
            System.out.println("Enter Your Second Password(A Second Password With 4 Numbers Is correct):");
            setCardSecondPassword(scanner.nextLine());
            try {
                sellExceptions.exceptions(getCardNumber(),getCardPassword(),getCardSecondPassword());
            }catch (SellExceptions e){
                System.out.println(e.getMessage());
                System.exit(0);
            }
            System.out.println("This Car is sold out to you!");
            System.out.println("**Customer's satisfaction is our priority**");
        }
        if(ans.equals("No")||ans.equals("no")||ans.equals("N")||ans.equals("n")){
            mainMenu.menu();
        }
    }
}
