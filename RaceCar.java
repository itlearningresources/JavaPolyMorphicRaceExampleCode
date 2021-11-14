import java.util.*;

public class RaceCar extends Vehicle {

    private float     distance = 0F;
    private float     lastmove = 0F;
    protected History history = new History();
    private static float frand(float min, float max) { return  min + (new Random()).nextFloat() * (max - min);}

    public RaceCar(VehicleCondition vc) {
        super(vc);
    }
    public RaceCar(float overall, boolean warmTires, boolean light) {
        super(overall, warmTires, light);
    }
    public float move() {
        float f = this.getCondition().getOverall() * frand(0.5F, 1.5F);

        if (this.getCondition().getWarmTires()) 
            f = f * 1.33F;
        else
            f = f * 0.66F;

        if (this.getCondition().getLight()) 
            f = f * 1.25F;
        else
            f = f * 0.75F;

        this.lastmove = f;
        this.incDistance(this.lastmove);
        this.history.add(this.distance);
        return this.lastmove;
    }
    public float getDistance() {
        return this.distance;
    }
    public void setDistance(float d) {
        this.distance = d;
    }
    public void incDistance(float d) {
        this.distance = this.distance + d;
    }

    public  String toString() {
        return String.format("%-18s %10.2f %10.2f", super.toString(), this.lastmove, this.distance);
    }
    public String toStringHeader() {
        return String.format("%-18s %10s %10s  Lead  History", "RaceCar","Last Move", "Distance");
    }

}
