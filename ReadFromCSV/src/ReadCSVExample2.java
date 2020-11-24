import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  
public class ReadCSVExample2  
{  
public static void main(String[] args)   
{  
	int i = 0;
String line = "";  
String splitBy = ",";  
try   
{  
//parsing a CSV file into BufferedReader class constructor  
BufferedReader br = new BufferedReader(new FileReader("EEG_Data_Excel.csv"));  
while ((line = br.readLine()) != null)   //returns a Boolean value  
{  
	if( i >= 2 )
	{
		String[] data = line.split(splitBy);    // use comma as separator  
		System.out.println("AF3 = " + data[3]);
		System.out.println("F7 = " + data[4]);
		System.out.println("F3 = " + data[5]);
		System.out.println("FC5 = " + data[6]);
		System.out.println("T7 = " + data[7]);
		System.out.println("P7 = " + data[8]);
		System.out.println("O1 = " + data[9]);
		System.out.println("O2 = " + data[10]);
		System.out.println("P8 = " + data[11]);
		System.out.println("T8 = " + data[12]);
		System.out.println("FC6 = " + data[13]);
		System.out.println("F4 = " + data[14]);
		System.out.println("F8 = " + data[15]);
		System.out.println("AF4 = " + data[16]);
		System.out.println("RAWCQ = " + data[17]);

	}
	i++;
}  
}   
catch (IOException e)   
{  
e.printStackTrace();  
}  
}  
}  