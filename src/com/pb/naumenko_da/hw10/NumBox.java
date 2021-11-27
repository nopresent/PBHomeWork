package com.pb.naumenko_da.hw10;

import java.util.Arrays;

public class NumBox<T extends Number> {

    private final T[] numBox;           // Наш Массив
    private int currentArraySize;       // Текущий размер


    public NumBox(int numBoxSize) {
        numBox = (T[]) new Number[numBoxSize];
    }

    public void add(T num) {
        if ((currentArraySize+1) > numBox.length) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            numBox[currentArraySize++] = num;
        }
    }

    public T get (int index) {
        return numBox[index];
    }

    public int length (){
        return currentArraySize;
    }

    public double average() {
        return sum()/currentArraySize;
    }

    public double sum() {
        double sumz = 0.0;
        for (int i = 0; i < currentArraySize; i++) {
            sumz += numBox[i].doubleValue();
        }
        return sumz;
    }

    public T max() {
        T[] tmpArr = Arrays.copyOfRange(numBox,0,currentArraySize);
        Arrays.sort(tmpArr);
        return tmpArr[currentArraySize-1];
    }

    @Override
    public String toString() {
        return "NumBox{" +
                "numBox=" + Arrays.toString(numBox) +
                '}';
    }
}
