package com.firtsproject.basics;


abstract class Tournament{
	
	
	abstract void namOfTournament();
	
	abstract void prizeMoney();
	
}

interface Team{
	
	int players=15;
	void nationality();
	void nameOfTeam();
}

interface Venue{
	
	void nameOfVenue();
	void locationOfVenue();

}

public class CricketMatch extends Tournament {
	public static void main(String[] args) {
		
		CricketMatch obj=new CricketMatch();
		}
	
	void namOfTournament(){
		
	}
	
void prizeMoney(){
	
}
}






