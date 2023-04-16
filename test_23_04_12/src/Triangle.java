public class Triangle {
    double sideA;
    double sideB;
    double sideC;
    public Triangle(double sideA,double sideB,double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }
    public double getArea() {
        double p = (sideA+sideB+sideC)/2;
        double area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
        return area;
    }
}
