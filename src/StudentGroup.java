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

	
	public Student[] getStudents() {
		return students;
		
	}

	
	public void setStudents(Student[] students) {
		if(students==null)
		{
			
			    throw new IllegalArgumentException();
			
		}
	}

	
	public Student getStudent(int index) {
		if(index<0 || index>=students.length)
		{
			throw new IllegalArgumentException();
		}
		return null;
	}

	
	public void setStudent(Student student, int index) {
		if(student==null || index<0 || index>=students.length)
			throw new IllegalArgumentException();
		else
		{
			students[index]=student;
		}
	}

	
	public void addFirst(Student student) {
		if(student==null)
			throw new IllegalArgumentException();
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

	
	public void addLast(Student student) {
		if(student==null)
		throw new IllegalArgumentException();
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

	
	public void add(Student student, int index) {
		if(student==null || index<0 || index>=students.length)
			throw new IllegalArgumentException();
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

	
	public void remove(int index) {
		if( index<0 || index>=students.length)
			throw new IllegalArgumentException();
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

	
	public void remove(Student student) {
		Student x; boolean flag=false; int j;
		if(student==null)
			throw new IllegalArgumentException();
		else
		{   
			for(int i=0;i<students.length;i++)
			{
				if(students[i]==student)
				{
					flag=true;
					j=i;
					break;
				}
			}
			if(flag==true)
			{int index=j;
				Student[] abc=new Student[students.length-1];
				for(int i=0;i<index;i++)
					abc[i]=students[i];
				
				for(int i=index;i<students.length-1;i++)
					abc[i]=students[i+1];
				students=new Student[abc.length];
				for(int i=0;i<abc.length;i++)
					students[i]=abc[i];
			}
			else
			{
				throw new IllegalArgumentException("Student not exist");
			}
		}
	}

	
	public void removeFromIndex(int index) {
		if( index<0 || index>=students.length)
			throw new IllegalArgumentException();
		else
		{   
			Student[] abc=Student[index+1];
			for(int i=0;i<=index;i++)
				abc[i]=students[i];
			students=new Student[abc.length];
			for(int i=0;i<abc.length;i++)
				students[i]=abc[i];
			
		}
	}

	
	public void removeFromElement(Student student) {
		if(student==null)
			throw new IllegalArgumentException();
		else
		{   
			Student[] abc=new Student[students.length+1];
			int j;
			for(int i=0;i<students.length;i++)
			{
				if(students[i]==student)
				{
					j=i;
					break;
				}
			}
			Student[] abc=new Student[j+1];
			for(int i=0;i<=j;i++)
				students[i]=abc[i];			
		}
	}

	
	public void removeToIndex(int index) {
		Student[] abc=new Student[index];
		for(int i=0;i<index;i++)
		{
			abc[i]=students[i];
		}
		students=new Student[abc.length];
		for(int i=0;i<abc.length;i++)
			student[i]=abc[i];
	}

	
	public void removeToElement(Student student) {
		int j;
		for(int i=0;i<students.length;i++)
		{
			if(students[i]==student)
			{
				j=i;
				break;
			}
		}
		Student[] abc=new Student[j];
		for(int i=0;i<j;i++)
			abc[i]=student[i];
		Student[] students=new Student[abc.length];
		for(int i=0;i<abc.length;i++)
			students[i]=abc[i];
	}

	
	public void bubbleSort() {
		int c,d,n=students.length;
		Student swap;
		for (c = 0 ; c < ( n - 1 ); c++)
		  {
		    for (d = 0 ; d < n - c - 1; d++)
		    {
		      if (students[d] > students[d+1]) /* For decreasing order use < */
		      {
		        swap       = students[d];
		        students[d]   = students[d+1];
		        students[d+1] = swap;
		      }
		    }
		  }
	}

	
	public Student[] getByBirthDate(Date date) {
		int count=0,x=-1;
		for(int i=0;i<students.length;i++)
			if(students[i].birthDate<=date)
				count++;
		Student[] abc=new Student[count];
		for(int i=0;i<students.length;i++)
		{
			if(students[i].birthDate<=date)
				abc[x++]=students[i];
		}
		students=new Student[abc.length];
		for(int i=0;i<abc.length;i++)
		{
			students[i]=abc[i];
		}
		return null;
	}

	
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}