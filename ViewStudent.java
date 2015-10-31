import java.io.*;
import java.io.File; 
import java.io.IOException; 
import java.util.Scanner; 

public class ViewStudent {
	StringBuffer sb= new StringBuffer(); 
	FileReader readFile; 
	BufferedReader br; 
	String getLine; 
	String id="";
	String name="";
	String department="";
	String phonenum="";
	Scanner sc= new Scanner(System.in);
	public ViewStudent() { }
			
	public void viewStudent() {
		try { 
		readFile = new FileReader("studentlist.txt"); 
		br = new BufferedReader(readFile);  
		System.out.print("��ȸ �ϰ��� �ϴ� �й� �Է� : ");
		id = sc.next();

		while((getLine = br.readLine()) != null){  //gkgk
			if(getLine.contains(id)){ 
			String token[] = getLine.split(" ");//�����̽� ���ڷ� �ܾ� ���� 
			id = token[0]; 
			name = token[1]; 
			department = token[2];
			phonenum = token[3];            
           
            sb.append(id + " " + name + " " + department + " " + phonenum); 
			} 
		} 
	} catch (FileNotFoundException e) { 
		e.printStackTrace(); 
	} catch (IOException e) { 
		e.printStackTrace(); 
	} 
	if(name == "")
		System.out.println("�ش� �й��� �����ϴ�.");
	else System.out.println(sb.toString()); 
	}
		
	public static void main(String args[]) {
		int menu;
		ViewStudent view= new ViewStudent(); 
		while (true)
		{
		System.out.print("�޴��� �����ϼ���. :");
		Scanner menuScanner = new Scanner(System.in);
		menu = menuScanner.nextInt();
		if(menu == 3)
		{ view.viewStudent();  }
		else if (menu == 0)
		 break;
		}
	}
}