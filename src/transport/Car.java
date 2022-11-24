package transport;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Car extends Transport {

    private float engineVolume;
    private String transmission;
    private String body;
    private String licenseNumber;
    private int numberOfSeats;
    private String tyreType;
    private Key key;
    private Insurance insurance;


    public Car(String brand, String model, int year, String country, String color, float maxMovementSpeed, int fuelType) {
        super(brand, model, year, country, color, maxMovementSpeed, fuelType);
    }

    public Car(String brand, String model, int year, String country, String color, float maxMovementSpeed, int fuelType, float engineVolume, String transmission, String body,
               String licenseNumber, String tyreType, int numberOfSeats) {
        super(brand, model, year, country, color, maxMovementSpeed, fuelType);
        refill(getFuelType());
        this.body = validateParameters(body);
        this.licenseNumber = validateLicensePlate(licenseNumber);
        if (transmission == null || transmission.isBlank() || transmission.isEmpty()) {
            this.transmission = "Механическая";
        }else {
            this.transmission = transmission;
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
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }

    }

    @Override
    public String refill(int category) {
        super.setFuelType(category);
        String fuel = "";
        String fuel1 = "Бензин";
        String fuel2 = "Дизель";
        String fuel3 = "Электричество";
        String fuel4 = "Газ";
        if (category == 1) {
            fuel = fuel1;
        } else if (category == 2) {
            fuel = fuel2;
        } else if (category == 3) {
            fuel = fuel3;
        } else if (category == 4) {
            fuel = fuel4;
        } else {
            fuel = "Вид топлива для данного транспортного средства не определён";
        }
        return fuel;
    }

//


    @Override
    public String toString() {
        return  super.toString()+ " объем двигателя - " + getEngineVolume() + "л. Трансмиссия - " + getTransmission() + " Тип кузова - " + getBody() + " Гос. Номер - "
                + getLicenseNumber() + " Тип ризины - " + getTyreType() + " Количество мест - " + getNumberOfSeats() + " Свойства ключа -" + getKey() +
                " Страховка: " + getInsurance();
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

//Getters and setters begin

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

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

//    Getters and setters over//

    //Валидации
    public static String validateParameters(String value) {
        return value == null || value.isEmpty() || value.isBlank() ? "Информация не указана" : value;
    }

    public static Integer validateYear(Integer value) {
        return value == null || value < 0 ? 2000 : value;
    }

    public static String validateLicensePlate(String licenseNumber) {
        if (Pattern.matches("[а-я][0-9]{3}[а-я]{2}[0-9]{3}", licenseNumber)) {
            return licenseNumber;
        } else {
            return "Неверный номер";
        }
    }

    public static String validateCountry(String value, String substitution) {
        return (value == null || value.isBlank() || value.isEmpty()) ? substitution : value;
    }

    public Boolean validateBoolean(Boolean value) {
        return value == null ? false : value;
    }

    public double validateCost(double value) {
        return value <= 0 ? 1000 : value;
    }

    private boolean validateSerialNumber(String number) {
        if (Pattern.matches("[а-яА-Яa-zA-Z0-9]{9}", number)) {
            return true;
        } else {
            System.out.println("Wrong Number");
            return false;
        }
    }

    public class Key {
        private final Boolean remoteStart;
        private final Boolean keyLessAccess;

        public Key(Boolean remoteStart, Boolean keyLessAccess) {
            this.remoteStart = validateBoolean(remoteStart);
            this.keyLessAccess = validateBoolean(keyLessAccess);
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteStart=" + remoteStart +
                    ", keyLessAccess=" + keyLessAccess +
                    '}';
        }


    }

    public class Insurance {
        private final LocalDate duration;
        private final Double cost;
        private final String number;

        public Insurance(LocalDate duration, double cost, String number) {
            this.duration = duration;
            this.cost = validateCost(cost);
            this.number = validateSerialNumber(number) ? number : "Invalid Number";
        }





        public LocalDate checkDuration(LocalDate duration) {
            if (LocalDate.now().isAfter(duration)) {
                System.out.println("Страховка просрочена");
                return LocalDate.now();
            } else {
                return duration;
            }
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "duration=" + duration +
                    ", cost=" + cost +
                    ", number='" + number + '\'' +
                    '}';
        }
    }
}
