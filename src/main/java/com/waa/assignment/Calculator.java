package com.waa.assignment;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class Calculator implements Serializable {
    private int firstNumber;
    private int secondNumber;
    public int result;

    public String add() {
        setResult(firstNumber + secondNumber);
        return "calculator";

    }

    public String substract() {
        setResult(firstNumber - secondNumber);
        return "calculator";

    }

    public String multiply() {
        setResult(firstNumber * secondNumber);
        return "calculator";

    }

    public String divide() {
        setResult(firstNumber / secondNumber);
        return "calculator";

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

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}
