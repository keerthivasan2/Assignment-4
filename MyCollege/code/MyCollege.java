import java.util.*;
class College implements Runnable{
    String clgeName="Anna University";
	int clgeid=188;
	int seatfil=48;
	int seat;
	College(int seat)
	{
		this.seat=seat;
	}
	public void run(){
		synchronized(this)
		{
		String name=Thread.currentThread().getName();
		  if(seatfil<50){
	      System.out.println(name+":You got a Seat");
		  seatfil++;
		  try{Thread.sleep(1000);}
	      catch(InterruptedException ie){}
		  }
	  else{System.out.println(name+":Seat is filled");}
	}
}
}
class MyCollege{
	public static void main(String...args){
		College c=new College(3);
		Thread c1=new Thread(c);
		Thread c2=new Thread(c);
		Thread c3=new Thread(c);
		c1.setName("keerthivasan");
		c2.setName("kannadasan");
		c3.setName("karthi");
		c1.start();
		c2.start();
		c3.start();
	}		
}
	
	
	