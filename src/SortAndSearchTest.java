
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import SortAndSearch.SortAndSearch;
import algorithms.linearSearch;


public class SortAndSearchTest {
	
	public static SortAndSearch mySortAndSearch= new quickSortBinarySearch();
	
	@Before
	public void makeList(){
		//Setting up the test
		ArrayList<String> aList = new ArrayList<String>();
		
		aList.add("z");
		aList.add("b");
		aList.add("c");
		aList.add("d");
		aList.add("f");
		aList.add("e");
		aList.add("g");
		aList.add("h");
		aList.add("m");
		aList.add("j");
		aList.add("k");
		aList.add("l");
		aList.add("i");
		aList.add("n");
		aList.add("o");
		aList.add("p");
		aList.add("q");
		aList.add("r");
		aList.add("s");
		aList.add("t");
		aList.add("u");
		aList.add("v");
		aList.add("w");
		aList.add("a");


		mySortAndSearch.setList(aList);
		
	}
	
	
	@Test
	public void test_sort(){
		System.out.println("Testing if an array sorts");
		mySortAndSearch.performSort();
		assertTrue(mySortAndSearch.getList().get(0).equals("a"));
	
	}
	
	/*
	 * An extensive test on the search
	 */
	@Test
	public void testSearchSuccess(){
		System.out.println("testing if it can find the right index");
		mySortAndSearch.performSort();
		System.out.println(mySortAndSearch.getList());
		assertTrue(mySortAndSearch.performSearch("a") == 0);
		assertTrue(mySortAndSearch.performSearch("b") == 1);
		assertTrue(mySortAndSearch.performSearch("c") == 2);
		assertTrue(mySortAndSearch.performSearch("d") == 3);
		assertTrue(mySortAndSearch.performSearch("e") == 4);
		assertTrue(mySortAndSearch.performSearch("f") == 5);
		assertTrue(mySortAndSearch.performSearch("g") == 6);
		assertTrue(mySortAndSearch.performSearch("h") == 7);
		assertTrue(mySortAndSearch.performSearch("i") == 8);
		assertTrue(mySortAndSearch.performSearch("j") == 9);
		assertTrue(mySortAndSearch.performSearch("k") == 10);
		assertTrue(mySortAndSearch.performSearch("l") == 11);
		assertTrue(mySortAndSearch.performSearch("m") == 12);
		assertTrue(mySortAndSearch.performSearch("n") == 13);
		assertTrue(mySortAndSearch.performSearch("o") == 14);
		assertTrue(mySortAndSearch.performSearch("p") == 15);
		assertTrue(mySortAndSearch.performSearch("q") == 16);
		assertTrue(mySortAndSearch.performSearch("r") == 17);
		

	}
	
	/*
	 * Showing a search failing
	 */
	@Test
	public void testSearchFailure(){
		assertTrue(mySortAndSearch.performSearch("z")!=0); 
	}

	/*
	 * Testing on the fly search type swapping.
	 */
	@Test
	public void switchSearchType(){
		mySortAndSearch.performSort();
		mySortAndSearch.setSearchType(new linearSearch());
		assertTrue(mySortAndSearch.performSearch("a") == 0);
	}
}
