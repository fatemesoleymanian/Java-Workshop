package usc.ac.ir;

public class Cars {
    Savari savari=new Savari();
    Rules rules=new Rules();
    ShasiBoland shasiBoland=new ShasiBoland();
    public void savari1(){
        savari.setCarName("BMW 730 Li");
        savari.setEnginePower(258);
        savari.setAcceleration(6.3);
        savari.setEngineType("4 Cylinders");
        savari.setSoopapNum(16);
        savari.setBreakSystem("ABS");
        savari.setCarCost(36500);
        System.out.println("Name: "+savari.getCarName());
        System.out.println("Engine Power: "+savari.getEnginePower()+" HP");
        System.out.println("Acceleration: "+savari.getAcceleration()+" meter per square of second");
        System.out.println("Engine Type: "+savari.getEngineType());
        System.out.println("Valve number: "+savari.getSoopapNum());
        System.out.println("Break System: "+savari.getBreakSystem());
        System.out.println("Cost: "+(rules.sideCostsAdded(rules.costWithTaxes(savari.getCarCost()))));
    }
    public void savari2(){
        savari.setCarName("BMW i8");
        savari.setEnginePower(362);
        savari.setAcceleration(4.4);
        savari.setEngineType("3 Cylinders");
        savari.setSoopapNum(12);
        savari.setBreakSystem("ABS+4 Wheel Disk+EBD+CBC+BA");
        savari.setCarCost(54900);
        System.out.println("Name: "+savari.getCarName());
        System.out.println("Engine Power: "+savari.getEnginePower()+" HP");
        System.out.println("Acceleration: "+savari.getAcceleration()+" meter per square of second");
        System.out.println("Engine Type: "+savari.getEngineType());
        System.out.println("Valve number: "+savari.getSoopapNum());
        System.out.println("Break System: "+savari.getBreakSystem());
        System.out.println("Cost: "+(rules.sideCostsAdded(rules.costWithTaxes(savari.getCarCost()))));
    }
    public void savari3(){
        savari.setCarName("BMW 528 i");
        savari.setEnginePower(245);
        savari.setAcceleration(6.3);
        savari.setEngineType("4 Cylinders");
        savari.setSoopapNum(16);
        savari.setBreakSystem("DSC,DTC,ABS,CBC,BA,HDC");
        savari.setCarCost(43200);
        System.out.println("Name: "+savari.getCarName());
        System.out.println("Engine Power: "+savari.getEnginePower()+" HP");
        System.out.println("Acceleration: "+savari.getAcceleration()+" meter per square of second");
        System.out.println("Engine Type: "+savari.getEngineType());
        System.out.println("Valve number: "+savari.getSoopapNum());
        System.out.println("Break System: "+savari.getBreakSystem());
        System.out.println("Cost: "+(rules.sideCostsAdded(rules.costWithTaxes(savari.getCarCost()))));
    }
    public void shasiBoland1(){
        shasiBoland.setCarName("BMW X3 xDrive 28i");
        shasiBoland.setDifferentialNum(2);
        shasiBoland.setAcceleration(6.5);
        shasiBoland.setDifferentialType("4WD");
        shasiBoland.setEnginePower(245);
        shasiBoland.setCarCost(64590);
        System.out.println("Name: "+shasiBoland.getCarName());
        System.out.println("Differential number : "+shasiBoland.getDifferentialNum());
        System.out.println("Acceleration: "+shasiBoland.getAcceleration()+" meter per square of second");
        System.out.println("Differential Type: "+shasiBoland.getDiffrentialType());
        System.out.println("Engine power: "+shasiBoland.getEnginePower());
        System.out.println("Cost: "+(rules.sideCostsAdded(rules.costWithTaxes(shasiBoland.getCarCost()))));
    }
    public void shasiBoland2(){
        shasiBoland.setCarName("BMW X3 2.5 Si");
        shasiBoland.setEnginePower(218);
        shasiBoland.setAcceleration(6.3);
        shasiBoland.setDifferentialType("4WD");
        shasiBoland.setDifferentialNum(2);
        shasiBoland.setCarCost(48220);
        System.out.println("Name: "+shasiBoland.getCarName());
        System.out.println("Differential number : "+shasiBoland.getDifferentialNum());
        System.out.println("Acceleration: "+shasiBoland.getAcceleration()+" meter per square of second");
        System.out.println("Differential Type: "+shasiBoland.getDiffrentialType());
        System.out.println("Engine power: "+shasiBoland.getEnginePower());
        System.out.println("Cost: "+(rules.sideCostsAdded(rules.costWithTaxes(shasiBoland.getCarCost()))));
    }
    public void shasiBoland3(){
        shasiBoland.setCarName("BMW X3 3.0 Si");
        shasiBoland.setDifferentialNum(2);
        shasiBoland.setAcceleration(7.2);
        shasiBoland.setDifferentialType("4WD");
        shasiBoland.setEnginePower(272);
        shasiBoland.setCarCost(36680);
        System.out.println("Name: "+shasiBoland.getCarName());
        System.out.println("Differential number : "+shasiBoland.getDifferentialNum());
        System.out.println("Acceleration: "+shasiBoland.getAcceleration()+" meter per square of second");
        System.out.println("Differential Type: "+shasiBoland.getDiffrentialType());
        System.out.println("Engine power: "+shasiBoland.getEnginePower());
        System.out.println("Cost: "+(rules.sideCostsAdded(rules.costWithTaxes(shasiBoland.getCarCost()))));
    }
}
