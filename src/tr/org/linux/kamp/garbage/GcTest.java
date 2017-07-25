package tr.org.linux.kamp.garbage;

public class GcTest {
	int value;
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Garbage collector çalıştı.");
	}

}
