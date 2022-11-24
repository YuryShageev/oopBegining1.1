package transport;

public class Bus extends Transport {
    public Bus(String brand, String model) {
        super(brand, model);
    }

    public Bus(String brand, String model, int productionYear, String country, String color, float maxMovementSpeed, int fuelType) {
        super(brand, model, productionYear, country, color, maxMovementSpeed, fuelType);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String refill(int category) {
        super.setFuelType(category);
        String fuel = "";
        String fuel1 = "Бензин";
        String fuel2 = "Дизель";
        String fuel3 = "Газ";
        if (category == 1) {
            fuel = fuel1;
        } else if (category == 2) {
            fuel = fuel2;
        } else if (category == 3) {
            fuel = fuel3;
        } else {
            fuel = "Вид топлива для данного транспортного средства не определён";
        }
        return fuel;
    }
}
