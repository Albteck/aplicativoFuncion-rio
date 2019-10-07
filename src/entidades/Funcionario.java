/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Alkanet
 */
public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;
    
    public Funcionario(){
        
    }
    
    public Funcionario(int id, String nome, double salario){
        this.id=id;
        this.nome=nome;
        this.salario=salario;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the salario
     */
    public Double getSalario() {
        return salario;
    }
    public double AlmentarSalario(double x){
        salario=salario+(salario*x)/100;
        return salario;
        
    }
    public String toString(){
        return id+", "+nome+", "+String.format("R$ %.2f", salario);
    }
}
