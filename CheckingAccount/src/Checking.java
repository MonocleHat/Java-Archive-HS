public class Checking {
    private int acctNum;
    private double curBalance;
    private String acctHolder;

    public Checking(){
        this.acctNum = 0;
        this.curBalance = 0;
        this.acctHolder = "";
    }
    public Checking(int N, int B, String H){
        this.acctNum = N;
        this.acctHolder = H;
        this.curBalance = B;
    }
    //Get methods
    public int getAcctNum(){
        return acctNum;
    }
    public double getCurBalance(){
        return curBalance;
    }
    public String getAcctHolder(){
        return acctHolder;
    }
    //Setter methods
    public void setAcctNum(int acctNum){
        this.acctNum = acctNum;
    }
    public void setCurBalance(double curBalance){
        this.curBalance = curBalance;
    }
    public void setAcctHolder(String acctHolder){
        this.acctHolder = acctHolder;
    }

    //deposit
    public void deposit (double dollars){
        curBalance = curBalance + dollars;
    }
    public double processCheck (double check){
        double chck = check;
        if (curBalance < 1000){
            curBalance = curBalance - 0.15;
            curBalance = curBalance - chck;
        }else{
            curBalance = curBalance - chck;
        }
        return curBalance;
    }

    //overdraft
    public boolean acctOverdraft (Checking C){
        double D = 0;
        if (curBalance<0){
            return true;
        }
        return false;

    }
    //compareTo
    public Checking compareTo (Checking other){
        if (this.curBalance >= other.curBalance){
            return other;
        }else{
            return this;
        }
    }
    //equals
    public boolean equals(Checking other){
        return this.acctNum == other.acctNum;
    }
    //toString
    public String toStr(){
        String s = "Account Number: " +this.acctNum +"Name of account holder: " +this.acctHolder +"Current Balance: " +this.curBalance;
        return s;
    }
}
