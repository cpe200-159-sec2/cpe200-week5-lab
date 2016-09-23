package cpe200;

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

    public String add() {
        BigDecimal temp1 = new BigDecimal(firstOperand.getOperand());
        BigDecimal temp2 = new BigDecimal(secondOperand.getOperand());

        if(temp1.signum() < 0 || temp2.signum() < 0) throw new RuntimeException();

        return temp1.add(temp2).stripTrailingZeros().toString();
    }

    public String subtract() {
        BigDecimal temp1 = new BigDecimal(firstOperand.getOperand());
        BigDecimal temp2 = new BigDecimal(secondOperand.getOperand());

        if(temp1.signum() < 0 || temp2.signum() < 0) throw new RuntimeException();

        return temp1.subtract(temp2).stripTrailingZeros().toString();
    }

    public String multiply() {
        BigDecimal temp1 = new BigDecimal(firstOperand.getOperand());
        BigDecimal temp2 = new BigDecimal(secondOperand.getOperand());

        if(temp1.signum() < 0 || temp2.signum() < 0) throw new RuntimeException();

        return temp1.multiply(temp2).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        BigDecimal temp1 = new BigDecimal(firstOperand.getOperand());
        BigDecimal temp2 = new BigDecimal(secondOperand.getOperand());

        if(temp1.signum() < 0 || temp2.signum() < 0) throw new RuntimeException();

        return temp1.divide(temp2,5, RoundingMode.HALF_UP).stripTrailingZeros().toString();
    }

    public String power() {
        BigDecimal temp1 = new BigDecimal(firstOperand.getOperand());
        BigDecimal temp2 = new BigDecimal(secondOperand.getOperand());

        if(temp1.signum() < 0 || temp2.signum() < 0) throw new RuntimeException();

        return temp1.pow(temp2.intValue()).stripTrailingZeros().toString();
    }

}