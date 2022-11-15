public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int productionYear;
    String country;

    void introduceCar() {
        System.out.println("Бренд " + brand);
        System.out.println("Марка " + model);
        System.out.println("Объём двигателя - " + engineVolume);
        System.out.println("Цвет " + color);
        System.out.println("Год производства " + productionYear);
        System.out.println("Страна производителя " + country);
    }
}
