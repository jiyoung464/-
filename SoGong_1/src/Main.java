import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
	{
		public static void main(String[] args)
		{
			BufferedReader in = new BufferedReader(new InputStreamReader (System.in));

			System.out.println("1)  �л� ���");
			System.out.println("2)  �л� �˻�");
			System.out.println("3)  �л� ����");
			System.out.println("4)  �л� ��� ����");
			System.out.println("5)  ���α׷� ����");
		
			try{
				switch(Integer.parseInt(in.readLine())){
					case 1 : // �л� ���

						AddStudent add = new AddStudent();
						add.addStudent();

						break;
				} 

			} catch (IOException ioe) { 

                    ioe.printStackTrace(); 
				

			} 
		}
}
