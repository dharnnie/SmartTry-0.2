import javax.swing.JOptionPane;
import java.io.IOException;
import java.lang.*;

class SmartTry{

	public static void main(String[] args) throws IOException{
		SignUp signup = new SignUp();
		Login login = new Login();
		// all shitty informations and welcome address;
		String welcomeMessage = "Welcome to SMART_TRY: This is now a better program, be careful with inputs_anyway";
		JOptionPane.showMessageDialog(null, welcomeMessage, "WELCOME", JOptionPane.INFORMATION_MESSAGE);
		String register = JOptionPane.showInputDialog(null, "TO SIGN UP >> 1 \n TO LOGIN >> 2", "SIGN_UP OR LOGIN", JOptionPane.INFORMATION_MESSAGE);
		int regVal = Integer.parseInt(register);
		Login play = new Login();
		if(regVal == 1){// user registration
			CreateAndSaveFile newUser = new CreateAndSaveFile();

			

			String fileName = signup.setFileName();
			String matric = signup.setMatricNum();
			String level = signup.setLevel();
			String dept = signup.setDept();
			String passKey = signup.setPassword();

			newUser.createUserFile(fileName);
			newUser.saveInFile(fileName, passKey, matric, level, dept);
			// create account and set fixed amount of money;;;
	

			GenerateQuestions handleQuestion = new  GenerateQuestions("GeneralQuestions.txt");// object of question class
			handleQuestion.setQuestionsInFile();
			handleQuestion.saveScore(fileName);// saves score in file from the question class
			newUser.closeFile();// closes the new user's file
			//handleQuestion.closeQuestionFile();
		}else if(regVal == 2){
			//Login login = new Login(); object is already created

			String loginInfo = " LOGIN!!\n All I need is your SURNAME and PASSWORD\n ENJOY ";
			JOptionPane.showMessageDialog(null, loginInfo, "Please ReadUp", JOptionPane.INFORMATION_MESSAGE);
			
			
			login.locateFile();
			if(!login.verifyDetails()){
				JOptionPane.showMessageDialog(null, "VALIDATION ERROR","ERROR", JOptionPane.ERROR_MESSAGE);
			}else{
				//CreateAndSaveFile newUser = new CreateAndSaveFile();
				GenerateQuestions handleQuestion = new  GenerateQuestions("GeneralQuestions.txt");// object of question class
				handleQuestion.setQuestionsInFile();
				handleQuestion.saveScore(login.getFileName());
				//newUser.closeFile();
			}
		}else{
			String mess = JOptionPane.showInputDialog(null, "Your Decision is invalid, please tryAgain\n You can drop a message or leave the box empty and click ok",
		 		"AN ERROR OCCURED", JOptionPane.ERROR_MESSAGE);
		 	throw new IllegalArgumentException(mess);

		}
	}
}