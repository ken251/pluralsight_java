package com.kennywambu.lessons;


import javafx.scene.control.SplitPane;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // performCalculation();
          Divider divider = new Divider();
          doCalculation(divider, 100.0d,50.0d);

          Adder adder = new Adder();
          doCalculation(adder,25.0d,92.0d);
    }

    static void doCalculation(CalculateBase calculation, double leftVal, double rightVal){
      calculation.setLeftVal(leftVal);
      calculation.setRightVal(rightVal);
      calculation.calculate();
      System.out.println("Calculation results = " + calculation.getResult());


    }
    static void performCalculation() {
        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d',100.0d,50.0d);
        equations[1] = new MathEquation('a',25.0d,92.0d);
        equations[2] = new MathEquation('s',225.0d,17.0d);
        equations[3] = new MathEquation('m',11.0d,3.0d);

        for(MathEquation equation : equations){

            equation.execute();
            System.out.println("result = " +equation.getResult());
        }

        System.out.println("Average result = "+ MathEquation.getAverageResults() );

        System.out.println();
        System.out.println("using execute overloads");
        System.out.println();

        MathEquation equationOverload = new MathEquation('d');
        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        equationOverload.execute(leftDouble, rightDouble);
        System.out.println("overloaded result with double: "+ equationOverload.getResult());

        int leftInt =9;
        int rightint = 4;
        equationOverload.execute(leftInt,rightint);
        System.out.println("Overloaded results with ints: "+equationOverload.getResult());
        //java can covert ints to double when need be(widening conversions)


    }
}
