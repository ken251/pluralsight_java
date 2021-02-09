package com.kennywambu.lessons;

public class Subtracter extends CalculateBase {
    @Override
    public void calculate(){
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
