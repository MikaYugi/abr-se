package abrse;

public class ABR {
	ABR child_left_, child_right_;
	int r;
	
	ABR(ABR l_child, ABR r_child, int d){
		this.r = d;
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
}
