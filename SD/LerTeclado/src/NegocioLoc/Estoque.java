package NegocioLoc;

public class Estoque extends Filmes {

	String quantidadeFilme;
	String quantidadeLotacao;
	
	public Estoque (){
		
	}
	
	@Override
	public String toString() {
		return this.getNomeFilme() + "#" + this.getTipoFilme() + "#" + this.getQuantidadeFilme();
	}
	
}
