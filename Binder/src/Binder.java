//The Binder class Represents a school binder that contains notes, and is placed into a schoolbag object
public class Binder {
    String bindLabel;
    String bindColor;
    int bindSheetNum;

    final double PAPERWEIGHT = 0.5;
    final double EMPBIND = 0.3;

    public Binder(){
        this.bindLabel = " ";
        this.bindColor = " ";
        this.bindSheetNum = 0;
    }

    public Binder (String label, String Color, int pgs){
        this.bindLabel = label;
        this.bindColor = Color;
        this.bindSheetNum = pgs;
    }

    public String getBindLabel(){
        return bindLabel;
    }

    public String getBindColor(){
        return bindColor;
    }

    public int getBindSheetNum(){
        return bindSheetNum;
    }

    public void setBindLabel(String label){
        this.bindLabel = label;
    }
    public void setBindColor(String color){
        this.bindColor = color;
    }
    public void setBindSheetNum(int pg){
        this.bindSheetNum = pg;
    }

    public void addSheets(int a){
        this.bindSheetNum = this.bindSheetNum + a;
    }

    public void subSheets(int s){
        this.bindSheetNum = this.bindSheetNum - s;
    }

    public double totalWeight(){
        double wgt;
        wgt = this.bindSheetNum * PAPERWEIGHT;
        wgt = wgt + EMPBIND;
        return wgt;
    }

    public boolean bindCompare (Binder c){
        double b1w;
        double b2w;
        b1w = this.bindSheetNum * PAPERWEIGHT;
        b1w = b1w + EMPBIND;
        b2w = c.bindSheetNum * PAPERWEIGHT;
        b2w = b2w + EMPBIND;
        if (b1w>b2w){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        String s = "Label: " + this.bindLabel + "\n" + "Color: " + this.bindColor + "\n" + "No Pages: " + this.bindSheetNum + "\n";
        return s;
    }

}
