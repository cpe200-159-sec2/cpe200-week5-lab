package cpe200;


public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    double Num1,Num2;

    public Operand getFirstOperand() {
        return firstOperand;
    }

    public Operand getSecondOperand() {
        return secondOperand;
    }

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        Num1 = Double.parseDouble(operand.getOperand());
    }


    public void setSecondOperand(Operand operand) {
        Num2 = Double.parseDouble(operand.getOperand());
    }

    public String add() throws RuntimeException {
        if (Num1 < 0 || Num2 < 0)
        {
            throw new RuntimeException();
        }
        Double Ans = Num1 + Num2;
        int tmp_int = Ans.intValue();
        if (tmp_int == Ans)
            return Integer.toString(tmp_int);
        return Double.toString(Ans);
    }

    public String subtract() throws RuntimeException {
        if (Num1 < 0 || Num2 < 0)
        {
            throw new RuntimeException();
        }
        Double Ans = Num1 - Num2;
        int tmp_int = Ans.intValue();
        if (tmp_int == Ans)
            return Integer.toString(tmp_int);
        long tmp_long = Math.round(Ans*100000);
        Ans = (double)tmp_long;
        Ans /= 100000;
        return Double.toString(Ans);
    }

    public String multiply() throws RuntimeException {
        if (Num1 < 0 || Num2 < 0)
        {
            throw new RuntimeException();
        }
        Double Ans = Num1 * Num2;
        int tmp_int = Ans.intValue();
        if (tmp_int == Ans)
            return Integer.toString(tmp_int);
        return Double.toString(Ans);
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        if (Num2 == 0)
        {
            throw new ArithmeticException();
        }
        else if (Num1 < 0 || Num2 < 0)
        {
            throw new RuntimeException();
        }
        Double Ans = Num1 / Num2;
        int tmp_int = Ans.intValue();
        if (tmp_int == Ans)
            return Integer.toString(tmp_int);
        long tmp_long = Math.round(Ans*100000);
        Ans = (double)tmp_long;
        Ans /= 100000;
        return Double.toString(Ans);
    }

    public String power() throws RuntimeException {
        if (Num1 < 0 || Num2 < 0)
        {
            throw new RuntimeException();
        }
        Double Ans = Math.pow(Num1, Num2);
        int tmp_int = Ans.intValue();
        if (tmp_int == Ans)
            return Integer.toString(tmp_int);
        return Double.toString(Ans);
    }

}
