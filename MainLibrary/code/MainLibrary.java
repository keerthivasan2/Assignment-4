import java.util.*;
import java.io.*;
class Library implements Serializable{
	String auName,BookName;
	int isbc;
	Library(String auName,String BookName,int isbc){
		super();
		this.auName=auName;
		this.BookName=BookName;
		this.isbc=isbc;
	}
	public String toString(){
		return "Author Name:"+auName+",Book Name:"+BookName+",ISBC num:"+isbc;
	}
}
class MainLibrary{
	public static void main(String...args)throws IOException,ClassNotFoundException{
	  HashSet<Library> hs= new HashSet<Library>();
	  Library s1=new Library("James Gosling","Java",20235);
	  Library s2=new Library("Bjarne Stroutrup","C++",24654); 
	  Library s3=new Library("Dennis Ritchie","C",22465);
	  hs.add(s1);
	  hs.add(s2);
	  hs.add(s3);
	  Iterator it=hs.iterator();
	  while(it.hasNext()){
		  System.out.println(it.next());
	  }
	  FileOutputStream fos=new FileOutputStream("D:\\Keerthijava\\seriliazation\\Library.txt");
	  ObjectOutputStream oos=new ObjectOutputStream(fos);
	  oos.writeObject(hs);
	  fos.close();
	  oos.close();
	  FileInputStream fis=new FileInputStream("D:\\Keerthijava\\seriliazation\\Library.txt");
	  ObjectInputStream ois=new ObjectInputStream(fis);
	   HashSet<Library> hs1= new HashSet<Library>();
	  ois.readObject();
	  fis.close();
	  ois.close();
	  for(Library li:hs){
		 System.out.println(li);
	  }
	  }
}
	 
	  
  
	  
		

	
	
	
