package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/vytrack-cucumber.html",
                "json:target/vytrack-cucumber.json",
                "rerun:target/vytrack-rerun.txt"

        },
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = true,
        tags = ""

)


public class CukesRunner {



}
