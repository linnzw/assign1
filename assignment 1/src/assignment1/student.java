package assignment1;

import java.sql.*; 

public class student {

	public static void main(String[] args) throws SQLException { 
		// Connect to database
Connection conn = null;
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?" +
	    	                                   "user=root&password=Lzw18099606166");	
	
		// Create a statement to retrieve objects
		Statement s = conn.createStatement();        

		// Retrieve results from the table
		ResultSet rs = s.executeQuery ("Select * from student"); 
		
		// Print columns headers
		ResultSetMetaData rsmd =rs.getMetaData(); 
		int i =rsmd.getColumnCount( );
		
		for(int j=1; j<=i; j++) { 
			System.out.print(rsmd.getColumnName(j)+"\t"); 
			System.out.print(" "); 
		} 

		// Print records
		while(rs.next( ) ) { 
			for(int j=1; j<=i; j++) 
			{ 
				System.out.print ( rs.getString( j)+"\t"); 
			}
		}
		
	}
}
