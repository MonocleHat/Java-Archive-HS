import java.util.Scanner;
import java.lang.Math;
/*
This one was just for counting "election results", i cant remember most of these assignment requirements
Though im beginning to remember a theme. I think the first assignment was for strings, this one was for math.
so get ready for a lot of weird equations everywhere.

Errata: N/A

Original Date: 19/10/2015
Author: MonocleHat
 */
public class ElectionResults {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Variables for Mulcair
        double MulON;
        double MulNFL;
        double MulQB;
        //Variables for Trudeau
        double TruON;
        double TruNFL;
        double TruQB;
        //Variables for Harper
        double HarON;
        double HarNFL;
        double HarQB;
        //Totals for all candidates
        double MulcairTOT;
        double TrudeauTOT;
        double HarperTOT;
        int MulcairTOTINT;
        int TrudeauTOTINT;
        int HarperTOTINT;
        //Percentages for all candidates
        double MPercent;
        double HPercent;
        double TPercent;
        //Variables for totals
        double TotalVotes;
        int TotalVotesINT;
        double TotalPercent;

        //PROGRAM START
        Scanner VotesCounted = new Scanner (System.in); //Creating Scanner which will ask for user input across entire program.

        //Asking user for votes in ONTARIO
        System.out.format("%40s%n", "Election results for ONTARIO");
        System.out.format("%10s", "Mulcair: ");
        MulON= VotesCounted.nextDouble();
        System.out.format("%10s", "Trudeau: ");
        TruON = VotesCounted.nextDouble();
        System.out.format("%10s", "Harper: ");
        HarON = VotesCounted.nextDouble();

        //Asking user for votes in NEWFOUNDLAND
        System.out.format("%40s%n", "Election results for NEWFOUNDLAND");
        System.out.format("%10s", "Mulcair: ");
        MulNFL= VotesCounted.nextDouble();
        System.out.format("%10s", "Trudeau: ");
        TruNFL = VotesCounted.nextDouble();
        System.out.format("%10s", "Harper: ");
        HarNFL = VotesCounted.nextDouble();

        //Asking user for votes in QUEBEC
        System.out.format("%40s%n", "Election results for QUEBEC");
        System.out.format("%10s", "Mulcair: ");
        MulQB= VotesCounted.nextDouble();
        System.out.format("%10s", "Trudeau: ");
        TruQB = VotesCounted.nextDouble();
        System.out.format("%10s", "Harper: ");
        HarQB = VotesCounted.nextDouble();

        //Start of final calculations

        //Adding up total votes for each candidate
        MulcairTOT= MulON + MulNFL + MulQB;
        TrudeauTOT = TruON + TruNFL + TruQB;
        HarperTOT = HarON+HarNFL+HarQB;

        //Converting the variables holding the total votes to INTs via type casting
        MulcairTOTINT = (int)MulcairTOT;
        TrudeauTOTINT = (int)TrudeauTOT;
        HarperTOTINT = (int) HarperTOT;

        //Calculations of the total amounts of Votes, and the percentage of said Votes
        TotalVotes = MulcairTOT + TrudeauTOT + HarperTOT;
        TotalPercent = TotalVotes / 100;
        TotalVotesINT = (int) TotalVotes; //Converting the TotalVotes variable into an INT variable via typecasting

        //Percentage calculations for candidates
        MPercent = MulcairTOT/TotalPercent;
        TPercent = TrudeauTOT / TotalPercent;
        HPercent = HarperTOT / TotalPercent;
        //Rounding off votes
        MPercent= Math.round((MPercent * 100.0) ) /100.0;
        TPercent= Math.round((TPercent * 100.0) ) /100.0;
        HPercent= Math.round((HPercent * 100.0) ) /100.0;

        //Displaying the total results for each candidate
        System.out.format("%10s %10s %15s%n", "Candidate", "Votes", "Percentage");
        System.out.format("%10s %10s %15s%n", "Mulcair", +MulcairTOTINT, +MPercent);
        System.out.format("%10s %10s %15s%n", "Trudeau", +TrudeauTOTINT, +TPercent);
        System.out.format("%10s %10s %15s%n", "Harper", +HarperTOTINT, +HPercent);
        System.out.format("%10s %10s%n", "Total", +TotalVotesINT);
        VotesCounted.close(); //scanner closed
        //END OF PROGRAM
    }
}
