package easy;

public class StringVersion {

	public int compareVersion(String version1, String version2) {
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		
		int count = (v1.length > v2.length) ? v2.length : v1.length;
		int i = 0;
		for (i = 0; i < count; i++) {
			if (Integer.parseInt(v1[i]) > Integer.parseInt(v2[i])) return 1;
			if (Integer.parseInt(v1[i]) < Integer.parseInt(v2[i])) return -1;
		}
		
		while (i < v1.length) {
			if (Integer.parseInt(v1[i]) != 0) return 1;
			i++;
		}
		while (i < v2.length) {
			if (Integer.parseInt(v2[i]) != 0) return -1;
			i++;
		}
		return 0;
    }
	
}
