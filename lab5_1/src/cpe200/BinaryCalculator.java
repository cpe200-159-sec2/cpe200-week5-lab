package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        setFirstOperand(new BigDecimal(operand.getOperand()));
    }


    public void setSecondOperand(Operand operand) {
        setSecondOperand(new BigDecimal(operand.getOperand()));
    }

    public String add() throws RuntimeException {
        if (getFirstOperand().intValue() < 0.0 || getSecondOperand().intValue() < 0.0)
            throw new RuntimeException("Nagative value");
        String add = getFirstOperand().add(getSecondOperand()).stripTrailingZeros().toString();
        return add;
    }

    public String subtract() throws RuntimeException {
        if (getFirstOperand().intValue() < 0.0 || getSecondOperand().intValue() < 0.0)
            throw new RuntimeException("Nagative value");
        String sub = getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros().toString();
        return sub;
    }

    public String multiply() throws RuntimeException {
        if (getFirstOperand().intValue() < 0.0 || getSecondOperand().intValue() < 0.0)
            throw new RuntimeException("Nagative value");
        String mul = getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros().toString();
        return mul;
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        String divi = getFirstOperand().divide(getSecondOperand(), 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
        if (getFirstOperand().intValue() < 0 || getSecondOperand().intValue() < 0) {
            throw new RuntimeException("Nagative value");
        } else if (getSecondOperand().intValue() == 0) {
            throw new ArithmeticException("divide by zero");
        }
        return divi;
    }

    public String power() throws RuntimeException {
        if (getFirstOperand().intValue() < 0.0 || getSecondOperand().intValue() < 0.0)
            throw new RuntimeException("Nagative value");
        String pow = getFirstOperand().pow(getSecondOperand().intValue()).stripTrailingZeros().toString();
        return pow;
    }

    public BigDecimal getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(BigDecimal firstOperand) {
        this.firstOperand = firstOperand;
    }

    public BigDecimal getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(BigDecimal secondOperand) {
        this.secondOperand = secondOperand;
    }
}
