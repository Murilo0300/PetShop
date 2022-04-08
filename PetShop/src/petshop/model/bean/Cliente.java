/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop.model.bean;

/**
 *
 * @author muril
 */
public class Cliente extends Pessoa {
     

    private int cpf;
    private String logradouro;
    private float telefone;
    private String nome_pet;
    private String tipo_pet;

    public Cliente(int cpf) {
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }
    
    /**ABAIXO -  GETTERS E SETTERS PARA DADOS PESSOAI*/

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereço() {
        return logradouro;
    }

    public void setEndereço(String endereço) {
        this.logradouro = endereço;
    }
    
    /**ABAIXO -  GETTERS E SETTERS PARA DADOS DO ANIMA
     * @return L**/  

    public String getNome_pet() {
        return nome_pet;
    }

    public void setNome_pet(String nome_pet) {
        this.nome_pet = nome_pet;
    }

    public String getTipo_pet() {
        return tipo_pet;
    }

    public void setTipo_pet(String tipo_pet) {
        this.tipo_pet = tipo_pet;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", endereco=" + logradouro + ", telefone=" + telefone + ", nome_pet=" + nome_pet + ", tipo_pet=" + tipo_pet + '}';
    }

  

}
    
    
    
    
    
    
    

    
    
    

