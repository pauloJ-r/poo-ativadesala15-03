package banco.logica;

import java.util.ArrayList;
import java.util.Objects;
public class Cliente {
    private String cpf;
    private String nome;
    
    
    private ArrayList<conta> contas = new ArrayList<>();


	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
		
	}

	public void addConta(conta c) {
    	this.contas.add(c);
    }
	public void remConta(conta c) {
		this.contas.remove(c);
	}
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", nome=" + nome + ", contas=" + contas + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf);
	}
    public String getNome() {
		return nome;
	}
    public String getCpf() {
		return cpf;
	}
    public void setNome(String nome) {
		this.nome = nome;
	}
    public void setCpf(String cpf) {
		this.cpf = cpf;
	}
    
}
