package danOrders;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;

	public class GeneralFunctions {

	/**
	* @param args
	*///a
	public static String GetDataFromMainDb(String Query) {
	// TODO Auto-generated method stub
		Statement stmt;
		ResultSet rs = null;
		String resultValue = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//oracle.jdbc.driver.OracleDriver
				String url = "jdbc:oracle:thin:@localhost:11523:MCRFBWUA";
				Connection con = DriverManager.getConnection(url,"martini_main_dm","martini");
				
				stmt = con.createStatement();
				
				//boolean res = stmt.
				//String strProfileIdQuery="Select grh_id From gift_reg_header where GRH_Created_For in( Select USA_ID From User_account where USA_UID ='dm_rtudor@woolworths.com.au')AND grh_registry_name='pastbuys' ";
				rs = stmt.executeQuery(Query);
				while (rs.next())
					resultValue = rs.getString(1);
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("problem in db exeption thrown out");
				e.printStackTrace();
			}
			return resultValue;
	}
	
	



}
