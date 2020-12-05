package Model.Service;

import Controller.Tables;

public class CarService {
    private CarService(){
    }
    private static final CarService carService=new CarService();
    public static CarService getInstance(){
        return carService;
    }
    Tables tables=new Tables();
    public void mainMenu(){
        tables.showCarTypes();
    }
    public void showOptions(int num){
        if (num == 1) {
            tables.showSedanTable();
        } else if (num == 2) {
            tables.showSportTable();
        } else if (num == 3) {
            tables.showSUVTable();
        } else {
            System.out.println("Wrong parameter entered!");
            System.exit(1);
        }
    }
}
