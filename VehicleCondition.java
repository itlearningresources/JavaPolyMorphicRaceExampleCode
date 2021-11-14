import  java.util.*;
import  java.io.*;
//  **************************************************************************
//  **  VehicleCondition
//  **************************************************************************

public class VehicleCondition {

    //---------------------------------------------+
    // Instance Variables (all private)
    //---------------------------------------------+
    private float overall = 1.0F;
    private boolean warmTires = false;
    private boolean light = false;

    //---------------------------------------------+
    // No Argument Constructor
    //---------------------------------------------+
    public VehicleCondition() {
        super();
    }

    //---------------------------------------------+
    // Argument Constructor
    //---------------------------------------------+
    public VehicleCondition(float overall, boolean warmTires, boolean light) {
        super();
        this.overall = overall;
        this.warmTires = warmTires;
        this.light = light;
    }

    //---------------------------------------------+
    // Getters and Setters
    //---------------------------------------------+
    public float getOverall() {
        return this.overall;
    }
    public void setOverall(float overall) {
        this.overall = overall;
    }
    protected boolean getWarmTires() {
        return this.warmTires;
    }
    public void setWarmTires(boolean warmTires) {
        this.warmTires = warmTires;
    }
    public boolean getLight() {
        return this.light;
    }
    public void setLight(boolean light) {
        this.light = light;
    }

    //---------------------------------------------+
    // toString() Method
    //---------------------------------------------+
    public String toString() {
        final String sp = ", ";
        return "overall: " + this.overall +sp+ "warmTires: " + this.warmTires +sp+ "light: " + this.light;
    }

}
