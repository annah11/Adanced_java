package bd;

import java.sql.*;
public class simple {
	public static void main(String[] args) {
		String user = "naol";
		String pass = "1122";
		String url = "jdbc:mysql://localhost:3306/astu";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,pass);
			System.out.println("Connected successfully");

			// create statement
			Statement st = con.createStatement();
			
			// execute statement
			String query = "SELECT * FROM tv_shows";
			ResultSet rs = st.executeQuery(query);
			
			// print result
			while (rs.next()){
				int id = rs.getInt("id");
				String title = rs.getString("title");
				System.out.println(id +"  "+ title);
			}


		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
