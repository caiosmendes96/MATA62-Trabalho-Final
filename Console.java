import java.util.Scanner;

public class Console { // INVOKER DO COMMAND
    private static Console console;

    // Construtor privado para evitar a criação de múltiplas instâncias
    private Console() {
    }

    // Método público para obter a única instância da classe
    public static synchronized Console getConsole() {
        if (console == null) {
            console = new Console();
        }
        return console;
    }

    // Método para ler comandos do console
    public void lerComando() {
        String codUsuario;
        String codLivro;

        Scanner scanner = new Scanner(System.in);

        

        IComandoEmprestimo comandoEmprestimo = new ComandoEmprestar();
        IComandoConsulta comandoConsultar = new ComandoConsultar();
        IComandoEmprestimo comandoRersevar = new ComandoReservar();
        IComandoEmprestimo comandoDevolver = new ComandoDevolver();

        String command = "";
        
        while (!command.split(" ")[0].equals("sair")) {

            System.out.print("Digite um comando: ");

            command = scanner.nextLine();
            
            switch (command.split(" ")[0]){
                case "emp":
                    //emprestimo
                    codUsuario = command.split( " ")[1];
                    codLivro = command.split( " ")[2];

                    comandoEmprestimo.executar(Integer.parseInt(codUsuario),Integer.parseInt(codLivro));

                    break;
                case "dev":
                    //devolucao livro
                    codUsuario = command.split( " ")[1];
                    codLivro = command.split( " ")[2];

                    comandoDevolver.executar(Integer.parseInt(codUsuario),Integer.parseInt(codLivro));
                    
                    break;
                case "liv": 
                    //consultar livro
                    
                    codLivro = command.split( " ")[1];
                    comandoConsultar.executarConsultaLivro(Integer.parseInt(codLivro));

                    break;
                case "res": 
                    //comando para reservar

                    codUsuario = command.split( " ")[1];
                    codLivro = command.split( " ")[2];

                    comandoRersevar.executar(Integer.parseInt(codUsuario), Integer.parseInt(codLivro));

                    break;

                //comando = new ComandoReservar();
                //comando.executar(codUsuario,codLivro);
                case "usu":
                    codUsuario = command.split( " ")[1];
                    comandoConsultar.executarConsultaUsuario(Integer.parseInt(codUsuario));

                    break;
                case "sair":
                    System.out.println("Certo. Até mais!");
					System.out.println("Aplicação Encerrada.");
					break;
                default: 
                
                    break;

            }
        }
        scanner.close();
    }


}
