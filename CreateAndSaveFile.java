import java.lang.*;
import javax.swing.JOptionPane;
import java.util.Formatter;
import java.io.IOException;
public class CreateAndSaveFile{

	// public CreateAndSaveFile(){

	// }
	private String userSurname;

	public Formatter newUserFile;


	private int score;

	public void createUserFile(String surname){
	
	userSurname = surname;

		
		try{

			newUserFile = new Formatter(surname.concat(".txt")); //this guy here adds the file extension .txt to the user prefered file name.

			JOptionPane.showMessageDialog(null, "Your file has been created", "CONGRATULATIONS", JOptionPane.INFORMATION_MESSAGE);
			
			JOptionPane.showMessageDialog(null, "You DETAILS are [[NOT]] set!!!","YOU CAN NOW CONTINUE", JOptionPane.INFORMATION_MESSAGE);


		}
		catch(Exception err){
			JOptionPane.showMessageDialog(null, "An error occured during the file creation", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
	public void saveInFile(String username, String userPassWord, String userMatricNum, String userLevel, String myDepartment){
		newUserFile.format("NAME %s \nPASSWORD %s \nMATRIC_NUMBER %s \nLEVEL %s  \nDEPARTMENT %s", username, userPassWord, userMatricNum, userLevel, myDepartment);
	}
	public void closeFile(){
		newUserFile.close();
	}
	
}






