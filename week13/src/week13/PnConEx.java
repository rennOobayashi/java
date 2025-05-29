package week13;

public class PnConEx {
	public static void main(String[] args) {
		DataBox rw = new DataBox();
		ThreadP p = new ThreadP(rw);
		ConsumerThread con = new ConsumerThread(rw);
		
		p.start();
		con.start();		
	}

}
