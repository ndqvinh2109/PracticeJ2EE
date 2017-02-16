package com.practice.my.book;

public class AgentFinderFactory {

	private AgentFinderFactory() {};
	
	public static AgentFinderFactory getInstance() {
		return new AgentFinderFactory();
	}
	
	public AgentFinder getAgentFinder(String agentFinderType) {
		return new SpreadsheetAgentFinder();
	}
}
