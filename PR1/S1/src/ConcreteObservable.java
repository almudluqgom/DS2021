import java.util.Observable;

public class ConcreteObservable extends Observable{

	private int npatatas;
      
	public int getState() {
		return this.npatatas;
	}
	/**
	 * 
	 * @param state
	 */
	public void setState(int state) {
		this.npatatas = state;
                this.setChanged();
                this.notifyObservers();
                //llamar a la hebra
	}
        
        //notify heredado de Observable
        //addobserver heredado de Observable
        //setchanged heredado de Observable
}