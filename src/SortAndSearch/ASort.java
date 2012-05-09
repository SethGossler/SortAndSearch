package SortAndSearch;
import java.util.ArrayList;


public interface ASort 
{
	public <T extends Comparable<? super T>> ArrayList<T> sort(ArrayList<T> needsSorting);	
}
