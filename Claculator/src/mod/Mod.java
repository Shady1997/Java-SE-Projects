/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod;

/**
 *
 * @author Administrator
 */
public class Mod extends divide.Divide{
    
    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    @Override
    public double opNum(double num1,double num2)
    {
        int temp1=(int)num1;
        int temp2=(int)num2;
       return (temp1%temp2);
    }
    
}
