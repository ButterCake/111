public class Computer {
	String name;
	int score;
	public int showfist(){
		int usel;
		usel=(int)(Math.random()*10);
		if(usel<=2){
			usel=1;
		}else if(usel<=5){
			usel=2;
		}else{
			usel=3;
		}
		switch(usel){
			case 1:System.out.println(name+"决定是--->杰尼龟");break;
			case 2:System.out.println(name+"决定是--->妙蛙种子");break;
			case 3:System.out.println(name+"决定是--->小火龙");break;
		}
		return usel;
	}
}
