import java.util.HashMap;
import java.util.Scanner;

public class HashMapLab {

	public static void main(String[] args) {
		String deneme="Burak";
		HashMap<String,String> studentInfo=new HashMap<String,String>();
		String facOne="111",facTwo="222",facThree="333",facFour="444",facFive="555",facSix="666",facSeven="777";
		studentInfo.put(facOne,"Faculty One");
		studentInfo.put(facTwo,"Faculty Two");
		studentInfo.put(facThree,"Faculty Three");
		studentInfo.put(facFour,"Faculty Four");
		studentInfo.put(facFive,"Faculty Five");
		studentInfo.put(facSix,"Faculty Six");
		studentInfo.put(facSeven,"Faculty Seven");
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the student ID");
		String studentId=input.nextLine();
		char[] ch=new char[3];
		ch[0]=studentId.charAt(4);
		ch[1]=studentId.charAt(5);
		ch[2]=studentId.charAt(6);
		String studentFacultyID=String.valueOf(ch);
		String studentFacultyName=studentInfo.get(studentFacultyID);
		System.out.printf("Students ID is %s \nStudents faculty name is %s \nStudents faculty ID is %s",studentId,studentFacultyName,studentFacultyID);
	}
	public char[] returnCharArray(String string) {
		char[] ch=new char[string.length()];
		for (int i=0;i<ch.length;i++) {
			ch[i]=string.charAt(i);
		}
		return ch;
	}
	public String returnID(char[] ch) {
		return String.valueOf(ch[4]+ch[5]+ch[6]);
	}

}
