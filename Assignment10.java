public class Assignment10 {
    private double length;
    private double width;
    public Assignment10(double l, double w){
        length=l;
        width=w;
    }
    public Assignment10(){

    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double w){
        width=w;
    }
    public void setLength(double l){
        length=l;
    }
    public static void main(String[] args) {
        Assignment10 a = new Assignment10(10, 5);
        System.out.println("");
        System.out.println("Length: "+ a.getLength());
        System.out.println("Width :"+a.getWidth());
        System.out.println("Area :"+a.area());
        System.out.println("Perimeter :"+a.perimeter());
        System.out.println("");
        Assignment10 b = new  Assignment10();
        b.setLength(10);
        b.setWidth(10);
        System.out.println(b.area());
        System.out.println(b.perimeter());



    }
}
