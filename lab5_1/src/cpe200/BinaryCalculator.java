package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

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

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        setFirstOperand(new BigDecimal(operand.getOperand()));
    }

    public void setSecondOperand(Operand operand) {
        setSecondOperand(new BigDecimal(operand.getOperand()));
    }

    public String add() throws RuntimeException {
        if (getSecondOperand().intValue() < 0 || getFirstOperand().intValue() < 0) {
            throw new RuntimeException("ERROR");
        }
        return getFirstOperand().add(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        if (getSecondOperand().intValue() < 0 || getFirstOperand().intValue() < 0) {
            throw new RuntimeException("ERROR");
        }
        return getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        if (getSecondOperand().intValue() < 0 || getFirstOperand().intValue() < 0) {
            throw new RuntimeException("ERROE");
        }
        return getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (getSecondOperand().toString() == "0" || getSecondOperand().intValue() < 0 || getFirstOperand().intValue() < 0) {
            throw new RuntimeException("ERROR");
        }
        return getFirstOperand().divide(getSecondOperand(), 5, BigDecimal.ROUND_CEILING).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        int powered = getFirstOperand().intValue();
        if (getSecondOperand().intValue() < 0 || getFirstOperand().intValue() < 0) {
            throw new RuntimeException("ERROR");
        }
        return getFirstOperand().stripTrailingZeros().pow(getSecondOperand().intValue()).stripTrailingZeros().toString();
    }
}
