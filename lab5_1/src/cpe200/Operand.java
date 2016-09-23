package cpe200;

import java.math.BigDecimal;

public class Operand {
    private String operand;
    private BigDecimal bigdec;

    public Operand(String operand) {
        this.setOperand(operand);
        this.setBigdec(new BigDecimal(Double.parseDouble(operand)));
    }

    public Operand(int operand) {
        this.setOperand(Integer.toString(operand));
        this.setBigdec(new BigDecimal(operand));
    }

    public Operand(double operand) {
        this.setOperand(Double.toString(operand));
        this.setBigdec(new BigDecimal(operand));
    }

    public String getOperand() {
        return operand;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }

    public BigDecimal getBigdec() {
        return bigdec;
    }

    public void setBigdec(BigDecimal bigdec) {
        this.bigdec = bigdec;
    }
}
