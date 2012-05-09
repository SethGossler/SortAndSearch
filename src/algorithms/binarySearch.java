package algorithms;

import java.util.ArrayList;

import SortAndSearch.ASearch;


public class binarySearch implements ASearch{
	
	public <T extends Comparable<? super T>> int searchFor(T thisObject, ArrayList<T> aList){
		
		int index = myBinarySearch(thisObject, aList);
		
		return index;
	}
	
	public <T extends Comparable<? super T>> int myBinarySearch(T thisObject, ArrayList<T> aList){
		
		int lo = 0;
		int hi = aList.size()-1;
		
		while(lo <= hi)
		{
			int mid = (lo + hi)/2;
			if(thisObject.compareTo(aList.get(mid))>0){
				lo = mid + 1;
			}
			else if(thisObject.compareTo(aList.get(mid))<0){
				hi = mid;
			}
			else
			{
				return mid;
			}
		}
		return -1;
	}
}
