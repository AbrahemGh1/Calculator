/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Abrahem
 */
@Named(value = "calculatorJSFBean")
@RequestScoped
public class CalculatorJSFBean {
    
    Double number1;
    Double number2;
    Double result;

    public Double getNumber1() {
        return number1;
    }

    public void setNumber1(Double number1) {
        this.number1 = number1;
    }

    public Double getNumber2() {
        return number2;
    }

    public void setNumber2(Double number2) {
        this.number2 = number2;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
    

    /**
     * Creates a new instance of CalculatorJSFBean
     */
    public CalculatorJSFBean() {
    }
    
    public void add(){result= number1+number2;}
    public void subtract(){result= number1-number2;}
    public void multiply(){result= number1*number2;}
    public void divide(){result= number1/number2;}
}
