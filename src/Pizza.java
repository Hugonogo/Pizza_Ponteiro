public class Pizza {
    public No inicio; //nó indicador da lista
    public No Atual;

    public void ImprimirCardapio() {
        int cont = 0;
        if (inicio == null) {
            System.out.println("Lista vazia, não pode imprimir!");
        } else {
            Atual = inicio;
            System.out.println("## CARDÁPIO ##");
            while (Atual != null) {
                cont++;
                System.out.print(cont+" - Nome: "+Atual.nome + " | Vendas: "+ Atual.qt+"\n");
                Atual = Atual.proximo;
            }
        }
        System.out.println("");
    }

    public void InseriPri(String nome, int val) {
        if (inicio == null) {
            inicio = new No();

            if (inicio != null) {
                inicio.nome = nome;
                inicio.qt = val;
                inicio.proximo = null;
            }
        }
    }

    public void InsereInicio(String nome, int val) {
        No NovoNo = new No();
        NovoNo.qt = val;
        NovoNo.nome = nome;
        NovoNo.proximo = inicio;
        inicio = NovoNo;
    }
	
    public void InsereFinal(String nome, int val){
	No nNo = new No();
    nNo.nome = nome;
	nNo.qt = val;
        Atual = inicio;
       
        while (Atual.proximo !=  null) {            
            Atual = Atual.proximo;
        }
        
        Atual.proximo = nNo;
        
    }
    public int Tamanho() {
        No atual = inicio;
        int tam = 0;
    
        if (atual == null) {
            return 0;
        } else {
            while (atual != null) {
                tam = tam + 1;
                atual = atual.proximo;
            }
            return tam;
        }
    }
    public void RemoverInicio() {
        if (inicio == null) {
            System.out.println("A lista está vazia, não pode remover do inicio!");
        } else {
            inicio = inicio.proximo;
        }
    }
    public void RemoverFim() {
        No atual = inicio;

        if (inicio == null) {
            System.out.println("Lista vazia, não se pode remover o ultimo nó!");
        } else if (atual.proximo == null) {
            inicio = null;
        } else {
            while (atual.proximo.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = null;
        }
    }

    public void insereNovoPos(String nome, int val, int pos){
        if (inicio == null) {
            System.out.println("Lista vazia, não pode inserir!");
        }
        else if(pos <= Tamanho()){
            int contador = 1;
            No newNo = new No();
            No anterior = new No();
            No prox = new No();
            newNo.nome = nome;
            newNo.qt = val;
            Atual = inicio;
            while (true) {
                if (pos == 1) {
                    anterior = Atual;
                    Atual = Atual.proximo;
                    prox = Atual;

                    anterior.proximo = newNo;
                    newNo.proximo = prox;
                    break;
                }else{
                    contador++;
                    Atual = Atual.proximo;
                 
                    if (contador == pos) {
                        
                        anterior = Atual;
                        Atual = Atual.proximo;
                        
                        prox = Atual;

                        anterior.proximo = newNo;
                        newNo.proximo = prox;
                        break;
                    }
                }
                
            }
        }else System.out.println("posição fora da Lista");

    }
    public void situacaoPizza(){
        Atual = inicio;
        if (inicio == null) {
            System.out.println("Lista Vazia");
        }else{
            System.out.println("## Situação ##");
          
            while (Atual != null) {
                    if (Atual.qt <= 15) {
                        System.out.println("Nome: "+Atual.nome+" | Vendas: "+Atual.qt+" - "+"Melhorar Pizza");
                    }else  System.out.println(Atual.nome+" | "+Atual.qt+" - "+"OK");
                    Atual = Atual.proximo;
            }
        }
        
    }
    public void vendasEMedia(){
        int soma = 0;
        int cont = 0;
        Atual = inicio;
        
        while (Atual != null) {
            soma = soma + Atual.qt;
            Atual = Atual.proximo;
            cont++;
        }
        System.out.println("Total de Vendas: "+soma);
        System.out.println("Média de vendas: "+soma/cont);
    }

    //Aqui o erro
    public void Venda(){
        
        Atual = inicio;
        String maisVendida = null, menosVendida = null;
        int minimo = 0;
        int maximo = 0;
        minimo = Atual.qt;
        maximo = Atual.qt;
        while (Atual != null) {
            
          
            
            if (this.Atual.qt > maximo) {
                maximo = Atual.qt;
                maisVendida = Atual.nome;
            }
            if (this.Atual.qt < minimo) {
                minimo = Atual.qt;
                menosVendida = Atual.nome;
            }
            
            Atual = Atual.proximo;
            
        }
        System.out.println("Pizza mais vendida: "+maisVendida+" | "+maximo);
        System.out.println("Pizza menos Vendida: "+menosVendida+" | "+minimo);
    }

    
}
