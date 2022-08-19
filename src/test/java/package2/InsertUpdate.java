package package2;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Fillo;

public class InsertUpdate
{
	public static void main(String[] args) throws FilloException
	{
		Fillo fillo=new Fillo();

        com.codoid.products.fillo.Connection connection = fillo.getConnection("C:\\Users\\raghavm\\Desktop\\B.xlsx");
	//	String strQuery="INSERT INTO sheet1(Name,Details) VALUES('Pawan','72')";connection.executeUpdate(strQuery);
		String strQuery1="Update Sheet1 Set Details=99 where Name='Raghav'"; 
		connection.executeUpdate(strQuery1);
		String strQuery2="Select * from Sheet1";
		
	}

}
