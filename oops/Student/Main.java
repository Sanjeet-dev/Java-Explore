class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Student class");
        int[] marks = {85,45,33,92,55};
        Student student1 = new Student("Sanjeet Rai",45,marks);
        student1.studentInfo();
        System.out.println("Total marks obtained:"+student1.totalMarks(marks));
        System.out.println("Average marks obtained:"+student1.averageMarks(marks));


        
    }
}