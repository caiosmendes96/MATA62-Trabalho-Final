

public class Programa {

	public static void main(String[] args) {

		System.out.println("oi");

		Console console = Console.getConsole();

		Livro livro1 = new Livro(100, "Engenharia de Software", "Addison", "Ian Sommervile", "6º", 2000);
        livro1.adicionarExemplar();  
		livro1.adicionarExemplar();  

		Livro livro2 = new Livro(101, "UML - Guia do Usuário", "Campus", "Grady Booch, James Rumbaugh, Ivar Jacobson", "7º", 2000);
		livro2.adicionarExemplar();
		
		Livro livro3 = new Livro(200, "Code Complete", "Microsoft Press", "Steve McConnell", "2º", 2014);
		livro3.adicionarExemplar();

		Livro livro4 = new Livro(201, "Agile Software Development,...", "Prentince Hall", "Robert Martin", "1º", 2002);
		livro4.adicionarExemplar();

		Livro livro5 = new Livro(300, "Refactoring: Improving the Design of Existing Code", "Addison- Wesley Professional", "Martin Fowler", "1º", 1999);
		livro5.adicionarExemplar();

		GerenciadorBiblioteca.adicionarLivro(livro1);
		GerenciadorBiblioteca.adicionarLivro(livro2);
		GerenciadorBiblioteca.adicionarLivro(livro3);
		GerenciadorBiblioteca.adicionarLivro(livro4);
		GerenciadorBiblioteca.adicionarLivro(livro5);


		Usuario usuario2 = new AlunoGraduacao("João da Silva", 123);
		Usuario usuario3 = new AlunoPosGraduacao("Luiz Fernando Rodrigues", 456);
		Usuario usuario4 = new AlunoPosGraduacao("Pedro Paulo", 789);
		Usuario usuario1 = new Professor("Calos lucena", 100);

		GerenciadorBiblioteca.adicionarUsuario(usuario1);
		GerenciadorBiblioteca.adicionarUsuario(usuario2);
		GerenciadorBiblioteca.adicionarUsuario(usuario3);
		GerenciadorBiblioteca.adicionarUsuario(usuario4);
		
		console.lerComando();
		//System.out.println("Tempo emprestimo usuario 1: " + usuario1.getTempoEmprestimo());
		//System.out.println("Tempo emprestimo usuario 2: " + usuario2.getTempoEmprestimo());
		//System.out.println("Tempo emprestimo usuario 3: " + usuario3.getTempoEmprestimo());

		
	}

}