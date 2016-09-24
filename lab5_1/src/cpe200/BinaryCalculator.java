package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    private BigDecimal first , second , result ;

    public BinaryCalculator() {
        Operand firstOperand = new Operand(0);
        Operand secondOperand = new Operand(0);

    }

    public void setFirstOperand(Operand operand) {
        first = new BigDecimal(operand.getOperand());
    }


    public void setSecondOperand(Operand operand) {
        second = new BigDecimal(operand.getOperand());
    }

    public String add() throws RuntimeException {
        if (first.intValue()<0||second.intValue()<0){
            throw new RuntimeException("Negative value");
        }
        result =first.add(second).stripTrailingZeros();
        return result.toString();
    }

    public String subtract() throws RuntimeException {
        if (first.intValue()<0||second.intValue()<0){
            throw new RuntimeException("Negative value");
        }
        result =first.subtract(second).stripTrailingZeros();
        return result.toString();
    }

    public String multiply() throws RuntimeException {
        if (first.intValue()<0||second.intValue()<0){
            throw new RuntimeException("Negative value");
        }
        result = first.multiply(second).stripTrailingZeros();
        return result.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if (second.equals(0)){
            throw new RuntimeException("Divide by Zero");
        }else if (first.intValue()<0||second.intValue()<0){
            throw new RuntimeException("Negative value");
        }else {
            return first.divide(second,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();
        }
    }

    public String power() throws RuntimeException {
        if (first.intValue()<0||second.intValue()<0){
            throw new RuntimeException("Negative value");
        }
        result = first.pow(second.intValue()).stripTrailingZeros();
        return result.toString();
    }

    public Operand getFirstOperand(){
        return firstOperand;
    }

    public Operand getSecondOperand(){
        return secondOperand;
    }
}
