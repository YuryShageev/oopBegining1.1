public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int productionYear;
    String country;

    Car(String brand, String model, int year, String country, String color, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.productionYear = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    Car() {
        brand = "Гнилая";
        model = "тачанка";
        productionYear = 1960;
        country = "Черти где";
        color = "Такой же как красный, только синий";
        engineVolume = 1.1f;
    }

    void introduceCar() {
        System.out.println("Бренд " + brand);
        System.out.println("Марка " + model);
        System.out.println("Объём двигателя - " + engineVolume);
        System.out.println("Цвет " + color);
        System.out.println("Год производства " + productionYear);
        System.out.println("Страна производителя " + country);
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + productionYear + " года выпуска, сборка в стране " + country + ", " + color + " цвета, объем двигателя - " + engineVolume + "л.";
    }
}
