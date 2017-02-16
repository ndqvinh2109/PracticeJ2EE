package com.practice.my.shopping.rest;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.maven.Maven;
import org.jboss.shrinkwrap.resolver.api.maven.PomEquippedResolveStage;

import com.practice.my.shopping.JAXRSConfiguration;

public class DeploymentFactory {
	
	public static WebArchive createFullDeployment() {
		final PomEquippedResolveStage Pom = Maven.resolver().loadPomFromFile("pom.xml");
		
		WebArchive war = ShrinkWrap.create(WebArchive.class, "test.war")
				.addAsLibraries(Pom.resolve("com.fasterxml.jackson.datatype:jackson-datatype-jsr310").withTransitivity().asFile())
				.addAsLibraries(Pom.resolve("com.google.code.gson:gson").withTransitivity().asFile())
				.addAsLibraries(Pom.resolve("org.apache.httpcomponents:httpclient").withTransitivity().asFile())
				.addPackages(true, JAXRSConfiguration.class.getPackage())
				.addAsResource("test-persistence.xml", "META-INF/persistence.xml")
				.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");

		return war;
	}
}
