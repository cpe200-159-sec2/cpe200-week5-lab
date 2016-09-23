package cpe200;
import java.math.BigDecimal;


public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    private BigDecimal FirstOperand;
    private BigDecimal SecondOperand;
    private BigDecimal Result;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        setFirstOperand(new BigDecimal(operand.getOperand()));
    }


    public void setSecondOperand(Operand operand) {
        setSecondOperand(new BigDecimal(operand.getOperand()));
    }

    public String add() throws RuntimeException
    {
        if(getSecondOperand().intValue()<0||getFirstOperand().intValue()<0)
            throw new RuntimeException("Add Error");
        setResult(getFirstOperand().add(getSecondOperand()).stripTrailingZeros());
            return getResult().toString();
    }

    public String subtract() throws RuntimeException
    {
        if(getSecondOperand().intValue()<0||getFirstOperand().intValue()<0)
            throw new RuntimeException("Subtract Error");
        setResult(getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros());
            return getResult().toString();

    }

    public String multiply() throws RuntimeException
    {
        if(getSecondOperand().intValue()<0||getFirstOperand().intValue()<0)
            throw new RuntimeException("Multiply Error");
        setResult(getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros());
            return getResult().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException
    {
        if(getSecondOperand().intValue()<0||getFirstOperand().intValue()<0)
            throw new RuntimeException("Division Error");
        setResult(getFirstOperand().divide(getSecondOperand(),5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros());
            return getResult().toString();
    }

    public String power() throws RuntimeException
    {
        if(getSecondOperand().intValue()<0||getFirstOperand().intValue()<0)
            throw new RuntimeException("Power Error");
        setResult(getFirstOperand().pow(getSecondOperand().intValue()).stripTrailingZeros());
            return getResult().toString();
    }

    public BigDecimal getFirstOperand() {
        return FirstOperand;
    }

    public void setFirstOperand(BigDecimal firstOperand) {
        FirstOperand = firstOperand;
    }

    public BigDecimal getSecondOperand() {
        return SecondOperand;
    }

    public void setSecondOperand(BigDecimal secondOperand) {
        SecondOperand = secondOperand;
    }

    public BigDecimal getResult() {
        return Result;
    }

    public void setResult(BigDecimal result) {
        Result = result;
    }
}
