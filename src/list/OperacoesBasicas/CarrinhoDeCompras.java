package list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras(){
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> ItensParaRemover = new ArrayList<>() ;
        for(Item t : carrinhoDeCompras) {
            if(t.getNome().equalsIgnoreCase(nome)) {
                ItensParaRemover.add(t);
            }
        }
        carrinhoDeCompras.removeAll(ItensParaRemover);
    }

    public double calcularValorTotal() {
        double total = 0;
        for(Item t : carrinhoDeCompras) {
            total += t.getPreco() * t.getQuantidade();
        }

        return  total;
    }

    public void exibirItens() {
        System.out.println(carrinhoDeCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.adicionarItem("Maça" ,1.5,10);
        carrinhoDeCompras.adicionarItem("Pera" ,1.0,5);

        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é: " + carrinhoDeCompras.calcularValorTotal() );
    }
;

}
