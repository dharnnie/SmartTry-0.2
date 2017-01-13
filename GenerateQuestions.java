import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import javax.swing.JOptionPane;
import java.util.Formatter;
import java.lang.Throwable;
import java.util.Random;
public class GenerateQuestions extends CreateAndSaveFile{// other classes that generate other forms of questions can inherit this class; $JUST_SAYING

	
	private static String fileValue;// fileName

	private Formatter saveScoreInFile;

	// another object for the user file to save the score 
	//private static final String RECOVER_THIS = "RecoverGeneralQuestions.txt";


	private static int score = 0;// declares score var
	public static int loopVar;// the loop variable in openFile has to be declared as static to be refrenced in a static method i. displayQuestion method 
	private static String[]q = new String[10];// declares the array to save the questions
	public GenerateQuestions(String fileName){// recall to declare the file name in the main class and set to the object 

		fileValue  = fileName;// sets the question fileName
		
	}
	public void setQuestionsInFile() throws IOException{

		FileReader reader = new FileReader(fileValue);

		BufferedReader buffer = new BufferedReader(reader);

		try{

				for(loopVar = 0; loopVar < 10; loopVar++){

					q[loopVar] = buffer.readLine();
					GenerateQuestions.displayQuestion(loopVar, q[loopVar]); // does most of the j
				}	
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "ERROR", "err", JOptionPane.ERROR_MESSAGE);
			}finally{
			reader.close();
			buffer.close();
		}	
	}
	// create a method to load questions
	public static void displayQuestion(int qNum, String display){

		int qGuy = qNum + 1;
		String ans = JOptionPane.showInputDialog(null, display, "Question " + qGuy, JOptionPane.INFORMATION_MESSAGE);// RECALL IF ERROR OCCURS q[loopVar] shouls replace qNum 
		ans.toLowerCase();

		if(qNum == 0 || ans.equals("a")){// these guys here checks for correct and incorect answers  
			score++;
		}else if(qNum == 1 && ans.equals("b")){
			score++;
		}else if(qNum == 2 && ans.equals("a")){
			score++;
		}else if(qNum == 3 && ans.equals("a")){
			score++;
		}else if(qNum == 4 && ans.equals("b")){
			score++;
		}else if(qNum == 5 && ans.equals("c")){
			score++;
		}else if(qNum == 6 && ans.equals("d")){
			score++;
		}else if(qNum == 7 && ans.equals("d")){
			score++;
		}else if(qNum == 8 && ans.equals("a")){
			score++;
		}else if(qNum == 9 && ans.equals("c")){
			score++;
		}
	}
	private int getScore(){
		return score;
	}
	public void saveScore(String file) throws IOException{ //I'm thinking other classes can inherit this method to save the score
			
		try{// this method annoys me;;;
			saveScoreInFile = new Formatter(file); 
			saveScoreInFile.format("\nSCORE_IN_GENERAL: %d", this.getScore());// save the Score in logged in file

		}catch(Exception err){
			String errMsg = "Something happened\n Not to worry, We'll handle it"; //catch errors
			JOptionPane.showMessageDialog(null, errMsg , "YOUR SCORE WAS NOT SAVED", JOptionPane.ERROR_MESSAGE);
		}finally{
			saveScoreInFile.close();
		}
	}
}