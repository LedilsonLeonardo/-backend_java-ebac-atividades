package Fabrica;

public abstract class Factory {

    public Car create(String carType, String color) {
        Car car = retrieveCar(carType, color);
        return car;
    }

    protected abstract Car retrieveCar(String carType, String color);

}
