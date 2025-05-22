package week12;

public class SmartPhone {
	Earphone ep;
	
	public void musicOn(Earphone ep) {
		this.ep = ep;
		ep.play();
	}
	
	public void musicOff() {
		ep.stop();
	}
}
