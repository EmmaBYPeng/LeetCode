package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        if (numRows <= 0) return list;
        
        if (numRows == 1) {
        	List<Integer> elem = new ArrayList<Integer>();
        	elem.add(1);
        	list.add(elem);
        	return list;
        }
        
    	List<Integer> elem1 = new ArrayList<Integer>();
    	elem1.add(1);
    	list.add(elem1);
    	
    	for (int i = 1; i < numRows; i++) {
    		List<Integer> elem2 = new ArrayList<Integer>();
        	elem2.add(1); 
        	for (int j = 1; j < i; j++) {
        		int num = elem1.get(j-1) + elem1.get(j);
        		elem2.add(num);
        	}
        	elem2.add(1);
        	list.add(elem2);
        	elem1 = elem2;
    	}
        	
        return list;
    }
	
	public List<Integer> getRow(int rowIndex) {
		List<Integer> row = new ArrayList<Integer>();
		List<Integer> row0 = new ArrayList<Integer>();
		
		if (rowIndex < 0) return row;
		
		if (rowIndex == 0) {
			row.add(1);
			return row;
		}
				
		for (int i = 1; i <= rowIndex; i++) {
			row.add(1);
			for (int j = 1; j < i; j++) {
				int num = row0.get(j-1) + row0.get(j);
				row.add(num);
			}
			row.add(1);
			row0.clear();
			for (Integer x: row) {
				row0.add(x);
			}
			row.clear();
		}
		
		return row0;
		
    }

}
