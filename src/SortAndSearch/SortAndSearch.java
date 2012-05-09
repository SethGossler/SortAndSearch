package SortAndSearch;

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public abstract class SortAndSearch 
{
	ASearch aSearch;
	ASort aSort;
	

	ArrayList aList;
	
	public SortAndSearch(){
		
	}
	
	public <T extends Comparable<? super T>> ArrayList<T> performSort(){
		aList = aSort.sort(aList);
		return aList;
	}
	
	public <T extends Comparable<? super T>> int performSearch(T thisObject){
		return aSearch.searchFor(thisObject, aList);
	}
	
	public void setSortType(ASort diffSort){
		this.aSort = diffSort;
	}
	
	public void setSearchType(ASearch diffSearch){
		this.aSearch = diffSearch;
		
	}
	
	public void setList(ArrayList thatList){
		this.aList = thatList;
	}
	
	public ArrayList getList(){
		return this.aList;
	}
}
