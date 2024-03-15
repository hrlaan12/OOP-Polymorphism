public class RightTriangle extends Triangle{
    private Double base;
    private Double height;

    public RightTriangle(String name, Double base, Double height){
        super();
        this.name = name;
        this.base = base;
        this.height = height;
        this.CalculateArea();
        super.side1 = base;
        super.side2 = height;
        super.side3 = this.getHyptenuse();
    }

    private double getHyptenuse() {
        return Math.sqrt((base * base) + (height * height));
    }
    public void CalculateArea(){
        super.area = (base * base) / 2;
    }
    public void getInfo(){
        System.out.print("RightTriangle"+name+"Info");
        System.out.print("Area:" + super.area);
        System.out.print("With Base:"+base);
        System.out.print("and Height"+height);
        System.out.print("and Hypotenuse"+this.getHyptenuse());
    }
    void print(){
        
    }
}
