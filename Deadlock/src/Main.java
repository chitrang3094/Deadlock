import java.util.Random;


public class Main {
	private int[] A=new int[]{5,5,5,5};
	private int[][]R=new int[4][4];
	private int[][]Alloc=new int[4][4];
	
	
		
	public static void main(String[] args){
		 Process []p=new Process[4] ;
		//p=new Process[4];
		for(int i=0;i<4;i++){
			p[i].new Process(i);
		}
	}
	public boolean check(){
		for(int i=0;i<4;i++){
			//R[i]=
		}
	}
	
	public class Process extends Thread{
		int id;
		int[] R=new int[4];
		int[] Alloc=new int[4];
		Random m=new Random();
		Process(int id){
			this.id=id;
			for(int i=0;i<4;i++){
				R[i]=m.nextInt(5);
				Alloc[i]=0;
			}
			
		}
		public void run(){
			while(true){
				int temp=m.nextInt(4);
				R[temp]=R[temp]-1;
				Alloc[temp]+=1;
				boolean wait=check();
				if(wait==true){
					while(true){
						R[temp]=R[temp]+1;
						Alloc[temp]-=1;
						if(wait=check()==false){
							break;
						}
					}
				}
			}
		}
		public int[] getRequired(){
			return R;
		}
		public int[] getAllocated(){
			return Alloc;
		}
	}
	
	
}
