package com.kennywambu.lessons;

public class MathEquation {
    double leftVal;
    double rightVal;
    char opCode;
    double result;

    private  static  int numberOfCalculations;
    private  static double sumOfResults;


    public MathEquation(){}

    public MathEquation(char opCode){
        this.opCode = opCode;//initialised value of the opCode
    }
    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);//chain a constructor
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    void execute(){
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
        }

        numberOfCalculations++;
        sumOfResults += result;
    }
    public  static double getAverageResults() {
        return  sumOfResults/numberOfCalculations;
    }

    public double setLeftVal(double leftVal) {
        this.leftVal = leftVal;
        return leftVal;
    }

    public double setRightVal(double rightVal) {
        this.rightVal = rightVal;
        return rightVal;

    }

    public char setOpCode(char opCode) {
        this.opCode = opCode;
        return opCode;
    }
}
