/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q_02;

/**
 *
 * @author HeiThor
 */
public class Professor {
    private String nome;
    private int idade;
    private String numeroMatricula;
    
    public Professor(String nome, int idade, String numeroMatricula){
    
        setNome(nome);
        setIdade(idade);
        setNumeroMatricula(numeroMatricula);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    
    
    
}
