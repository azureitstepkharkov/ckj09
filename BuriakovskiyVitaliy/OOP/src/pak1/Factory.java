package OOP.pak1;

public class Factory {

   public Object creat(String carBrand) {
        if (carBrand.equals("KAMAZ")) {
            DumpTruckCar dumpTruckCar = new DumpTruckCar();
            return dumpTruckCar;
        } else if (carBrand.equals("MAN_TGS_TANKER")) {
            TankerCar tankerCar = new TankerCar();
            return tankerCar;
        } else if (carBrand.equals("VOLVO_FM_WAGON")) {
            WagonCar wagonCar = new WagonCar();
            return wagonCar;
        }
        System.out.format("В базе автомобиля %s нет\n", carBrand);
        return null;
    }
}
