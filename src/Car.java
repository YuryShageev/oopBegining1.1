public class Car {
    String brand;
    String model;
    float engineVolume;
    String color;
    int productionYear;
    String country;

    Car(String brand, String model, int year, String country, String color, float engineVolume) {
        this();
        if (brand == null) {
            System.out.println("Default");
        } else {
            this.brand = brand;
        }
        if (model == null) {
            System.out.println("Default");
        } else {
            this.model = model;
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = year;
        }
        if (country == null) {
            System.out.println("Default");
        } else {
            this.country = country;
        }
        if (color == null) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
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
