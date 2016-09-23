package cpe200;


import java.math.BigDecimal;


public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {
        setFirstOperand(new Operand("0"));
        setSecondOperand(new Operand("0"));
    }


    public void setFirstOperand(Operand operand) {
        firstOperand = operand;
    }


    public void setSecondOperand(Operand operand) {
        secondOperand = operand;
    }

    public String add() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if (first.intValue() < 0 || second.intValue() < 0)
        {
            throw new RuntimeException("ERROR");
        }
        else
        {
            BigDecimal sent = first.add(second);
            return sent.stripTrailingZeros().toString();
        }
    }


    public String subtract() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if (first.intValue() < 0 || second.intValue() < 0)
        {
            throw new RuntimeException("ERROR");
        }
        else
        {
            BigDecimal sent = first.subtract(second);
            return sent.stripTrailingZeros().toString();
        }

    }

    public String multiply() throws RuntimeException {

        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if (first.intValue() < 0 || second.intValue() < 0)
        {
            throw new RuntimeException("ERROR");
        }
        else
        {
            BigDecimal sent = first.multiply(second);
            return sent.stripTrailingZeros().toString();
        }
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if (first.intValue() < 0 || second.intValue() < 0)
        {
            throw new RuntimeException("ERROR");
        }
        if (second.intValue() == 0)
        {
            throw new ArithmeticException("ERROR divisor is zero");
        }
        else
        {
            BigDecimal sent = first.divide(second, 5, 5);
            return sent.stripTrailingZeros().toString();
        }
    }

    public String power() throws RuntimeException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        if (first.intValue() < 0 || second.intValue() < 0)
        {
            throw new RuntimeException("ERROR");
        }
        else
            {
            double dfirst = first.doubleValue();
            double dsecond = second.doubleValue();
            Operand temp = new Operand(Math.pow(dfirst, dsecond));
            BigDecimal sent = new BigDecimal(temp.getOperand());
            return sent.stripTrailingZeros().toString();
        }
    }

}
