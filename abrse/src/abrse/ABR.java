package abrse;

import java.util.List;

public class ABR {
	
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
	
	public ABR(){
		this.root = null;
	}
	
	
	
	public void insert (int n){
		if (this.isEmpty()){
			this.root.r = n;
		}
		else {
			if (n<=this.root.r){
				ABR a = new ABR();
				a.root = this.root.child_left_;
				a.insert(n);
			}
			else {
				ABR b = new ABR();
				b.root = this.root.child_left_;
				b.insert(n);
			}
		}	
	}
	
	public boolean isEmpty (){
		ABR a = new ABR ();
		if (this == a){
			return true;
		}
		else {
			return false;
		}				
	}
	
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
	
	public void toList(List l){
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
