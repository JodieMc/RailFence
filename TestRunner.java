package ie.gmit.dip;

public class TestRunner {
	private RailFenceCypher rfc = new RailFenceCypher();

	public void test() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			rfc.encrypt(file("file.txt" + i));
		}
		System.out.println("[INFO] Time(ms): " + (System.currentTimeMillis() - start));
	}

	private String file(String string) {
		return null;
	}

	{

		new TestRunner().test();

	}
}
