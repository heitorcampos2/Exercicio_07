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
public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;
    ////////////////////////////////////
    public double getValorCredito(){
        return valorCredito;
    }
    
    public double getValorDivida(){
        return valorDivida;
    }
    ///////////////////////////////////
    public void setValorCredito(double vc){
        this.valorCredito = vc;
    }
    
    public void setValorDivida(double vd){
        this.valorDivida = vd;
    }
    //////////////////////////////////////
    public void obterSaldo(double s){
        s = getValorCredito() - getValorDivida();
        System.out.println("Saldo = "+s);
    }
    //////////////////////////////////////
    public Fornecedor(double vc, double vd){
    setValorCredito(vc);
    setValorDivida(vd);
    }
}
