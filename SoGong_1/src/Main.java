import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
	{
		public static void main(String[] args)
		{
			BufferedReader in = new BufferedReader(new InputStreamReader (System.in));

			System.out.println("1)  학생 등록");
			System.out.println("2)  학생 검색");
			System.out.println("3)  학생 삭제");
			System.out.println("4)  학생 기록 수정");
			System.out.println("5)  프로그램 종료");
		
			try{
				switch(Integer.parseInt(in.readLine())){
					case 1 : // 학생 등록

						AddStudent add = new AddStudent();
						add.addStudent();

						break;
				} 

			} catch (IOException ioe) { 

                    ioe.printStackTrace(); 
				

			} 
		}
}
