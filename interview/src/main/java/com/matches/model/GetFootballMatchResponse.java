package com.matches.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetFootballMatchResponse {
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getMatchesPerPage() {
		return matchesPerPage;
	}
	public void setMatchesPerPage(int matchesPerPage) {
		this.matchesPerPage = matchesPerPage;
	}
	public int getTotalMatches() {
		return totalMatches;
	}
	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public List<Match> getMatches() {
		return matches;
	}
	public void setMatches(List<Match> matches) {
		this.matches = matches;
	}
	
	@JsonProperty("page")
	int page;
	@JsonProperty("per_page")
	int matchesPerPage;
	@JsonProperty("total")
	int totalMatches;
	@JsonProperty("total_pages")
	int totalPages;
	@JsonProperty("data")
	List<Match> matches;
}
