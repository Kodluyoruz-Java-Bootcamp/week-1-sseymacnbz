package _9;

import java.util.ArrayList;

public class MyList implements IMyList{
	
	ArrayList<String> myList = new ArrayList<String>(5);
	int currentCapacity = 5;
	int increaseCapacity = 7;
	
	
	@Override
	public ArrayList<String> add(String str) throws Exception{
		
		if(myList.size()==currentCapacity) {
			myList.ensureCapacity(increaseCapacity);
			currentCapacity += increaseCapacity;
		}
		
		
		if((str.charAt(0) == 'c') || (str.charAt(0) == 'C')) {
			myList.add(str);
		}
		else {
			throw new Exception ("Your first character must be 'c' !!!");
		}
		
		
		return myList;
	}

	@Override
	public void print() {
		System.out.println(myList);
	}
	
	public void getCapacity(){
        System.out.println(currentCapacity);
    }
	
}
