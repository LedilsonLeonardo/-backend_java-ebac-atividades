package Fabrica;

public class CarFactory extends Factory{
    @Override
    protected Car retrieveCar(String carType, String color) {
        if (carType.equalsIgnoreCase("Esportivo")){
            return new Onix(color);

        }else if (carType.equalsIgnoreCase("Econômico")){
            return new Uno(color);
        }
        return null;
    }
}
