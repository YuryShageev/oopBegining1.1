package transport;

public class Train extends Transport {

    private float rideCost;
    private float rideTime;
    private String departureStation;
    private String arrivalStation;
    private int numberOfTrainCars;


    public Train(String brand, String model, int productionYear, String country, String color, float maxMovementSpeed) {
        super(brand, model, productionYear, country, color, maxMovementSpeed);
    }

    public Train(String brand, String model, int productionYear, String country, String color, float maxMovementSpeed, int numberOfTrainCars,
                 String departureStation, String arrivalStation, float rideCost, float rideTime) {
        super(brand, model, productionYear, country, color, maxMovementSpeed);

        if (numberOfTrainCars < 0) {
            this.numberOfTrainCars = Math.abs(numberOfTrainCars);
        } else if (numberOfTrainCars == 0) {
            System.out.print("Пустой");
        } else {
            this.numberOfTrainCars = numberOfTrainCars;
        }
        this.departureStation = Car.validateParameters(departureStation);
        this.arrivalStation = Car.validateParameters(arrivalStation);

        if (rideCost < 0) {
            this.rideCost = Math.abs(rideCost);
        } else if (rideCost == 0) {
            System.out.print("Поездка бесплатна");
        } else {
            this.rideCost = rideCost;
        }

        if (rideTime < 0) {
            this.rideTime = Math.abs(rideTime);
        } else if (rideTime == 0) {
            this.rideTime = 0;
        } else {
            this.rideTime = rideTime;
        }
    }

    public float getRideCost() {
        return rideCost;
    }

    public void setRideCost(float rideCost) {
        if (rideCost < 0) {
            this.rideCost = Math.abs(rideCost);
        } else if (rideCost == 0) {
            System.out.print("Поездка бесплатна");
        } else {
            this.rideCost = rideCost;
        }
    }

    public float getRideTime() {
        return rideTime;
    }

    public void setRideTime(float rideTime) {
        if (rideTime < 0) {
            this.rideTime = Math.abs(rideTime);
        } else if (rideTime == 0) {
            System.out.print("Время поездки не установлено");
        } else {
            this.rideTime = rideTime;
        }
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = Car.validateParameters(departureStation);
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = Car.validateParameters(arrivalStation);
    }

    public int getNumberOfTrainCars() {
        return numberOfTrainCars;
    }

    public void setNumberOfTrainCars(int numberOfTrainCars) {

        if (numberOfTrainCars < 0) {
            this.numberOfTrainCars = Math.abs(numberOfTrainCars);
        } else if (numberOfTrainCars == 0) {
            System.out.print("Пустой");
        } else {
            this.numberOfTrainCars = numberOfTrainCars;
        }
    }

    @Override
    public String toString() {
        return "Поезд " + super.toString() + ", Коли чество вагонов " + getNumberOfTrainCars() + ", Станция отправления " +
                getDepartureStation() + ", Станция прибытия" + getArrivalStation() + ", Стоимость поездки " + getRideCost() + " рублей, " +
                "Время в пути " + getRideTime();
    }
}
