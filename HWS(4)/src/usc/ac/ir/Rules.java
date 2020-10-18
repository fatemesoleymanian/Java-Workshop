package usc.ac.ir;

public class Rules {
    public double costWithTaxes(double carCost){
        return carCost*109/100;
    }
    public double sideCostsAdded(double carCost){
        return carCost+100;
    }
}
