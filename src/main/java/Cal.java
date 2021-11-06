public class Cal {

    private int num1;
    private int num2;

    public Cal(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }


    @Override
    public String toString() {
        return "Cal{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public  void add(int num1, int num2){
        int result = num1 + num2;
        System.out.println(result);
    }
    public  void multiply(int num1, int num2){
        int result = num1 * num2;
        System.out.println(result);
    }
    public  void subtract(int num1, int num2){
        int result = num1 - num2;
        System.out.println(result);
    }
    public  void divide(int num1, int num2){
        int result = num1 / num2;
        System.out.println(result);
    }
}
