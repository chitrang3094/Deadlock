import java.util.Random;

public class Process extends Thread{
		int id;
		int[] R=new int[4];
		int[] Alloc=new int[4];
		Random m=new Random();
		Main n=new Main();
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
				boolean safe=n.check();
				if(safe==false){
					while(true){
						R[temp]=R[temp]+1;
						Alloc[temp]-=1;
						if(safe=n.check()==true){
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