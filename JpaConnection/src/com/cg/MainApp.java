package com.cg;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		String url= "jdbc:oracle:thin:@localhost:1521:XE";
		Connection conn=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn=DriverManager.getConnection(url,"System","orcl11g");
			conn.setAutoCommit(false);
			PreparedStatement s1=conn.prepareStatement("UPDATE Employee SET Salary=Salary+100 WHERE eno=1002");
			
			PreparedStatement s2=conn.prepareStatement("UPDATE Employee SET Salary=Salary-100 WHERE eno=1005");
			
			
			PreparedStatement s3=conn.prepareStatement("Delete employee where eno=1002");
			s1.executeUpdate();
			s2.executeUpdate();
			Savepoint svpt=conn.setSavepoint();
			s3.executeUpdate();
			conn.rollback(svpt);
			System.out.println("DOne!!");
			conn.commit();
//			Scanner scan=new Scanner(System.in);
//			System.out.println("Enter Employee Id: ");
//			int Id=Integer.parseInt(scan.nextLine());
//			CallableStatement stat=conn.prepareCall("{?=call fnGetSalary(?)}");
//			stat.setInt(2, Id);
//			stat.registerOutParameter(1, Types.NUMERIC);//return value should be given like this
//			
//			stat.execute();//Actual procedure will be executed
//			
//			double salary=stat.getDouble(1);
//			
//			System.out.println("Salary : "+salary);
//
//			stat.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println(e.getMessage());
		}catch(Exception ex){
			try {
				conn.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
//		try {
//			Scanner scan = new Scanner(System.in);
//			System.out.print("Enter Gender: ");
//			String g=scan.nextLine();
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
//			Connection con = DriverManager.getConnection(url,"system","orcl11g");
////			Statement stat=con.createStatement();
////			ResultSet rs=stat.executeQuery("SELECT * FROM Employee");
//			PreparedStatement stat=con.prepareStatement("SELECT * FROM Employee WHERE gender=?");
//			stat.setString(1, g);
//			ResultSet rs=stat.executeQuery();
//			while(rs.next()){
//				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString("gender")+" "
//			+rs.getInt(4)+" "+rs.getDouble(5));
//				
//			}
//			stat.close();
//			rs.close();
//			con.close();
//		} catch (ClassNotFoundException e) {
//			System.out.println(e.getMessage());
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		}

	}

}
