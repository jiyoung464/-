import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class AddStudent
{
	public void addStudent()throws IOException{
	{
		Scanner scan = new Scanner(System.in);
        String fpath = "C:" + "studentlist.txt";
        
        try {

            PrintWriter out = new PrintWriter(new FileWriter(fpath, true));
            System.out.println("학생정보를 등록합니다.");
            System.out.println("학번 이름 학과 전화번호 순으로 적어주세요. ");
            System.out.println("학번	이름	 학과	 전화번호 ");   
            String str = scan.nextLine();
			out.println(str);
     
			scan.close();	
			out.close();
     
        } catch (Exception e) {
    
           if(e instanceof IOException) System.out.println("Input & Out Error ");
           else System.out.println("Etc Error " + e.toString());


        } 

    } 
   } 
}


