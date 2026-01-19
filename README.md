# Demo: Trip Cost Automation

This Maven project contains a small Selenium-based skeleton to automate a website that calculates total trip cost.

What I added
- `src/main/java/com/example/driver/DriverFactory.java` — creates ChromeDriver via WebDriverManager.
- `src/main/java/com/example/config/ConfigReader.java` — reads `config.properties` from test resources.
- `src/main/java/com/example/pages/HomePage.java` — page object (placeholder selectors) for entering trip data.
- `src/main/java/com/example/pages/ResultsPage.java` — page object to read total cost.
- `src/test/java/com/example/BaseTest.java` — JUnit base test class that initializes and quits WebDriver.
- `src/test/java/com/example/CalculateTripCostTest.java` — sample test showing the intended flow.
- `src/test/resources/config.properties` — config file (set `app.url` to target site).

How to run

1. Set the `app.url` property in `src/test/resources/config.properties` to the trip calculator URL.
2. From the `demo` folder run the tests using Maven (PowerShell):

```powershell
cd demo
mvn test
```

Notes
- Selectors in the page objects are placeholders. Inspect the real site and replace `By` locators in `HomePage` and `ResultsPage`.
- To run headed (non-headless), set `headless=false` in `config.properties`.
