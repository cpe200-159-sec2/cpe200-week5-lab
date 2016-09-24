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
        if(getFirstOperand().intValue()<0||getSecondOperand().intValue()<0)
            throw new RuntimeException("error");
        return getFirstOperand().add(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        if(getFirstOperand().intValue()<0||getSecondOperand().intValue()<0)
            throw new RuntimeException("error");
        return getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        if(getFirstOperand().intValue()<0||getSecondOperand().intValue()<0)
            throw new RuntimeException("error");
        return getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if(getFirstOperand().intValue()<0||getSecondOperand().intValue()<0||getSecondOperand().toString()=="0")
            throw new RuntimeException("error");
        return getFirstOperand().divide(getSecondOperand(),5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        int power = getFirstOperand().intValue();
        if(getFirstOperand().intValue()<0||getSecondOperand().intValue()<0)
            throw new RuntimeException("error");
        return getFirstOperand().stripTrailingZeros().pow(getSecondOperand().intValue()).stripTrailingZeros().toString();

    }

    public void setFirstOperand(BigDecimal firstOperand){
        this.firstOperand = firstOperand;
    }

    public void setSecondOperand(BigDecimal secondOperand){
        this.secondOperand = secondOperand;
    }

    public BigDecimal getFirstOperand() {
        return firstOperand;
    }

    public BigDecimal getSecondOperand() {
        return secondOperand;
    }
}
