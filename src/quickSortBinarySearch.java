import SortAndSearch.SortAndSearch;
import algorithms.binarySearch;
import algorithms.quickSort;



public class quickSortBinarySearch extends SortAndSearch 
{
	public quickSortBinarySearch(){
		setSortType(new quickSort());
		setSearchType(new binarySearch());
	}
	
}
