package cpe200;


public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    private Double sum,first,second;
    private String sum1;

    public BinaryCalculator() {
        setFirstOperand(new Operand(0));
        setSecondOperand(new Operand(0));
    }

    public void setFirstOperand(Operand operand) {
        first=new Double(operand.getOperand());
    }


    public void setSecondOperand(Operand operand) {
        second=new Double(operand.getOperand());
    }

    public String add() throws RuntimeException {

        if(first<0||second<0){
            throw new RuntimeException("ERROR");
        }else{
            sum=first+second;
            sum1=Double.toString(sum);
        }
        return sum1 = sum1.indexOf(".") < 0 ? sum1 : sum1.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

    public String subtract() throws RuntimeException {
        if(first<0||second<0){
            throw new RuntimeException("ERROR");
        }else{
            sum=first-second;
            sum1=Double.toString(sum);
            sum1=String.format("%.5f",sum);
        }

        return sum1 = sum1.indexOf(".") < 0 ? sum1 : sum1.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

    public String multiply() throws RuntimeException {
        if(first<0&&second<0){
            sum=(first*second);
            sum1 = Double.toString(sum);
        }else{
            if(first<0){
                throw new RuntimeException("ERROR");

            }else if(second<0){
                throw new RuntimeException("ERROR");

            }else{
                sum=(first*second);
                sum1 = Double.toString(sum);
            }
        }

        return sum1 = sum1.indexOf(".") < 0 ? sum1 : sum1.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws RuntimeException {

        if (second == 0) {
            throw new ArithmeticException("ERROR");
        } else {
            if(first<0&&second<0){
                sum = (first / second);
                String sum1 = Double.toString(sum);
                sum1=String.format("%.5f",sum);
            }else{
                if(first<0){
                    throw new RuntimeException("ERROR");

                }else if(second<0){
                    throw new RuntimeException("ERROR");

                }else{
                    sum = (first / second);
                    String sum1 = Double.toString(sum);
                    sum1=String.format("%.5f",sum);
                }
            }
            sum = (first / second);
            String sum1 = Double.toString(sum);
            sum1=String.format("%.5f",sum);
            return sum1 = sum1.indexOf(".") < 0 ? sum1 : sum1.replaceAll("0*$", "").replaceAll("\\.$", "");
        }
    }

    public String power() throws RuntimeException {
        if(first<0||second<0){
            throw new RuntimeException("ERROR");
        }else{
            sum=Math.pow(first,second);
            sum1=Double.toString(sum);
        }



        return sum1=sum1.indexOf(".") < 0 ? sum1 : sum1.replaceAll("0*$", "").replaceAll("\\.$", "");
    }


    public Operand getFirstOperand() {
        return firstOperand;
    }

    public Operand getSecondOperand() {
        return secondOperand;
    }
}
