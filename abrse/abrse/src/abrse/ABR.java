package abrse;

public class ABR {
	ABR child_left_, child_right_;
	int r, d;
	
	ABR(ABR l_child, ABR r_child, int racine, int dimension){
		this.r = racine;
		this.d = dimension;
		this.child_left_ = l_child;
		this.child_right_ = r_child;
	}
	
	void insert (int n){
		if (n<=this.r){
			(this.child_left_).insert(n);
		}
		else {
			(this.child_right_).insert(n);
		}
	}
	
	boolean isEmpty (){
		if (this.d == 0){
			return false;
		}
		else {
			return true;
		}				
	}
	
	
	
}