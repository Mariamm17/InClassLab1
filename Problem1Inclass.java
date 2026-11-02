# InClassLab1

package edu.monmouth.lab1;

public class Problem1Inclass {

	private static final String[] GRADE_LETTER = {"A", "B", "C"};
	private static final String UNKNOWN = "unknown";
	
	
	private String grade; 
    private String location;
    private boolean available;
    private String gradeValue = "letter"; 
	

	
	
	public void getgrade() {
		 this.grade = "100";
	}
	
	public String grade() {
		return grade;
	}
	
	
	public String Location() {
		return this.location;
	}
	
	public void setlocation(String location) {
		this.location = location;
	}
	
	public boolean available() {
		return this.available;
	}
	
	public String gradeValue() {
        return this.gradeValue = "A";
    }
	
	public void setgradeValue() {
		this.gradeValue = "100";
	}
	
	
	public String gradeValue1() {
		return this.gradeValue = "B";
	}
	
	public void setgradeValue1() {
		this.gradeValue = "90";
	}
	
	public String gradeValue2() {
		return this.gradeValue = "C";
	}
	
	public void setgradeValue2() {
		this.gradeValue = "80";
	}
	
	public String gradeValue3() {
		return this.gradeValue = "D";
	}
	
	public void setgradeValue3() {
		this.gradeValue = "70";
	}
	public void setGrade(String grade) {
        this.grade = grade;
	}
}
