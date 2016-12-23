package dotew.model;

public class Ghoul extends Enemy{

	private Ghoul() {
		super();
		// TODO reward,dialog,item, level vs. Bi de level iþini nasýl hallederiz?
	}
	//@Override
	public static Enemy create(){
		Ghoul g = new Ghoul();
		g.setType("Enemy");
		g.setName("Ghoul");
		return g;
	}

}
