/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pow;

/**
 *
 * @author Administrator
 */
public class pow extends mod.Mod{
    @Override
    public double opNum(double num1,double num2)
    {
       return Math.pow(num1, num2);
    }
}
