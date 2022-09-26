package com.matches.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Match {
	public String getCompetition() {
		return competition;
	}

	public void setCompetition(String competition) {
		this.competition = competition;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getRound() {
		return round;
	}

	public void setRound(String round) {
		this.round = round;
	}

	public String getTeam1() {
		return team1;
	}

	public void setTeam1(String team1) {
		this.team1 = team1;
	}

	public String getTeam2() {
		return team2;
	}

	public void setTeam2(String team2) {
		this.team2 = team2;
	}

	public String getTeam1Goals() {
		return team1Goals;
	}

	public void setTeam1Goals(String team1Goals) {
		this.team1Goals = team1Goals;
	}

	public String getTeam2Goals() {
		return team2Goals;
	}

	public void setTeam2Goals(String team2Goals) {
		this.team2Goals = team2Goals;
	}

	@JsonProperty("competition")
	String competition;
	@JsonProperty("year")
	String year;
	@JsonProperty("round")
	String round;
	@JsonProperty("team1")
	String team1;
	@JsonProperty("team2")
	String team2;
	@JsonProperty("team1goals")
	String team1Goals;
	@JsonProperty("team2goals")
	String team2Goals;
}
