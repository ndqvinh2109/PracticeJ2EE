package com.practice.my.book;

import java.util.ArrayList;
import java.util.List;

public class HollywoodServiceWithFactory {
	public static List<Agent> getFriendlyAgents(String agentFinder) {
		AgentFinderFactory factory = AgentFinderFactory.getInstance();
		AgentFinder finder = factory.getAgentFinder(agentFinder);		
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
