import java.util.Observable;
import java.util.Observer;

public class ObservadorConsumoPatatas implements Observer {

        ConcreteObservable p;
        
        @Override
	public void update(Observable o, Object arg) {
            
		if (o instanceof ConcreteObservable){
                    p = (ConcreteObservable) arg;

                } 
	}

}