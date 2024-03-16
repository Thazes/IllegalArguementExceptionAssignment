class Student {


  public void assignGrade(String name,int grade){
        try {
            if(grade>=0&&grade<=100){
                System.out.println("Student "+name+" grade of "+grade+" has been entered successfully" );
            }else {
                throw new IllegalArgumentException("Grade must be greater than 0 and less than 100");
            }
        }catch (IllegalArgumentException e){
            System.out.println("Error during grading: " + e.getMessage());
        }finally {
            System.out.println("Grading completed.");
        }
  }

    public static void main(String[] args) {

      Student student=new Student();
      student.assignGrade("Humphrey",190);
    }
}