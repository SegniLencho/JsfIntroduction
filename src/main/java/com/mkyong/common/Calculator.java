package com.mkyong.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class Calculator implements Serializable {
    private String operator;
    private int firstNumber;
    private int secondNumber;

    public int calculate(String operator, int firstNumber, int secondNumber) {
        if (operator.equals("+"))
            return firstNumber + secondNumber;
        else
            return firstNumber - secondNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
}
