package cpe200;

import java.math.BigDecimal;
import java.util.concurrent.TimeoutException;
import java.util.zip.CheckedInputStream;


public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {
        firstOperand = BigDecimal.ZERO;
        secondOperand = BigDecimal.ZERO;
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = new BigDecimal(operand.getOper());
    }

    public void setSecondOperand(Operand operand) {
        secondOperand = new BigDecimal(operand.getOper());
    }

    public String add() throws RuntimeException {
        if (firstOperand.compareTo(BigDecimal.ZERO) <= 0 || secondOperand.compareTo(BigDecimal.ZERO) <= 0){
            throw new RuntimeException("No negative");
        }
        return firstOperand.add(secondOperand).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        if (firstOperand.compareTo(BigDecimal.ZERO) <= 0 || secondOperand.compareTo(BigDecimal.ZERO) <= 0){
            throw new RuntimeException("No negative");
        }
        return firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        if (firstOperand.compareTo(BigDecimal.ZERO) <= 0 || secondOperand.compareTo(BigDecimal.ZERO) <= 0){
            throw new RuntimeException("No negative");
        }
        return firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if(secondOperand.compareTo(BigDecimal.ZERO) == 0){
            throw new ArithmeticException("non-zero");
        }
        if (firstOperand.compareTo(BigDecimal.ZERO) <= 0 || secondOperand.compareTo(BigDecimal.ZERO) <= 0){
            throw new RuntimeException("No negative");
        }
        return firstOperand.divide(secondOperand,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        if (firstOperand.compareTo(BigDecimal.ZERO) <= 0 || secondOperand.compareTo(BigDecimal.ZERO) <= 0){
            throw new RuntimeException("No negative");
        }
        return this.firstOperand.pow(secondOperand.intValue()).stripTrailingZeros().toString();
    }

}
