package CollectionAssign1;

public class Student {
	
private int id;
private int marks;
private String medal;

public Student(int id, int marks) {
	super();
	this.id = id;
	this.marks = marks;
	setMedal(marks);
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public String getMedal() {
	return medal;
}
public void setMedal(int marks) {
	if(marks>=90)
		this.medal="Gold";
	else if(marks>=80 && marks<90)
		this.medal="Silver";
	else if(marks>=70 && marks<80)
		this.medal="Bronze";
	else
		this.medal="None";
}

}
