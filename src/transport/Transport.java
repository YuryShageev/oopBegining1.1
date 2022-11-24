package transport;

import java.time.LocalDate;

public abstract class Transport {

    private String brand;
    private String model;
    private int productionYear;
    private String country;
    private String color;
    private float maxMovementSpeed;
    private int fuelType;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = validateParameters(brand);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = validateParameters(model);
    }

    public int getProductionYear() {
        return productionYear;
    }


    public String getCountry() {
        return country;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = validateParameters(color);
    }

    public float getMaxMovementSpeed() {
        return maxMovementSpeed;
    }

    public void setMaxMovementSpeed(float maxMovementSpeed) {
        this.maxMovementSpeed = validateSpeed(maxMovementSpeed);
    }

    public int getFuelType() {
        return fuelType;
    }

    public void setFuelType(int fuelType) {
        this.fuelType = fuelType;
    }

    public static String validateParameters(String value) {
        return value == null || value.isEmpty() || value.isBlank() ? "Информация не указана" : value;
    }

    public static float validateSpeed(float value) {
        return value <= 0 ? 30.0f : value;
    }

    public Transport(String brand, String model) {
        this(brand, model, 0, "Россия", "Белый", 30, 1);
    }

    public Transport(String brand, String model, int productionYear, String country, String color, float maxMovementSpeed, int fuelType) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        refill(fuelType);

        if (productionYear < 0) {
            this.productionYear = Math.abs(productionYear);
        } else if (productionYear > 0 && productionYear < 100) {
            this.productionYear = LocalDate.now().getYear() - productionYear;
        } else if (productionYear == 0) {
            System.out.print("Информация отсутствует!");
        } else {
            this.productionYear = productionYear;
        }
        this.country = validateParameters(country);
        this.color = validateParameters(color);
        this.maxMovementSpeed = maxMovementSpeed;
    }

    public abstract String refill(int category);

    @Override
    public String toString() {
        return " Марка " + getBrand() +
                ", Модель " + getModel() +
                ", Год выпуска " + getProductionYear() +
                ", Страна-производитель " + getCountry() +
                ", Цвет " + getColor() +
                ", Максимальная скорость передвижения " + getMaxMovementSpeed() + " км/ч " +
                 ", Использует топливо - " + refill(getFuelType()) + ", ";
    }
}
