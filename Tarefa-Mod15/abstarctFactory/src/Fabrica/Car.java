package Fabrica;

public class Car {
    private String name;
    private String color;
    private int horsePower;
    private int fuelCapacity;

    public Car(int horsePower, int fuelCapacity, String color, String name) {
        this.horsePower = horsePower;
        this.fuelCapacity = fuelCapacity;
        this.color = color;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }
}


