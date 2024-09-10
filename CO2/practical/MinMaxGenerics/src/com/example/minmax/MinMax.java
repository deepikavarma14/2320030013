package com.example.minmax;

public interface MinMax <T extends Comparable<T>>{
	T findMax(T[] array);
    T findMin(T[] array);
}