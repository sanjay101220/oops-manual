public class mobile{ 
private String man; 
private String os; 
public String clr; 
private int cost; 
public mobile(String man,String os,String clr,int cost){ 
this.man=man; this.os=os; this.clr=clr; 
this.cost=cost; 
} 
public String toString(){ return "manufacturer = "+man+"\n"+"operating_system = 
"+os+"\n"+"color = "+ clr+"\n"+"cost = "+cost; 
} 
public static void main(String[]args){ 
mobile mobile=new mobile("Redmi","Andriod","Blue",34000); 
System.out.println(mobile); 
} 
} 
