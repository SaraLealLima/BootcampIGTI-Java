package entidades;

public interface MeioLocomocao {
	public default void acelerar() {
		System.out.println("Implementa��o default acelerar");
	}
	public void frear();
	
}
