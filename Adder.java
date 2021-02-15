package com.kennywambu.lessons;

public class Adder extends CalculateBase {
    public Adder(){}
    public Adder(double leftval, double rightval){
        super(leftval,rightval);
    }
    @Override
    public void calculate(){
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }
}
