public class Aluno{
	String nome,numeroMatricula;
	int idade;

	public void imprimirDadosCadastrais(){
		System.out.println("Nome: " + this.nome + " - Idade: "+ this.idade + " - Numero Matricula: " + this.numeroMatricula);
	}

	public static void main(String [] args){
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		
		a1.nome="Breno";
		a1.idade=17;
		a1.numeroMatricula="201318110050";
		a1.nome="Bruno";
		a1.idade=17;
		a1.numeroMatricula="201318110051";
		a1.nome="Bruna";
		a1.idade=17;
		a1.numeroMatricula="201318110052";
		a1.nome="Brenda";
		a1.idade=17;
		a1.numeroMatricula="201318110053";
		
		a1.imprimirDadosCadastrais();
		a2.imprimirDadosCadastrais();
		a3.imprimirDadosCadastrais();
		a4.imprimirDadosCadastrais();
	}
}
