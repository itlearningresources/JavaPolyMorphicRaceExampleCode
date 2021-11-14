public abstract class Vehicle implements Movable {
    private VehicleCondition condition = null;

    protected Vehicle(VehicleCondition vc) {
        condition = vc;
    }
    protected Vehicle(float overall, boolean warmTires, boolean light) {
        condition = new VehicleCondition(overall, warmTires, light);
    }

    protected boolean getWarmTires() {
        return condition.getWarmTires();
    }
    protected VehicleCondition getCondition() {
        return condition;
    }

    public abstract float move();


}
