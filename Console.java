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

        System.out.print("Digite um comando: ");

        String command = scanner.nextLine();

        switch (command.split(" ")[0]){
            case "emp":
            // comando para emprestar
            codUsuario = command.split( " ")[1];
            codLivro = command.split( " ")[2];
            IComandoEmprestimo comandoEmprestimo = new ComandoEmprestar();
            comandoEmprestimo.executar(Integer.parseInt(codUsuario),Integer.parseInt(codLivro));

            case "liv": 
            //consultar livro
             IComandoConsulta comandoConsultar = new ComandoConsultar();
             codLivro = command.split( " ")[1];

             comandoConsultar.executar(Integer.parseInt(codLivro));

            case "res": //comando para reservar

            //comando = new ComandoReservar();
            //comando.executar(codUsuario,codLivro);

        }
            
    }


}
