class test{
public void main[String()args]{
	system.out.println("This is main class");
		extra e = new extra;
		e.marks1();
		e.student();
}

}

class extra{
public void marks1(){
System.out.println("this is External java class");

}
public void student(int a, int b, int c){
int a ;
int b; 
int c;
int sum = a+b+c;
System.out.println("sum of three number is "+sum);

 switch(sum){  
    case 20: System.out.println("10");
	break;  
    case 30: System.out.println("20");
	break;  
    case 40: System.out.println("30");
	break;  
    default:System.out.println("Not in 10, 20 or 30");  
}

}

