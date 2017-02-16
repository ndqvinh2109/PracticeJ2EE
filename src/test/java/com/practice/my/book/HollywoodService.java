package com.practice.my.book;

import java.util.ArrayList;
import java.util.List;

public class HollywoodService {
	
	public static List<Agent> getFriendlyAgents() {
		// if change constructor of SpreadsheetAgentFinder this code will be broken
		// There is no easy way to test getFriendlyAgents() which is dependent on SpreadsheetAgentFinder
		// Can not mock finder
		AgentFinder finder = new SpreadsheetAgentFinder();
		List<Agent> agents = finder.findAllAgents();
		List<Agent> friendlyAgents = filterAgents(agents, "Java Developers");
		return friendlyAgents;
	}

	public static List<Agent> filterAgents(List<Agent> agents, String agentType) {
		List<Agent> filteredAgents = new ArrayList<>();
		for (Agent agent : agents) {
			if (agent.getType().equals("Java Developers")) {
				filteredAgents.add(agent);
			}
		}
		return filteredAgents;
	}
	
}
