package easy;

public class Test {

	public static void main(String[] args) {
		StringVersion test = new StringVersion();
		
		String v1 = "1";
		String v2 = "1.01";
		System.out.println(test.compareVersion(v1, v2));
		
	}
}
