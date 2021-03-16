import java.util.Observable;

public class ConcreteObservable extends Observable{

	private int nprod;
        
	public int getState() {
		return this.nprod;
	}
        
	public void setNumProd(int numprod) {
            
                synchronized (this) {
            
		this.nprod = numprod;  
                this.setChanged();
                this.notifyObservers();
                
                }
             
	}
        //notify heredado de Observable
        //addobserver heredado de Observable
        //setchanged heredado de Observable
}