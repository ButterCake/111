import java.util.Scanner;
public class Person {
	String name;
	int score;
	Scanner input=new Scanner(System.in);
	public int showFist(){
		System.out.print("\n请选择精灵系别\n(慎重!你将无法控制野生精灵,它们的胜负仅同系别)：\n1.水系2.草系3.火系");
		int usel=input.nextInt();
		switch(usel){
		case 1:System.out.println("你决定是--->杰尼龟");break;
		case 2:System.out.println("你决定是--->妙蛙种子");break;
		case 3:System.out.println("你决定是--->小火龙");break;
		}
		return usel;
	}
}
