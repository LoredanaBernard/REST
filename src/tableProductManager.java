import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class tableProductManager {
	static Statement st=null;
	static  Connection cn=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "localhost";
		String login="root";
		String passwd ="";
		
		
		try{
			
			
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url,login,passwd);
			st = cn.createStatement(); 
			System.out.println("Connection réussie");
//			ajouterProduct(Queries.addProd);
			}
		catch(SQLException e){
			e.printStackTrace();			
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		finally{
			try{
				cn.close();
				st.close();
			}
			catch(SQLException e){
			e.printStackTrace();
			}
		}
	}

//	private static void ajouterProduct(int id, String n, String desc, int st) {
//		try {
//			st.executeUpdate("INSERT INTO PRODUCT VALUES(DEFAULT,'aaaa','bbbb',50);");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	
	public static int compterProduit() {
		int i=0;
		
		try {
			ResultSet res =st.executeQuery(Queries.countProd);
			res.next();
			i=Integer.parseInt(res.getString(1));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	
	public static String descriptionProduit(int id) {
		String i=null;
		
		try {
			ResultSet res =st.executeQuery(Queries.descriptionProd+id 
					+";");
			res.next();
			i=res.getString(1);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	}

	
	

