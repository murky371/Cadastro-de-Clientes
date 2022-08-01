/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro;

/**
 *
 * @author Joao
 */
public class Informacoes {
      String cpf, rg, nome, cnpj, telefone, endereco, email;
    
   public void setEmail(String email){
       this.email = email;
   }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

   public String retorna_cpf(){
       return cpf;
   }
   public String retorna_rg(){
       return rg;
   }
   public String retorna_nome(){
       return nome;
   }
   public String retorna_cnpj(){
       return cnpj;
   }
   public String retorna_telefone(){
       return telefone;
}
   public String retorna_endereco(){
       return endereco;
   }
   public String retorna_email(){
       return email;
   }
}
