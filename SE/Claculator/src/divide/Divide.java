/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divide;

/**
 *
 * @author Administrator
 */
public class Divide extends multiply.Multiply{
    @Override
    public double opNum(double num1,double num2)
    {
        if(num2==0)
            return 00;
        else
       return num1/num2;
    }
    
}
