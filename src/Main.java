import transport.Car;



public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setCountry("Россия");
        car.getColor();
        car.getBrand();
        car.getModel();
        car.getProductionYear();
        car.setEngineVolume(0);
        System.out.println(car);

        Car car1 = new Car("Audi", "A8 50 L TDI quattro", -2020, "Германия", " чёрного",
                3.0f, "Автомат", "Хэчбек", "т829ип123", "Зимняя", 5);
        System.out.println(car1);
        Car car2 = new Car("BMW", "Z8", 2021, "Германия", " чёрного", 3.0f, "Автомат", "Седан"
                , "х746ай123", "Зимняя", 4);
        System.out.println(car2);
        Car car3 = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красного", 2.4f, "ММТ", "Кроссовер",
                "д145ай123", "Всесезонная", 7);
        System.out.println(car3);
        Car car4 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевого", 1.6f, "ММТ",
                "Лифтбэк", "т567ип01", "Зимняя", 5);
        System.out.println(car4);
    }
}
