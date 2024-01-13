class Calculator{
    int number1;
    int number2;
    Calculator(){
        System.out.println(number1+" "+number2);
    }
    Calculator(int a, int b){
        this.number1 = a;
        this.number2 = b;
    }
    //  add two numbers with different parameters
    public void addition(int a, int b){
        System.out.println(a+b);
    }
    public void addition(double a, double b){
        System.out.println(a+b);
    }
    public void addition(double a, int b){
        System.out.println(a+b);
    }
    public void addition(int a, double b){
        System.out.println(a+b);
    }
    
    
    // Subtract two numbers with different parameters
    public void subtraction(int a, int b){
        System.out.println(a-b);
    }
    public void subtraction(double a, double b){
        System.out.println(a-b);
    }
    public void subtraction(int a, double b){
        System.out.println(a-b);
    }
    public void subtraction(double a, int b){
        System.out.println(a-b);
    }

    // multiplication of two number with different parameters
    public void multiply(int a, int b){
        System.out.println(a*b);
    }
    public void multiply(double a, double b){
        System.out.println(a*b);
    }

    public void multiply(int a, double b){
        System.out.println(a*b);
    }
    public void multiply(double a, int b){
        System.out.println(a*b);
    }

    // Divide two numbers with different parameters
    public void divide(double a, double b){
        if(b==0){
            return;
        }
        else{
            System.out.println(a/b);
        }
    }
}