package abrse;

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
	
	ABR(){
		this.root = null;
	}
	
	
	
	void insert (int n){
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
	
	boolean isEmpty (){
		ABR a = new ABR ();
		if (this == a){
			return true;
		}
		else {
			return false;
		}				
	}
	
	int nbElements(){
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
	
	
}
