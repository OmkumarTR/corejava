package com.chainsys.classesmethods;
/**
 * Date - 31-03-2022
 * @author omku3118
 *
 */
public class TtwentyScoreBoard {
	
	// CurrentScore
	private int currentScore;
	
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore += currentScore;
	}
	// Run rate
	private int runRate;
	public int getRunRate() {
		return runRate;
	}
	public void setRunRate(int runRate) {
		this.runRate = runRate;
	}
	// Target
	private int target;
	public final int getTarget()
	{
		return target;
	}
	
	public final static int maxOvers=20;
	private int completed_overs;
	public TtwentyScoreBoard(int targetscore)
	{
		this.target=targetscore;
	}
	// Current Run Rate
	public int getCurrentRunRate()
	{
		return currentScore/completed_overs;
	}
	
	// Required Run Rate
	public int setRequiredRunRate()
	{
		int runstoscore=(target-currentScore);
		int oversremaining= (maxOvers - completed_overs);
		return runstoscore/oversremaining;
	}
	// Completed Overs
	public int getCompleted_overs() {
		return completed_overs;
	}
	public void setCompleted_overs(int completed_overs) {
		this.completed_overs = completed_overs;
	}
}
