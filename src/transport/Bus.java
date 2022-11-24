package transport;

public class Bus extends Transport {
    public Bus(String brand, String model) {
        super(brand, model);
    }

    public Bus(String brand, String model, int productionYear, String country, String color, float maxMovementSpeed) {
        super(brand, model, productionYear, country, color, maxMovementSpeed);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void refill(int category) {

    }
}
