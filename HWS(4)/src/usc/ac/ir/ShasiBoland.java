package usc.ac.ir;

public class ShasiBoland {
    public String carName;
    public double acceleration;
    public int differentialNum;
    public int enginePower;
    public double carCost;
    public String getCarName() {
        return carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }
    public double getCarCost() {
        return carCost;
    }
    public void setCarCost(double carCost) {
        this.carCost = carCost;
    }

    public double getAcceleration() {
        return acceleration;
    }
    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }
    public int getDifferentialNum() {
        return differentialNum;
    }
    public String getDiffrentialType() {
        return differentialType;
    }

    public void setDifferentialType(String differentialType) {
        this.differentialType = differentialType;
    }

    public void setDifferentialNum(int differentialNum) {
        this.differentialNum = differentialNum;
    }
    public int getEnginePower() {
        return enginePower;
    }
    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
    public String differentialType;
}
