package pack;
import java.sql.*;
public class Connections {
				public static Connection conc() {
						Connection con=null;
						try {
							Class.forName("com.mysql.jdbc.Driver");  
							 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mabsquare","root","root");
						}
						catch(Exception e) {
							System.out.println(e);
						}
						return con;
					}

						
}
