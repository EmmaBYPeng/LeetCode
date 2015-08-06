package easy;

public class RecArea {

	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = area(A, B, C, D);
        int area2 = area(E, F, G, H);
        
        int left = Math.max(A, E);
        int right = Math.min(C, G);
        int top = Math.min(D, H);
        int bottom = Math.max(B, F);
        
        int overlap = 0;
        if (bottom < top && right > left) 
        	overlap = area(left, bottom, right, top);
        
        return area1 + area2 - overlap;
    }
	
	public int area(int A, int B, int C, int D) {
		int width = Math.abs(A - C);
		int depth = Math.abs(B - D);
		
		return width * depth;
	}
}
