/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package Q_04;

/**
 *
 * @author HeiThor
 */
public class Terrestre extends Transporte {
    private int numerodeRodas;

    public Terrestre(int numerodeRodas, int capacidade) {
        super(capacidade);
        setNumeroDeRodas(numerodeRodas);
    }
    
    
    public int getNumeroDeRodas() {
        return numerodeRodas;
    }

    public void setNumeroDeRodas(int numerodeRodas) {
        this.numerodeRodas = numerodeRodas;
    }
    
    
}
