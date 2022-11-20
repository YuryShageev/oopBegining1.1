package transport;

public class Car {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int productionYear;
    private String country;
    private String transmission;
    private String body;
    private String licenseNumber;
    private int numberOfSeats;
    private String tyreType;



    public Car(String brand, String model, int year, String country, String color, float engineVolume, String transmission, String body,
               String licenseNumber, String tyreType, int numberOfSeats) {
        this();
        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            System.out.println("Механическая");
        }else {
            this.transmission = transmission;
        }


        this.body = validateParameters(body);


        if (licenseNumber == null || licenseNumber.isBlank() || licenseNumber.isEmpty()) {
            System.out.println("x000xx000");
        } else {
            this.licenseNumber = licenseNumber;
        }

        if (tyreType == null || tyreType.isEmpty() || tyreType.isBlank()) {
            System.out.println("Летняя");
        } else {
            this.tyreType = tyreType;
        }
        if (numberOfSeats == 0) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }


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

    public Car() {
        brand = "Lada";
        model = "Granta";
        productionYear = 2000;
        country = "Россия";
        color = "Белый";
        engineVolume = 1.5f;
    }

    public void introduceCar() {
        System.out.println("Бренд " + brand);
        System.out.println("Марка " + model);
        System.out.println("Объём двигателя - " + engineVolume);
        System.out.println("Цвет " + color);
        System.out.println("Год производства " + productionYear);
        System.out.println("Страна производителя " + country);
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " + getProductionYear() + " года выпуска, сборка в стране " + getCountry() + ", " + getColor()
                + " цвета, объем двигателя - " + getEngineVolume() + "л. Трансмиссия - " + getTransmission() + " Тип кузова - " + getBody() + " Гос. Номер - "
                + getLicenseNumber() + " Тип ризины - " + getTyreType() + " Количество мест - " + getNumberOfSeats();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getCountry() {
        return country;
    }

    public String getBody() {
        return body;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public float getEngineVolume() {
        return engineVolume;
    }




    public void setCountry(String country) {
        this.country = country;
    }


    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume == 0) {
            this.engineVolume = 1.5f;
        } else if (engineVolume < 0) {
            this.engineVolume = Math.abs(engineVolume);
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            System.out.println("Механическая");
        } else {
            this.transmission = transmission;
        }
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        if (licenseNumber == null || licenseNumber.isEmpty() || licenseNumber.isBlank()) {
            System.out.println("Данные не указаны");
        } else {
            this.licenseNumber = licenseNumber;
        }
    }

    public String getTyreType() {
        return tyreType;
    }

    public void setTyreType(String tyreType) {
        if (tyreType == null || tyreType.isBlank() || tyreType.isEmpty()) {
            System.out.println("Данные не указаны");
        } else {
            this.tyreType = tyreType;
        }
    }

    public static String validateParameters(String value) {
        return value == null || value.isEmpty() || value.isBlank() ? "Информация не указана" : value;
    }
}
