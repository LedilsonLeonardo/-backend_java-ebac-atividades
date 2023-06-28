import java.util.ArrayList;
import java.util.List;

public class Carro <E> {
    private E car;

    public Carro (E car){
        this.car = car;
    }
    public  void getListCarr(){
        listCarros();

    }
    private  void listCarros(){
        List <E>listCar = new ArrayList<>();
        listCar.add(car);
        for( E carros:listCar){
            System.out.println("Carrp" + carros);
        }
    }

}
