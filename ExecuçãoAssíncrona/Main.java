package ExecuçãoAssíncrona;

public class Main extends Thread {
    public void run() {
        System.out.println("Tarefa em segundo plano em Java!");
    }

    public static void main(String[] args) {
        Main tarefa = new Main();
        tarefa.start();
    }
}
