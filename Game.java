import java.util.Scanner;
public class Game {
	int count=0;
	int countP=0;
	Person person=new Person();
	Computer computer=new Computer();
	Scanner input=new Scanner(System.in);
	public void initial(){
		System.out.print("请选择角色：1.小智  2.小茂  3.小蓝(输入数字,按下回车确认):");
		int juese=input.nextInt();
		switch(juese){
			case 1:person.name="小智";
				break;
			case 2:person.name="小茂";
				break;
			case 3:person.name="小蓝";
				break;
		}
		System.out.print("请选择对手:1.大木博士  2.火箭队3人组  3.四大天王):");
		int JueSe=input.nextInt();
		switch(JueSe){
			case 1:computer.name="大木博士";
				break;
			case 2:computer.name="火箭队3人组";
				break;
			case 3:computer.name="四大天王";
				break;
		}
	}
	public void begin(){
		System.out.print("\n游戏即将开始，你准备好了吗？ (y/n)");
		String ans=input.next();
		if(ans.equals("y")){
			String answ;
			do{
				int a=person.showFist();
				int b=computer.showfist();
				if(a==1&&b==3||a==2&&b==1||a==3&&b==2){
					System.out.println("结果：你赢了！");
					person.score++;
				}else if(a==1&&b==1||a==2&&b==2||a==3&&b==3){
					System.out.println("结果：平手。");
					countP++;
				}else{
					System.out.println("结果：你输了！");
					computer.score++;
				}
				count++;
				System.out.print("\n是否开始下一轮?  (y/n)");
			    answ=input.next();
			}while(answ.equals("y"));
		}
		else {
			System.out.print("\n你中途放弃了参加野生精灵大乱斗。\n");
		}
	}
	public String calcResult(){
		String a;
		if(person.score>computer.score){
			a="最终结果：恭喜！你赢了！";
		}else if(person.score==computer.score){
			a="最终结果：水平相当。";
		}else{
			a="最终结果：你输了。祝下回好运！";
		}
		return a;
	}
	public void showResult(){
		System.out.println("---------------------------------------------------");
		System.out.println("\t\t"+person.name+"  VS  "+computer.name+"\n");
		System.out.println("对战次数："+count+"次");
		System.out.println("平局："+countP+"次");
		System.out.println(person.name+"得："+person.score+"分");
		System.out.println(computer.name+"得："+computer.score+"分\n");
		System.out.println(calcResult());
		System.out.println("---------------------------------------------------");
	}
}
