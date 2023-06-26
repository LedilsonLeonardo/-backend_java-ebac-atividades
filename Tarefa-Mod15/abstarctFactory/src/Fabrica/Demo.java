package Fabrica;

public class Demo {
    public static void  main (String[] args){
        Factory carFactory = new CarFactory();

        Car carOnix = carFactory.create("Esportivo","Prata");
        System.out.println("Carro: " + carOnix.getName() + " - " + carOnix.getColor());

        Car carUno = carFactory.create("Econômico","Cinza");
        System.out.println("Carro: " + carUno.getName() + " - " + carUno.getColor());
    }
}
