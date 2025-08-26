package com.practice.java.array.examples;

/**
 * 
 * @author P V UdayKiran
 *
 * @version 1, changes on Mon 25-Nov-2019 20:59
 */
public class HowToIncreaseIntArraySizeDynamically {

	public static void main(String[] args) {

		HowToIncreaseIntArraySizeDynamically arr = new HowToIncreaseIntArraySizeDynamically();

        for (int i = 1; i <= 25; i++) {
            arr.add(i);
        }

        arr.print(); // prints 1 to 25

	}
	
	private int[] data;
    private int size;

    public HowToIncreaseIntArraySizeDynamically() {
        data = new int[10]; // initial capacity
        size = 0;
    }

    public void add(int value) {
        if (size == data.length) {
            resize();
        }
        data[size++] = value;
    }

    private void resize() {
        int newCapacity = data.length * 2;
        int[] newData = new int[newCapacity];
        System.arraycopy(data, 0, newData, 0, data.length);//src, srcPos, dest, destPos, length
        data = newData;
    }

    public int get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return data[index];
    }

    public int size() {
        return size;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}
