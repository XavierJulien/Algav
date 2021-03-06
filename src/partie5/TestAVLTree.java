package partie5;

//import java.util.ArrayList;

import partie1.Cle;

public class TestAVLTree {

	public static void main(String[] args) {
		Cle c0 = new Cle(0,0,0,0);
		Cle c1 = new Cle(0,0,0,1);
		Cle c2 = new Cle(0,0,1,0);
		Cle c3 = new Cle(0,0,1,1);
		Cle c4 = new Cle(0,1,0,0);
		Cle c5 = new Cle(0,1,0,1);
		Cle c6 = new Cle(0,1,1,0);
		Cle c7 = new Cle(0,1,1,1);
		Cle c8 = new Cle(1,0,0,0);
		Cle c9 = new Cle(1,0,0,1);
		Cle c10 = new Cle(1,0,1,0);
		Cle c11 = new Cle(1,0,1,1);
		
		AVLTree a = new AVLTree(c0);
		a = a.ajout(a, c1);
		a = a.ajout(a, c2);
		a = a.ajout(a, c3);
		a = a.ajout(a, c4);
		a = a.ajout(a, c5);
		a = a.ajout(a, c6);
		a = a.ajout(a, c7);
		a = a.ajout(a, c8);
		a = a.ajout(a, c9);
		a = a.ajout(a, c10);
		a = a.ajout(a, c11);
		//tests
		System.out.println("Arbre Final : "+a.toString());
		System.out.println("Je cherche "+c7.toString()+" : "+a.recherche(a, c7));// si true alors c'est que la clé demandé est dedans
	}

}
