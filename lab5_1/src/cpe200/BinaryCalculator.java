package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {
        firstOperand  = new BigDecimal(0);
        secondOperand = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = new BigDecimal(operand.getOperand());
    }


    public void setSecondOperand(Operand operand) {
        secondOperand = new BigDecimal(operand.getOperand());
    }

    public String add() throws RuntimeException {
        if(getFirstOperand().intValue()<0||getSecondOperand().intValue()<0)throw new RuntimeException("ERROR");
        return  firstOperand.add(secondOperand).stripTrailingZeros().toString();
    }

    public String subtract() throws RuntimeException {
        if(getFirstOperand().intValue()<0||getSecondOperand().intValue()<0)throw new RuntimeException("ERROR");
        return  firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
    }

    public String multiply() throws RuntimeException {
        if(getFirstOperand().intValue()<0||getSecondOperand().intValue()<0)throw new RuntimeException("ERROR");
        return firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if(getSecondOperand().toString()=="0"||getSecondOperand().intValue()<0||getFirstOperand().intValue()<0){
            throw new RuntimeException("Error");
        }
        return firstOperand.divide(secondOperand,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() throws RuntimeException {
        if(getFirstOperand().intValue()<0||getSecondOperand().intValue()<0)throw new RuntimeException("ERROR");
        return firstOperand.pow(secondOperand.intValue()).stripTrailingZeros().toString();
    }

    public BigDecimal getSecondOperand() {
        return secondOperand;
    }

    public BigDecimal getFirstOperand() {
        return firstOperand;
    }
}
