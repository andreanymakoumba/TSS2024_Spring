package comportamentali.memento;

public class Memento {
	
	private String state;
	
	public Memento(String state) {
		this.state = state;
	}

	public void setState(String text) {
		state = text;
	}

	public String getState() {
		return state;
	}
	
	
}
