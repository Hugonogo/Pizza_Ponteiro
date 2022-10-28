public class App {
    public static void main(String[] args) throws Exception {
      Pizza l = new Pizza();
      l.InseriPri("Queijo", 60);
      l.InsereFinal("Calabresa", 15);
      l.InsereInicio("4 Queijos", 20);
      l.insereNovoPos("Bacon", 12, 2);
      l.insereNovoPos("Portuguesa", 12, 1);
      l.ImprimirCardapio();
      l.situacaoPizza();
      l.vendasEMedia();

      l.Venda();//Aqui o erro
    }
}
