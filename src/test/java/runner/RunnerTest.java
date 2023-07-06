package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@AddToChart", //identitas class cucumber
        features = {"classpath:features/"}, //packaging untuk class cucumber
        glue = {"classpath:step_definitions"},//penyimapanan methood akhir
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-report/cucumber.html",
                "junit:target/cucumber-report/cucumber.xml",
                "message:target/cucumber-report/cucumber.ndjson",
                "html:target/result.html",
                "me.jvt.cucumber.report.PrettyReports:report"}
)

public class RunnerTest {




}
