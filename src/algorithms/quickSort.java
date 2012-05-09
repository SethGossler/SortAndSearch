package algorithms;

import java.util.ArrayList;

import SortAndSearch.ASort;


public class quickSort implements ASort{


	public <T extends Comparable<? super T>> ArrayList<T> sort(ArrayList<T> needsSorting) {
		myQuickSort(needsSorting, 0, needsSorting.size()-1);
		return needsSorting;
	}
	
	public <T extends Comparable<? super T>> void myQuickSort(ArrayList<T> dirtyList, int lowEnd, int highEnd){
		
		if(highEnd <= lowEnd){
			return;
		}
		
		int leftPointer = lowEnd;
		int rightPointer = highEnd;
		
		int pivotPointer = lowEnd;
		T pivotValue = dirtyList.get(pivotPointer); //For swapping values
		
		while(leftPointer < rightPointer){
			
			leftPointer = lowEnd;
			rightPointer = highEnd;
			
			while(dirtyList.get(leftPointer).compareTo(pivotValue) <= 0 && leftPointer < pivotPointer){
				leftPointer++;
			}
			
			if(dirtyList.get(leftPointer).compareTo(pivotValue)>0){
				dirtyList.set(pivotPointer, dirtyList.get(leftPointer));
				dirtyList.set(leftPointer, pivotValue);
				pivotPointer = leftPointer;
			}
			
			while(dirtyList.get(rightPointer).compareTo(pivotValue)>=0 && pivotPointer < rightPointer){
				rightPointer--;
			}
			
			if(dirtyList.get(rightPointer).compareTo(pivotValue)<0){
				dirtyList.set(pivotPointer, dirtyList.get(rightPointer));
				dirtyList.set(rightPointer, pivotValue);
				pivotPointer = rightPointer;
			}
		}
		
		myQuickSort(dirtyList, lowEnd, pivotPointer-1);
		myQuickSort(dirtyList, pivotPointer+1, highEnd);
		
	}
	
}
