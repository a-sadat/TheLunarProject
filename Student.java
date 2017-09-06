public class student{
  private String FName, LName, StudentID;
  private int creditHours;
  private double GPA;

  public student (String FName, String LName, String StudentID){
    this.FName = FName;
    this.LName = LName;
    this.StudentID = StudentID;
    this.creditHours = creditHours;
    this.GPA = GPA;
  }



	/**
	* Returns value of FName
	* @return
	*/
	public String getFName() {
		return FName;
	}

	/**
	* Sets new value of FName
	* @param
	*/
	public void setFName(String FName) {
		this.FName = FName;
	}

	/**
	* Returns value of LName
	* @return
	*/
	public String getLName() {
		return LName;
	}

	/**
	* Sets new value of LName
	* @param
	*/
	public void setLName(String LName) {
		this.LName = LName;
	}

	/**
	* Returns value of StudentID
	* @return
	*/
	public String getStudentID() {
		return StudentID;
	}

	/**
	* Sets new value of StudentID
	* @param
	*/
	public void setStudentID(String StudentID) {
		this.StudentID = StudentID;
	}

	/**
	* Returns value of creditHours
	* @return
	*/
	public int getCreditHours() {
		return creditHours;
	}

	/**
	* Sets new value of creditHours
	* @param
	*/
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}

	/**
	* Returns value of GPA
	* @return
	*/
	public double getGPA() {
		return GPA;
	}

	/**
	* Sets new value of GPA
	* @param
	*/
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	/**
	* Create string representation of student for printing
	* @return
	*/
	@Override
	public String toString() {
		return "student [FName=" + FName + ", LName=" + LName + ", StudentID=" + StudentID + ", creditHours=" + creditHours + ", GPA=" + GPA + "]";
	}
}
