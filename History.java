import java.util.ArrayList;

public class History {
    private ArrayList<Float>  history = new ArrayList<Float>(100);

    public History() {
        history.add(Float.valueOf( (float) 0.0F) );
    }
    public void add(float f) {
        history.add(Float.valueOf( (float) f) );
    }

    public String toString() {
        final int COUNT = 8;
        String sz = "";
        String delim="";
        int n = history.size() > COUNT ?  history.size()-COUNT : 0;
        for (int i = n; i < this.history.size(); i++) {
            sz = sz + delim + String.format("%.2f", history.get(i));
            delim="->";
        }
        return sz;
    }  




}  
