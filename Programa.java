

public class Programa {

	public static void main(String[] args) {

		System.out.println("oi");

		Console console = Console.getConsole();

		Livro livro1 = new Livro(100, "Engenharia de Software", "Addison", "Ian Sommervile", "6º", 2000);
        livro1.adicionarExemplar(new Exemplar());  
		livro1.adicionarExemplar(new Exemplar());  

		Livro livro2 = new Livro(101, "UML - Guia do Usuário", "Campus", "Grady Booch, James Rumbaugh, Ivar Jacobson", "7º", 2000);
		livro2.adicionarExemplar(new Exemplar());

		for (Exemplar exemplar : livro1.getExamplares()) {
			System.out.println(exemplar.getCodigo() + "Status: " + exemplar.getStatus());
		}

		Usuario usuario2 = new AlunoGraduacao("João da Silva", 123);
		Usuario usuario3 = new AlunoPosGraduacao("Luiz Fernando Rodrigues", 456);
		Usuario usuario4 = new AlunoPosGraduacao("Pedro Paulo", 789);
		Usuario usuario1 = new Professor("Calos lucena", 100);
		
		console.lerComando();
		//System.out.println("Tempo emprestimo usuario 1: " + usuario1.getTempoEmprestimo());
		//System.out.println("Tempo emprestimo usuario 2: " + usuario2.getTempoEmprestimo());
		//System.out.println("Tempo emprestimo usuario 3: " + usuario3.getTempoEmprestimo());

		
	}

}