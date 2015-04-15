


public class Main {
	private int[] A=new int[]{5,5,5,5};
	private int[][]R=new int[4][4];
	private int[][]Alloc=new int[4][4];
	
	static Process []p=new Process[4] ;
	
		
	public static void main(String[] args){
		 Main n=new Main();
		//p=new Process[4];
		for(int i=0;i<4;i++){
			p[i]=new Process(i+1);
		}
		n.set();
	}
	public boolean check(){
		set();
		for(int i=0;i<4;i++){
			if(R[i][0]<=A[0] && R[i][1]<=A[1] && R[i][2]<=A[2] && R[i][3]<=A[3]){
				return true;
			}
		}
		return false;
	}
	
	public void set(){
		for(int i=0;i<4;i++){
			R[i]=p[i].getRequired();
			Alloc[i]=p[i].getAllocated();
		}
	}
	
}
