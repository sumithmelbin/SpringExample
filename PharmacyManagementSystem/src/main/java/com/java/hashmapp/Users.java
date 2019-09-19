package com.java.hashmapp;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.resource.spi.work.Work;
import java.sql.Connection;

public class Users {
	private int id;
	private String fname;
	private String lname;
	private int age;

	public Users(int id, String fname, String lname, int age) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}

	public static Connection getConnection1() throws ClassNotFoundException {
		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/patient", "root", "root");
		} catch (SQLException ex) {
			Logger.getLogger(Work.class.getName()).log(Level.SEVERE, null, ex);
		}

		return con;
	}

	public static void main(String[] args) throws ClassNotFoundException {
		HashMap<Integer, Users> hashMap = new HashMap<Integer, Users>();
		Statement statement = null;
		ResultSet resultSet = null;
		Connection con = getConnection1();
		try {
			statement = con.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM Users");
			while (resultSet.next()) {
				Integer id = resultSet.getInt(1);
				String fname = resultSet.getString(2);
				String lname = resultSet.getString(3);
				Integer age = resultSet.getInt(4);
				Users users = new Users(id, fname, lname, age);

				/* SET DATA IN THE HASH MAP */
				hashMap.put(id, users);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		/* DISPLAY DATA FROM THE HASH MAP */
		
		for (Integer i : hashMap.keySet()) {
			Users users = hashMap.get(i);
			// System.out
			// .println(users.getId() + "\n" + users.getFname() + "\n" + users.getLname() +
			// "\n" + users.getAge());
			System.out.println(users.toString());
		}
	}

}
