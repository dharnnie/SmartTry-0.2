import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
public class Login{

	// add exceptions to it...
	private Scanner lookInFile;
	String nameOfFile;
	
	private String iNeedYourFName(){
		//input name , while 
		String fName = JOptionPane.showInputDialog(null, "SURNAME or FILENAME", "LOGIN", JOptionPane.INFORMATION_MESSAGE);
		nameOfFile = fName;
		return fName;
	}
	private String iNeedYourPassword(){
		String pWord = JOptionPane.showInputDialog(null, "password goes here", "LOGIN", JOptionPane.INFORMATION_MESSAGE);
		return pWord;
	}
	public void locateFile(){// i have removed the arguments, REPLACED WITH THE iNeedYourFName(); method

		try{

			lookInFile = new Scanner(new File(iNeedYourFName().concat(".txt")));// changed stuffs here..
		}catch(Exception err){
			String errMessage = err.getMessage();
			JOptionPane.showMessageDialog(null, errMessage, "AN ERROR OCCURED", JOptionPane.ERROR_MESSAGE);
		}finally{
			
		}
	}
	public boolean verifyDetails(){// change this password to lower case in the main class
		boolean stat = false;
		while(lookInFile.hasNext()){
			
			String a = lookInFile.next();
			String b = lookInFile.next();
			if(a.equals("PASSWORD") && b.equals(iNeedYourPassword())){
				stat = true;
			}
		}
	return stat;
	}
	// public int checkScores(){
	// 	// returns the user's score at every level...
	// }
	public String getFileName(){
		return nameOfFile;
	}

}