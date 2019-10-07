/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicativo;

import entidades.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Alkanet
 */
public class Aplicativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        Scanner leia = new  Scanner(System.in);
        List<Funcionario> list = new ArrayList();
        Funcionario func = new Funcionario();
        System.out.print("Quantos funcionários serão registrados? ");
        int n = leia.nextInt();
        int[] vetor = new int[n];
        for(int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Funcionário #" + i + ": ");
            System.out.print("ID: ");
            int id = leia.nextInt(); 
            for(int j = 1;j<=i;j++){
                if(vetor[j-1]==id){
                    j--;
                    System.out.println("ID já cadastrado, informe outro!");
                    System.out.println("Funcionário #" + i + ": ");
                    System.out.print("ID: ");
                    id=leia.nextInt();
                }else if(j==i){   
                    vetor[i-1]=id;     
            }
            }
            System.out.print("Nome: ");
            leia.nextLine();
            String nome = leia.nextLine();
            System.out.print("Salário: ");
            double salario=leia.nextDouble();
            list.add( new Funcionario(id, nome, salario));
            
        }
        
        System.out.println();
        System.out.print("Digite a identificação do funcionário que terá aumento salarial: ");
        int id =leia.nextInt();
        
        Funcionario funci = list.stream().filter(x -> x.getId()==id).findFirst().orElse(null);
        
        
        if(funci==null){
            System.out.println("Este ID não existe!");
        }else{
            System.out.print("Digite a porcentagem: ");
            double porcentagem=leia.nextDouble();
            funci.AlmentarSalario(porcentagem);
        }
        
        System.out.println();
        System.out.println("Lista de funcionarios: ");
        
        for(Funcionario obj: list){
            System.out.println(obj);
        }
        
    }
    
}
