import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		if(students==null)
		{
			throw new IllegalArgumentException("Error");	
		}
	}

	@Override
	public Student getStudent(int index) {
		if(index<0 || index>=students.length)
		{
			throw new IllegalArgumentException("Error");
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		if(student==null || index<0 || index>=students.length)
			throw new IllegalArgumentException("Error");
		else
		{
			students[index]=student;
		}
	}

	@Override
	public void addFirst(Student student) {
		if(student==null)
			throw new IllegalArgumentException("Error");
		else
		{   
			Student[] abc=new Student[students.length+1];
			abc[0]=student;
			for(int i=1;i<students.length;i++)
				abc[i]=students[i-1];
			students=new Student[abc.length];
			for(int i=0;i<abc.length;i++)
				students[i]=abc[i];
					
			
			
		}
	}

	@Override
	public void addLast(Student student) {
		if(student==null)	
		throw new IllegalArgumentException("Error");
	else
	{   
		Student[] abc=new Student[students.length+1];
		
		for(int i=0;i<students.length;i++)
			abc[i]=students[i];
		abc[students.length]=student;
		students=new Student[abc.length];
		for(int i=0;i<abc.length;i++)
			students[i]=abc[i];			
	}
	}

	@Override
	public void add(Student student, int index) {
		if(student==null || index<0 || index>=students.length)
			throw new IllegalArgumentException("Error");
		else
		{   
			Student[] abc=new Student[students.length+1];
			for(int i=0;i<index;i++)
				abc[i]=students[i];
			abc[index]=student;
			for(int i=index+1;i<students.length+1;i++)
				abc[i]=students[i-1];
			students=new Student[abc.length];
			for(int i=0;i<abc.length;i++)
				students[i]=abc[i];
			
		}
	}

	@Override
	public void remove(int index) {
		if( index<0 || index>=students.length)
			throw new IllegalArgumentException("Error");
		else
		{   
			Student[] abc=new Student[students.length-1];
			for(int i=0;i<index;i++)
				abc[i]=students[i];
			
			for(int i=index;i<students.length-1;i++)
				abc[i]=students[i+1];
			students=new Student[abc.length];
			for(int i=0;i<abc.length;i++)
				students[i]=abc[i];
			
		}
	}

	@Override
	public void remove(Student student) {
		
	}

	@Override
	public void removeFromIndex(int index) {
		
	}

	@Override
	public void removeFromElement(Student student) {
		
	}

	@Override
	public void removeToIndex(int index) {
		
	}

	@Override
	public void removeToElement(Student student) {
		
	}

	@Override
	public void bubbleSort() {
		
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
