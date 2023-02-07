package OOPs;
// no-args constructor
//parameterized constructor
//toString method
//setter and getter method
//maintain encapsulation-all the variable will be private
class College{
	private int collegeId;
	private String collegeName;
	// no-args constructor
	public College() {
		super();
		
	}
	// parameterized constructor
	public College(int collegeId,String collegeName) {
		super();
		this.collegeId=collegeId;
		this.collegeName=collegeName;
}
	// setter
	public void setCollegeId(int collegeId)
	{
		this.collegeId=collegeId;
	}
	//getter
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName=collegeName;
	}
	public String getCollegeName() {
		return collegeName;
		
	}
	


@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + "]";
	}

}

public class JavaBeansDemo {
public static void main(String[] args) {
	College college1=new College();
	college1.setCollegeId(101);
	college1.setCollegeName("Marwari College Ranchi");
	System.out.println(college1);
	
	System.out.println("College Name:"+college1.getCollegeName());
	System.out.println("College Id:"+college1.getCollegeId());
	College college2=new College(101,"Marwari College");
	System.out.println(college2);
}

}
