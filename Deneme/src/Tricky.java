
public class Tricky {
	//This is how you change switch to if else
	public static void main(String[] args) {
		int X = 0;
		int Y = 10;
		int Z = 20;
		while (Z != 0) {
			switch (X) {
			case -1:
				Z += 30;
			case 3:
				X *= -5;
				Y = 10;
				break;
			case 0:
				X -= 1;
				Y *= 10;
				break;
			case 5:
				X *= 2;
				Y = Y + Z;
				break;
			case 10:
				X += 10;
				Y = 0;
				Z = 0;
			default:
				Y = X;
			}
		}		
		int x=0;
		int y=10;
		int z=20;
		while(z!=0) {
			if(x==-1) {
				z+=30;
				x*=-5;
				y=10;
			}else if(x==3) {
				x*=-5;
				y=10;
			}else if(x==0) {
				x-=1;
				y*=10;
			}else if(x==5) {
				x*=2;
				y=y+z;
			}else if(x==10) {
				x+=10;
				y=0;
				z=0;
				y=x;
			}else {
				y=x;
			}
		}
		System.out.println("While loop "+x + " " + y + " " + z);
		x=0;
		y=10;
		z=20;
		for(;z!=0;) {
			if(x==-1) {
				z+=30;
				x*=-5;
				y=10;
			}else if(x==3) {
				x*=-5;
				y=10;
			}else if(x==0) {
				x-=1;
				y*=10;
			}else if(x==5) {
				x*=2;
				y=y+z;
			}else if(x==10) {
				x+=10;
				y=0;
				z=0;
				y=x;
			}else {
				y=x;
			}
		}
		System.out.println("For loop "+x + " " + y + " " + z);
	}
}