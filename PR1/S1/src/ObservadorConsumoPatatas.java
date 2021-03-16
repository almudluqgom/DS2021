import java.util.Observable;
import java.util.Observer;

public class ObservadorConsumoPatatas implements Observer {

        ConcreteObservable p;
        
        
        @Override
	public void update(Observable o, Object arg) {
		if (arg instanceof ConcreteObservable){
                    p = (ConcreteObservable) arg;
                    System.out.printf("producto actualizado");
                  
                } 
	}

}