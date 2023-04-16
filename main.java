public class main {

    public static void main(String[] args) {
        ICar bmw = CarFactory.createCar("BMW", "Siyah", 240000, 2016, true);
        ICar audi = CarFactory.createCar("Audi", "Beyaz", 194000, 2018, false);

        bmw.showCarInfo();
        System.out.println();
        audi.showCarInfo();
    }

}
