package NeoJardinDEden.modele;

public class MotteDeTerre extends Vegetal {

	private static char MOTTE = 'o';
	private static Etat ETAT = Etat.MOTTE;

	public MotteDeTerre() {
		super(MOTTE, MOTTE, ETAT);
	}
}
