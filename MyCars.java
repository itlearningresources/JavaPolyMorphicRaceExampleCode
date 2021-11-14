
class Ferrari extends RaceCar {

    public Ferrari() {
         //    public VehicleCondition(float overall, boolean warmTires, boolean light)
        super(new VehicleCondition(          2.7F,            false,             false));

    }
    public float move() {
        if (getDistance() > 10.0) this.getCondition().setWarmTires(true);
        if (getDistance() > 240.0) this.getCondition().setLight(true);
        if (getDistance() > 540.0) this.getCondition().setLight(false);
        if (getDistance() > 550.0) this.getCondition().setWarmTires(false);
        if (getDistance() > 800.0) this.getCondition().setOverall(0.2F);
        if (getDistance() > 800.0) this.getCondition().setOverall(0.2F);
        return super.move();
    }
}
class Ford extends RaceCar {

    public Ford() {
         //    public VehicleCondition(float overall, boolean warmTires, boolean light)
        super(new VehicleCondition(          2.5F,            false,             false));

    }
}
class Chevy extends RaceCar {

    public Chevy() {
         //    public VehicleCondition(float overall, boolean warmTires, boolean light)
        super(new VehicleCondition(          2.6F,            false,             false));

    }
    public float move() {
        if (getDistance() > 20.0) this.getCondition().setWarmTires(true);
        if (getDistance() > 250.0) this.getCondition().setLight(true);
        return super.move();
    }
}

class Toyota extends RaceCar {

    public Toyota() {
         //    public VehicleCondition(float overall, boolean warmTires, boolean light)
        super(new VehicleCondition(          1.7F,            false,             true));

    }
}
