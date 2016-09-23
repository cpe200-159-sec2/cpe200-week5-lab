package cpe200;


public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    private double firstNum,secondNum;

    public BinaryCalculator() {
        setFirstOperand(new Operand('0'));
        setSecondOperand(new Operand('0'));
    }

    public void setFirstOperand(Operand operand) {
        this.firstOperand = operand;
        firstNum = Double.parseDouble(firstOperand.getOperand());
    }


    public void setSecondOperand(Operand operand) {
        this.secondOperand = operand;
        secondNum = Double.parseDouble(secondOperand.getOperand());
    }

    public String add() throws RuntimeException {
        if(firstNum < 0 || secondNum < 0){
            throw new RuntimeException("Error");
        }else {
            String sum = new Double(firstNum + secondNum).toString();
            return sum.indexOf(".") < 0 ? sum : sum.replaceAll("0*$", "").replaceAll("\\.$", "");
        }
    }

    public String subtract() throws RuntimeException {
        if(firstNum < 0 || secondNum < 0){
            throw new RuntimeException("Error");
        } else {
            Double sumdb = firstNum - secondNum;
            String sum;//= new Double(firstNum-secondNum).toString();
            sum = String.format("%.5f", sumdb);

            return sum.indexOf(".") < 0 ? sum : sum.replaceAll("0*$", "").replaceAll("\\.$", "");
        }
    }

    public String multiply() throws RuntimeException {
        if(firstNum < 0 || secondNum < 0){
            throw new RuntimeException("Error");
        }else{
            String sum = new Double(firstNum*secondNum).toString();
            return sum.indexOf(".") < 0 ? sum : sum.replaceAll("0*$","").replaceAll("\\.$","");
        }
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {
        if(firstNum < 0 || secondNum < 0){
            throw new RuntimeException("Error");
        }else{
            if(secondNum==0) throw new ArithmeticException();
            Double sumdb = firstNum/secondNum;

            String sum = new Double(firstNum/secondNum).toString();
            sum = String.format("%.5f",sumdb);
            return sum.indexOf(".") < 0 ? sum : sum.replaceAll("0*$","").replaceAll("\\.$","");
        }

    }

    public String power() throws RuntimeException {
        if(firstNum < 0 || secondNum < 0){
            throw new RuntimeException("Error");
        }else{
            double power = 1;
            for(int i=0;i<secondNum;i++){
                power *= firstNum;
            }
            String sum = new Double(power).toString();

            return sum.indexOf(".") < 0 ? sum : sum.replaceAll("0*$","").replaceAll("\\.$","");
        }
    }

    public Operand getFirstOperand() {
        return firstOperand;
    }

    public Operand getSecondOperand() {
        return secondOperand;
    }
}
