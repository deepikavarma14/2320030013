package com.example.minmax;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = {3, 1, 4, 1, 5, 9};
        MinMax<Integer> intMinMax = new MinMaxImpl<>();
        System.out.println("Integer Array Max: " + intMinMax.findMax(intArray));
        System.out.println("Integer Array Min: " + intMinMax.findMin(intArray));
        String[] strArray = {"apple", "banana", "cherry", "date"};
        MinMax<String> strMinMax = new MinMaxImpl<>();
        System.out.println("String Array Max: " + strMinMax.findMax(strArray));
        System.out.println("String Array Min: " + strMinMax.findMin(strArray));
        Character[] charArray = {'d', 'a', 'c', 'b'};
        MinMax<Character> charMinMax = new MinMaxImpl<>();
        System.out.println("Character Array Max: " + charMinMax.findMax(charArray));
        System.out.println("Character Array Min: " + charMinMax.findMin(charArray));
        Float[] floatArray = {3.14f, 1.59f, 2.65f, 3.58f};
        MinMax<Float> floatMinMax = new MinMaxImpl<>();
        System.out.println("Float Array Max: " + floatMinMax.findMax(floatArray));
        System.out.println("Float Array Min: " + floatMinMax.findMin(floatArray));
	}

}
