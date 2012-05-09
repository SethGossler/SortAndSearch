package algorithms;

import java.util.ArrayList;

import SortAndSearch.ASearch;


public class linearSearch implements ASearch
{
	public <T extends Comparable<? super T>> int searchFor(T thisObject, ArrayList<T> aList) {
		
		for(int index = 0; index<aList.size()-1; index++){
			if(thisObject.compareTo(aList.get(index)) == 0){
				return index;
			}
		}
		
		return -1;
	}
}
