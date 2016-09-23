package cpe200;

public class Operand {
    private String operand;

    public Operand(String operand) {
        setOperand(operand);
    }

    public Operand(int operand) {
        setOperand(operand);
    }

    public Operand(double operand) {
        setOperand(operand);
    }


    public void setOperand(int operand)
    {
        this.operand=Integer.toString(operand);
    }

    public void setOperand(double operand)
    {
        this.operand=Double.toString(operand);
    }

    public String getOperand()
    {
        return this.operand;
    }


    public void setOperand(String operand) {
        this.operand = operand;
    }
}