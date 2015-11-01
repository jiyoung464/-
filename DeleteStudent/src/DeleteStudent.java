 import java.io.*; 

 public class DeleteStudent { 
	 
      public void deleteStudent() { //void main(String args[]) { 

             String strLine = "0"; 
             String dummy = ""; 

             try { 
                     
                    BufferedReader fileReader = new BufferedReader(new FileReader(new File("studentlist.txt"))); 

                    int studentCount = 0;
					
                    while ((strLine = fileReader.readLine()) != null) { 

                           if(!strLine.contains("0911328")) { 

                              dummy += strLine + "\r\n"; 

                           } 

						   studentCount++; 

                    }                      

					System.out.println(dummy);
					fileReader.close();

                } catch (IOException ioe) { 

                    ioe.printStackTrace(); 

				 } 

               
				
      } 

 } 

