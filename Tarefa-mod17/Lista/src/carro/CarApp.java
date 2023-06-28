package carro;

public class Car {
     public static  void main(String[] args){
         Car <String> car1 = new Car<>("Gol");
         car1.getListCar();

         Car <String> car2 = new Car<>("Fiesta");
         car2.getListCar();

         Car <String> car3 = new Car<>("Uno");
         car3.getListCar();
     }
}
