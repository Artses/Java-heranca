package entities;

public class OutsourcedEmployee extends Employee{

    private double addcionalCharge;

    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(String name, int hours, Double valuePerHour, double addcionalCharge) {
        super(name, hours, valuePerHour);
        this.addcionalCharge = addcionalCharge;
    }

    public double getAddcionalCharge() {
        return addcionalCharge;
    }

    public void setAddcionalCharge(double addcionalCharge) {
        this.addcionalCharge = addcionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + addcionalCharge * 1.1;
    }
}
