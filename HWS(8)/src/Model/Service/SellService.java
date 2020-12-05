package Model.Service;

import Model.Entity.CarEntity;
import Model.Repository.CarRepo;

public class SellService {
    private SellService(){}
    private static final SellService sellService=new SellService();
    public static SellService getInstance(){
        return sellService;
    }
    public void saveCustomer(String num, CarEntity carEntity)throws Exception{
        try(CarRepo carRepo=new CarRepo()){
            carEntity.setCarID(num);
            carRepo.insert(carEntity);
            carRepo.commit();
        }
        System.out.println("The customers information saved successfully!");
    }
}
