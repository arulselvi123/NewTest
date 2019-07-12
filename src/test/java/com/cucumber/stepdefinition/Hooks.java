package com.cucumber.stepdefinition;

import java.io.File;
import java.io.IOException;

import com.baseclass.Baseclass;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public static void beforeHook() {
		System.out.println("Before Hook");
	}

	@After
	public static void afterHook(Scenario scenario) throws Exception {
		System.out.println("After Hook");
		if (scenario.isFailed()) {
			File takeScreenShotonthePage = Baseclass.takeScreenShotonthePage(scenario.getName());
			Reporter.addScreenCaptureFromPath(takeScreenShotonthePage.getAbsolutePath());
		}
	}

}
