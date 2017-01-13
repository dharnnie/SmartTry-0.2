import javax.swing.JOptionPane;


public class SignUp{




	public String setFileName(){
	
		String myFileName = JOptionPane.showInputDialog(null, "Set a File Name... Your Surname is preferable\ne.g OSINEYE :\n I'm a dumb program like I said \n I might not be able to remind you of all that, so \n I'll advice you write it down if you are as dumb as I am..\n Please input it here");//TO ASK IF THE USER IS REGISTRED;
		myFileName.toUpperCase();
		return myFileName;
	}
	public String setMatricNum(){
		String matricInfo = "\n Your matric Number Please\n Please be accurate";
		String myMatricNumber = JOptionPane.showInputDialog(null,matricInfo , "MATRIC NUMBER", JOptionPane.INFORMATION_MESSAGE); 



		return myMatricNumber;
	}
	public String setLevel(){
		String myLevel = JOptionPane.showInputDialog(null, "What level are you in? \n NCE 1\n NCE 2\n NCE 3", "YEAR PLEASE", JOptionPane.QUESTION_MESSAGE);
		myLevel.toLowerCase();
		return myLevel;
	}
	public String setPassword(){
		String passKey = JOptionPane.showInputDialog(null, "Watch your back\n Must be in Figures", "SAVE YOUR PASSWORD", JOptionPane.INFORMATION_MESSAGE);
		return passKey;
	}
	public String setDept(){

		String dept = JOptionPane.showInputDialog(null, "What department are you in?", "DEPARTMENT", JOptionPane.INFORMATION_MESSAGE);
		dept.toLowerCase();
		return dept;
	}
}