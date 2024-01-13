class Student{
    String name;
    int rollNo;
    int[] marks;

    Student(){
        System.out.println("Welcome to default constructor:");
    };
    Student(String name, int rollNo, int[] marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = new int[5];
    }

    public void studentInfo(){
        System.out.println("Student Name:"+name+" Student Roll-No:"+rollNo);
    }

    public int totalMarks(int[] marks){
        int total=0;
        for(int i=0; i<marks.length; i++){
            total = total+marks[i];
        }
        return total;
        // System.out.println(name+" obtained overall "+total+" marks in five subjects.");
    }
    public int averageMarks(int[] marks){
        int avg=0;
        int total=0;
        for(int i=0; i<marks.length; i++){
            total = total+marks[i];
        }
        avg =(int) total/5;

        return avg;
    }
}