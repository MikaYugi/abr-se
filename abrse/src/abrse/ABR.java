package abrse;

import java.util.List;

public class ABR {
	
	/** On crée une sous classe Node abritant les 2 noeuds et la racine 
	 */
		
	public class Node{
	
		Node child_left_, child_right_;
		int r;
	
		Node(Node l_child, Node r_child, int racine){
			this.r = racine;
			this.child_left_ = l_child;
			this.child_right_ = r_child;
		}
	}
	
	public Node root;
	
	public ABR (Node no){
		this.root = no;
	}
	
	/** Initialisation d'un arbre vide
	 */
	public ABR(){
		this.root = null;
	}
	
	/** Création de insert : insère un entier n dans l'arbre
	 */
	public void insert (int n){
		if (this.isEmpty()){
			this.root = new Node (null, null, n);
		}
		else {
			insertN(n,root);
			}
		}	
	
	
	public void insertN (int n, Node nod){
		if (nod == null){
			nod = new Node (null, null, n);
		}
		else {
			if (n<nod.r){
				insertN(n, nod.child_left_);
			}
			else {
				insertN(n, nod.child_right_);
			}
		}
	}
	
	
	/** Création de isEmpty : vérifie si un arbre est vide ou non
	 */
	public boolean isEmpty (){
		if (this.root == null){
			return true;
		}
		else {
			return false;
		}				
	}
	
	/** création de nbElements : indique le nombre d'entiers dans un arbre 
	 */
	public int nbElements(){
		int compteur = 0;
		if (!this.isEmpty()){
			ABR a = new ABR();
			a.root = this.root.child_left_;
			ABR b = new ABR();
			b.root = this.root.child_left_;
			compteur = compteur + 1 + a.nbElements() + b.nbElements(); 
		}
		return compteur;
	}
	
	/** création de contains : indique si l'arbre contient l'entier n
	 */
	public boolean contains(int n) {
		if (this.isEmpty()){
			return false;
		}
		else{			
			if (this.root.r== n){
				return true;
			}
			else {
				if (this.root.r < n){
					ABR a = new ABR();
					a.root = this.root.child_left_;
					return a.contains(n);
				}
				else {
					ABR b = new ABR();
					b.root = this.root.child_left_;
					return b.contains(n);
				}
			}
		}
	}
	
	/** création de toList : rempli la liste l avec les éléments de l'arbre dans l'ordre croissant
	 */
	public void toList(List<java.lang.Integer> l){
		if (!this.isEmpty()){
			ABR a = new ABR();
			a.root = this.root.child_left_;
			ABR b = new ABR();
			b.root = this.root.child_left_;
			a.toList(l);
			l.add(this.root.r);
			b.toList(l);
		}
	}
	
}
