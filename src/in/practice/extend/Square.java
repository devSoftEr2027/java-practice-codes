package in.practice.extend;

public class Square extends Shap {

    private final double sideInCms;

    public Square(double sideInCms){
        this.sideInCms = sideInCms;
    }
    public double getSideInCms(){
        return sideInCms;
    }

    @Override
    public double calculateArea() {
        return Math.pow ( sideInCms, 2 );
    }
}
