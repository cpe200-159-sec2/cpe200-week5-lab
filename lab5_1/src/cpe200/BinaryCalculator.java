package cpe200;


import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BinaryCalculator {
    private MathContext mathContext;

    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {
        mathContext = new MathContext(6, RoundingMode.HALF_UP);
        firstOperand = new Operand(0);
        secondOperand = new Operand(0);
    }

    public void setFirstOperand(Operand operand) {
        firstOperand.setOperand(operand.getOperand());
    }

    public void setSecondOperand(Operand operand) {
        secondOperand.setOperand(operand.getOperand());
    }

    public String add() throws ArithmeticException {
        BigDecimal addend = new BigDecimal(firstOperand.getOperand());
        BigDecimal augend = new BigDecimal(secondOperand.getOperand());
        if (addend.signum() == -1 || augend.signum() == -1) {
            throw new RuntimeException("Does not operate on negative numbers");
        }
        BigDecimal result = addend.add(augend);
        return result.round(mathContext).stripTrailingZeros().toString();
    }

    public String subtract() throws ArithmeticException {
        BigDecimal minuend = new BigDecimal(firstOperand.getOperand());
        BigDecimal subtrahend = new BigDecimal(secondOperand.getOperand());
        if (minuend.signum() == -1 || subtrahend.signum() == -1) {
            throw new RuntimeException("Does not operate on negative numbers");
        }
        BigDecimal result = minuend.subtract(subtrahend);
        return result.round(mathContext).stripTrailingZeros().toString();
    }

    public String multiply() throws ArithmeticException {
        BigDecimal multiplier = new BigDecimal(firstOperand.getOperand());
        BigDecimal multiplicand = new BigDecimal(secondOperand.getOperand());
        if (multiplier.signum() == -1 || multiplicand.signum() == -1) {
            throw new RuntimeException("Does not operate on negative numbers");
        }
        BigDecimal result = multiplier.multiply(multiplicand);
        return result.round(mathContext).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String divide() throws ArithmeticException {
        BigDecimal dividend = new BigDecimal(firstOperand.getOperand());
        BigDecimal divisor = new BigDecimal(secondOperand.getOperand());
        BigDecimal result = dividend.divide(divisor, mathContext);
        if (dividend.signum() == -1 || divisor.signum() == -1) {
            throw new RuntimeException("Does not operate on negative numbers");
        }
        return result.stripTrailingZeros().toString();
    }
    public String division() throws ArithmeticException {
        return divide();
    }

    public String power() throws ArithmeticException {
        BigDecimal base = new BigDecimal(firstOperand.getOperand());
        BigDecimal exponent = new BigDecimal(secondOperand.getOperand());
        if (base.signum() == -1 || exponent.signum() == -1) {
            throw new RuntimeException("Does not operate on negative numbers");
        }
        BigDecimal result = base.pow(exponent.intValue());
        return result.round(mathContext).stripTrailingZeros().toString();
    }

}
