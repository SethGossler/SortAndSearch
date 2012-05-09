package SortAndSearch;
import java.util.ArrayList;


public interface ASearch 
{
	public <T extends Comparable<? super T>> int searchFor(T object, ArrayList<T> aList);
}
