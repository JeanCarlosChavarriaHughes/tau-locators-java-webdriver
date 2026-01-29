Locator Example Project
-----------------------

This project shows how to use Web element locators
in Java using Selenium WebDriver.

It is the example code for the "Using Locators for Testing" chapter
of the *Locating Web Elements* course from
[Test Automation University](https://testautomationu.applitools.com/).

# Requirements
- Java
- Maven
- Chrome browser
- ChromeDriver

# How to use?
From Command Line: 
`mvn -Dtest=tests.SimpleWebTest  test`
`mvn -Dtest=tests.PageObjectWebTest test`

# Report Generation
To generate a test report, use the following command:
`mvn surefire-report:report`

The report will be generated in the `target/reports/surefire.html` file.
You can open this file in a web browser to view the test results:
`open target/reports/surefire.html `


# Example:
```
% mvn -Dtest=tests.SimpleWebTest  test
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running tests.SimpleWebTest
Starting ChromeDriver 144.0.7559.59 (cd1d73dd77daadf4581dc29ca73482fc241e079d-refs/branch-heads/7559@{#3138}) on port 8795
Only local connections are allowed.
Please see https://chromedriver.chromium.org/security-considerations for suggestions on keeping ChromeDriver safe.
ChromeDriver was started successfully on port 8795.
Jan 29, 2026 4:39:04 PM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
DuckDuckGo - Protection. Privacy. Peace of mind.
Giant panda - Wikipedia
Giant panda | Facts, Habitat, Population, & Diet | Britannica
Giant panda - Smithsonian's National Zoo
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 6.074 s -- in tests.SimpleWebTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  8.595 s
[INFO] Finished at: 2026-01-29T16:39:08-06:00
[INFO] ------------------------------------------------------------------------
```