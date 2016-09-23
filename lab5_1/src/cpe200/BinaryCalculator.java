package cpe200;

import java.math.BigDecimal;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        this.firstOperand = operand;
    }


    public void setSecondOperand(Operand operand) {
        this.secondOperand = operand;
    }

    public String add() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if(first.compareTo(BigDecimal.ZERO) < 0 || second.compareTo(BigDecimal.ZERO) < 0){
            throw new RuntimeException("operand < 1");
        }
        return first.add(second).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if(first.compareTo(BigDecimal.ZERO) < 0 || second.compareTo(BigDecimal.ZERO) < 0){
            throw  new  RuntimeException("operan < 1");
        }
        return first.subtract(second).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if(first.compareTo(BigDecimal.ZERO) < 0 || second.compareTo(BigDecimal.ZERO) < 0){
            throw  new  RuntimeException("operan < 1");
        }
        return first.multiply(second).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if(first.compareTo(BigDecimal.ZERO) < 0 || second.compareTo(BigDecimal.ZERO) < 0){
            throw  new  RuntimeException("operan < 1");
        }
        if(second.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("operand < 1");
        }
        return first.divide(second,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if(first.compareTo(BigDecimal.ZERO) < 0 || second.compareTo(BigDecimal.ZERO) < 0){
            throw  new  RuntimeException("operan < 1");
        }
        return first.pow(second.intValue()).stripTrailingZeros().toString();
    }
}
