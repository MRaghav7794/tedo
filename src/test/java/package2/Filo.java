package package2;

import java.sql.Connection;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Filo 
{
	public static void main(String[] args) throws FilloException
	{
		Fillo fillo=new Fillo();

         com.codoid.products.fillo.Connection connection = fillo.getConnection("C:\\Users\\raghavm\\Desktop\\B.xlsx");
        String strQuery="Select * from Sheet1 where Details='77'";
        Recordset recordset=connection.executeQuery(strQuery);
         
        while(recordset.next())
        {
        System.out.println(recordset.getField("Name"));
        }     
        recordset.close();
        connection.close();
        
	}

}
