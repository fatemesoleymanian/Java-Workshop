package usc.ac.ir;

public class SellExceptions extends Exception {
    public SellExceptions(String s){
        super(s);
    }
    public SellExceptions(){}
    public void exceptions(String cardNumber,String cardPassword,String cardSecondPassword) throws SellExceptions{
        if(cardNumber.length()!=16||cardPassword.length()>8||cardPassword.length()<6||cardSecondPassword.length()!=4){
            throw new SellExceptions("Wrong Number Inserted");
        }
    }

}
