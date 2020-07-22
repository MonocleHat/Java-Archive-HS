public class SchoolBag {

    String style;
    Binder b1, b2;
    final double weightEmpBag = 0;


    public SchoolBag(Binder b1, Binder b2){
        this.b1 = b1;
        this.b2 = b2;
    }

    public SchoolBag(String l1, String c1, int pg1, String l2, String c2, int pg2){
        this.b1.bindLabel = l1;
        this.b1.bindColor = c1;
        this.b1.bindSheetNum = pg1;
        this.b2.bindLabel = l2;
        this.b2.bindColor = c2;
        this.b2.bindSheetNum = pg2;
    }

    public String getStyle(){
        return style;
    }

    public void setStyle(String s){
        this.style = s;
    }

    public void addSheet(int num){
        this.b1.addSheets(num);
    }

    public void subSheet(int num){
        this.b1.subSheets(num);
    }

    public void avgWeight(Binder b){
        double avgWeight;
        avgWeight = b1.totalWeight() + b2.totalWeight();
        avgWeight = avgWeight / 2;
    }

    public double weightBag(SchoolBag s){
        double totWeight;
        totWeight = this.b1.totalWeight() + this.b2.totalWeight();
        return totWeight;
    }

    public String toString(){
        String s = "Style: " + this.style +"Binder 1: " + this.b1.toString() +"Binder 2: " + this.b2.toString();
        return s;
    }
}
