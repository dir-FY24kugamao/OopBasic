package company;

import java.security.Timestamp;

import javax.swing.text.Position;

public class Employee {
	String name;
	String department;
	String position;
	int employeeId;
	
	//コンストラクター
	public Employee(String name, String department, String position, int employeeId) {
        this.name = name;
        this.department = department;
        this.position= position;
        this.employeeId = employeeId; 
	}
	
	//報告
	public void report(int times) {
		System.out.println(times + "回目の報告をします。役職："+ position +"名前:"+name)
		
	}
	//報告
	public void report() {
		report(1);
	}
	

}
