package com.dateandtime.methods;

public class CompenyArray {
	int compenyId;
	String compenyName;
	int empCount;
	String compenyLocation;
	double income;
	public CompenyArray(int compenyId,String compenyName,int empCount,String comenyLocation,double amount){
		this.compenyId=compenyId;
		this.compenyName=compenyName;
		this.empCount=empCount;
		this.compenyLocation=comenyLocation;
		this.income=income;
	}
	

public CompenyArray getCompeny() {

    CompenyArray compenyRef =
        new CompenyArray(100, "Codegnan", 200, "Hyderabad", 20045.56);

    return compenyRef;
}
public String[] getEmployeeList(){
	String[]  empList= {"suman","kumar","lakshmi"};
	 return empList;
}
public CompenyArray[] getCompenyList() {

    CompenyArray[] compenyarray = {

        new CompenyArray(100, "Codegnan", 200, "Hyderabad", 20045.56),

        new CompenyArray(101, "Accenture", 2000, "Hyderabad", 222893.07),

        new CompenyArray(102, "Google", 208393, "Hyderabad", 2937463.057)

    };

    return compenyarray;
}
}

