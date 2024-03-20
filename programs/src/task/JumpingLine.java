package task;

public class JumpingLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w=40,h=9;
		int jumpWidth = h-3;
		int jumpmid = jumpWidth/2;
		
		if(h%2 == 1) {		
			int midH = (h/2);
			int jumpLeft =0,jumpRight=jumpWidth;
			
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					int printLocation = j%jumpWidth;
					
//                  mid Line
					if(midH == i) {
						System.out.print("-");
					}
					else if(printLocation== jumpLeft || printLocation== jumpRight) {
						System.out.print("*");
						
					}
					else if(i==0||j==0||i==h-1||j==w-1) {
						System.out.print("'");
					}
					else {
						System.out.print(" ");
					}
					
				}
				System.out.println("");
				 if (jumpmid > (i%h) && midH !=i ) {
					 jumpLeft++;
					 jumpRight--;
				 }
				 else if(midH !=i && (midH-1)!=i) {
					 jumpLeft--;
					 jumpRight++;
				 }
			}
		}else {
			System.out.println("Its a even number");
		}
	}

}
