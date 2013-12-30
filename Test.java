public class Test {
	public static void main(String[]args){
		Game g=new Game();
		System.out.println("-----------------欢迎回到精灵世界--------------------\n");
		System.out.println("\t\t*******************");
		System.out.println("\t\t** *野生精灵乱斗* **");
		System.out.println("\t\t*******************\n");
		System.out.println("野生精灵可选系别  === 1.水系2.草系3.火系\n");
		g.initial();
		g.begin();
		g.showResult();
		}
	}
