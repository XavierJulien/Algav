package partie2;
import java.util.ArrayList;

import partie1.Cle;

public class TestArbre {

	public static void main(String[] args) {
		
		//Construction de l'arbre a1
		Cle c0 = new Cle(0,0,0,0);
		Cle c1 = new Cle(0,0,0,1);
		Cle c2 = new Cle(0,0,1,0);
		Cle c3 = new Cle(0,0,1,1);
		Cle c4 = new Cle(0,1,0,0);
		Cle c5 = new Cle(0,1,0,1);
		Cle c6 = new Cle(0,1,1,0);
		Cle c7 = new Cle(0,1,1,1);
		ArrayList<Cle> lc1 = new ArrayList<Cle>();
		lc1.add(c7);
		lc1.add(c6);
		lc1.add(c5);
		lc1.add(c4);
		lc1.add(c3);
		lc1.add(c2);
		lc1.add(c1);
		Arbre a = new Arbre().ConsIter(lc1);
		System.out.println(a.toString());
		a.Ajout(c0);
		System.out.println(a.toString());
		
		/*//Construction de l'arbre a2
		Cle c8 = new Cle(1,0,0,0);
		Cle c9 = new Cle(1,0,0,1);
		Cle c10 = new Cle(1,0,1,0);
		ArrayList<Cle> lc2 = new ArrayList<Cle>();
		lc2.add(c10);
		lc2.add(c9);
		lc2.add(c8);
		Arbre a2 = new Arbre().ConsIter(lc2);
		System.out.println(a2.toString());
		
		//opérations
		a.Union(a, a2);
		//System.out.println(a.toString());
		// Check SupprMin
		//System.out.println(a.toString());
		//a.SupprMin();
		//System.out.println(a.toString());
		// Check Ajout
		// a.Ajout(new Cle(1,0,0,0));
		*/
	}

}
