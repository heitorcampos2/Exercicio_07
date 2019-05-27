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
public class Teste {
    public void main(String[] args){
        Pessoa p = new Pessoa ("Heitor", "Rua Zero", "00");        
        p.mostrar();
        
        Fornecedor f = new Fornecedor (200, 500,"Nike", "Rua 0", "2013882");
        f.mostrar();        
        
        Empregado e = new Empregado ("001", 900, 0.055, "Muriel", "Av. Lugar Nenhum", "0000000");
        e.mostrar();
        
        System.out.println(f.obterSaldo());
        System.out.println(e.calcularSalario());
               
        
    }
}
