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
		System.out.print("조회 하고자 하는 학번 입력 : ");
		id = sc.next();

		while((getLine = br.readLine()) != null){ 
			if(getLine.contains(id)){ 
			String token[] = getLine.split(" ");//스페이스 문자로 단어 추출 
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
		System.out.println("해당 학번이 없습니다.");
	else System.out.println(sb.toString()); 
	}
		
	public static void main(String args[]) {
		int menu;
		ViewStudent view= new ViewStudent(); 
		while (true)
		{
		System.out.print("메뉴를 선택하세요. :");
		Scanner menuScanner = new Scanner(System.in);
		menu = menuScanner.nextInt();
		if(menu == 3)
		{ view.viewStudent();  }
		else if (menu == 0)
		 break;
		}
	}
}