/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q_01;

/**
 *
 * @author HeiThor
 */
public class Empregado extends Pessoa {
    private String codigoSetor;
    private double salarioBase;
    private double imposto;
    //////////////////////////////////
    public String getCodigoSetor(){
        return codigoSetor;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public double getImposto(){
        return imposto;
    }
    ////////////////////////////////
    public void setCodigoSetor(String c){
        this.codigoSetor = c;
    }
    
    public void setSalarioBase(double s){
        this.salarioBase = s;
    }
    
    public void setImposto(double i){
        this.imposto = i;
    }
    ////////////////////////////////
    public void calcularSalario(double sal){
        sal = getSalarioBase() - getImposto();
    }
    ////////////////////////////////
    public Empregado(String c, double s, double i){
        setCodigoSetor(c);
        setSalarioBase(s);
        setImposto(i);
    }
}
