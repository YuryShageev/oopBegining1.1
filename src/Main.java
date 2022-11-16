public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.country = "Чёрти где";
        car.color = "Вроде бы красный, но больше зелёный";
        car.brand = "Тачанка";
        car.model = "На болтах";
        car.productionYear = 1999;
        car.engineVolume = 0.5f;
        car.introduceCar();

        Car car1 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", " чёрного", 3.0f);
        System.out.println(car1);
        Car car2 = new Car("BMW", "Z8", 2021, "Германия", " чёрного", 3.0f);
        System.out.println(car2);
        Car car3 = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красного", 2.4f);
        System.out.println(car3);
        Car car4 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевого", 1.6f);
        System.out.println(car4);
    }
}
