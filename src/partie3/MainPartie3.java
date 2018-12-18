package partie3;

import java.util.ArrayList;

import partie1.Cle;
import partie1.Parser;

public class MainPartie3 {

	public static void main(String[] args) {
	
		FileBinomiale fb = new FileBinomiale();
		Parser p = new Parser();
		ArrayList<String> filenames = new ArrayList<String>();
		String[] nbcles = {"100","200","500","1000","5000","10000","20000","50000"};
		for(int j = 0;j<nbcles.length;j++) {
			for(int i = 1;i<6;i++) {
			filenames.add("src/data/cles_alea/jeu_"+i+"_nb_cles_"+nbcles[j]+".txt");
			}
		}
		for(int i = 0;i<filenames.size();i++) {
			System.out.println(filenames.get(i));
		}
		float tps_total_arbre = 0;
		float tps_total_tableau = 0;
		int cpt = 0;
		for(String s : filenames) {
			ArrayList<Cle> l = p.read(s);
			final long startTimeArbre = System.nanoTime();
			fb.ConsIter(l);
			final long endTimeArbre = System.nanoTime();
			tps_total_arbre += endTimeArbre - startTimeArbre;
			cpt++;
			System.out.println(s+" : "+((endTimeArbre - startTimeArbre)/1000000000.0));
		}
		System.out.println("Average execution time for tree: " + (tps_total_arbre/cpt));
		System.out.println("Average execution time for table: " + (tps_total_tableau/cpt));
	}

}