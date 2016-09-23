package cpe200;


import sun.nio.cs.ext.Big5_HKSCS;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = operand;
    }

    public void setSecondOperand(Operand operand) {
        secondOperand = operand;
    }

    public String add() throws RuntimeException {
        BigDecimal one = new BigDecimal(firstOperand.getOperand());
        BigDecimal two = new BigDecimal(secondOperand.getOperand());

        if(one.signum()==-1||two.signum()==-1){
            throw new RuntimeException();
        }else{
            return one.add(two).stripTrailingZeros().toString();
        }

    }

    public String subtract() throws RuntimeException {
        BigDecimal one = new BigDecimal(firstOperand.getOperand());
        BigDecimal two = new BigDecimal(secondOperand.getOperand());

        if(one.signum()==-1||two.signum()==-1){
            throw new RuntimeException();
        }else{
            return one.subtract(two).stripTrailingZeros().toString();
        }

    }

    public String multiply() throws RuntimeException {
        BigDecimal one = new BigDecimal(firstOperand.getOperand());
        BigDecimal two = new BigDecimal(secondOperand.getOperand());

        if(one.signum()==-1||two.signum()==-1){
            throw new RuntimeException();
        }else{
            return one.multiply(two).stripTrailingZeros().toString();
        }

    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        BigDecimal one = new BigDecimal(firstOperand.getOperand());
        BigDecimal two = new BigDecimal(secondOperand.getOperand());

        if(one.signum()==-1||two.signum()==-1){
            throw new RuntimeException();
        }else{
            return one.divide(two,5, RoundingMode.HALF_UP).stripTrailingZeros().toString();
        }

    }

    public String power() throws RuntimeException {
        BigDecimal one = new BigDecimal(firstOperand.getOperand());
        BigDecimal two = new BigDecimal(secondOperand.getOperand());

        if(one.signum() == -1 || two.signum() == -1){
            throw new RuntimeException();
        }else{
            return one.pow(two.intValueExact()).stripTrailingZeros().toString();
        }

    }
}
