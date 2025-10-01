# Automation-Practiced-Repo

A hands-on collection of Selenium WebDriver practice scripts and testing artifacts I built while learning from YouTube tutorials and applying them to real browser automation scenarios. This repository showcases both my manual testing foundation and my growing automation expertise.

## Why this repo
- Learn-by-doing: I followed YouTube content and immediately implemented the concepts.
- Curated practice: Each directory represents a focused topic (alerts, frames, waits, actions, windows, uploads, JavaScript, tables, shadow DOM, SVG, etc.).
- Career-ready skills: Demonstrates end-to-end testing skills from manual test design to automation execution.

## Learning path (YouTube-driven)
I learned topics from multiple YouTube channels focused on QA/Automation and reproduced the concepts here with my own implementations, experiments, and small improvements:
- Core Selenium WebDriver setup and navigation
- Smart waits and synchronization
- Advanced user interactions with Actions API
- Windows/tabs/frames/alerts handling
- Data-driven testing with Excel and properties
- JavaScript execution and scrolling
- File upload, screenshots, and utilities
- Handling tables, pagination, shadow DOM, SVG elements

Note: I intentionally re-implemented examples to deepen understanding rather than copy-paste, adding validations, assertions ideas, and edge-case handling where appropriate.

## Tech stack
- Language: Java
- Automation: Selenium WebDriver
- Build/Project: IntelliJ IDEA project layout
- OS: Windows

## Repository structure (high-level)
- `day1to3/`: Driver setup, navigation basics, implicit/explicit waits
- `day2to6/`: Window handles, checkboxes, navigation, switching contexts
- `day5to7/`: Alerts and frames
- `day8to10/`: Dropdowns, Bootstrap menus, Google search suggestions
- `day11to12/`: Web tables and pagination handling
- `day13to15/`: Date pickers and advanced Actions (double/right click, drag & drop)
- `day16to20/`: Keyboard actions, sliders, window management
- `day21to25/`: JavaScript executor, scrolling, uploads, zooming
- `day27to30/`: Screenshots (elements/tables/full) and artifacts
- `day31to35/`: Browser modes (headless/incognito), extension handling, SSL
- `day36to39/`: Broken links, SVG elements, Shadow DOM
- `day40/`: Excel utilities (read/write/update)
- `day41/`: Config-driven utilities and properties handling

## Skills demonstrated

### Manual testing
- Test case design (happy paths, edge cases, negative tests)
- Equivalence partitioning and boundary value analysis
- Exploratory testing mindset for UI flows
- Defect reporting with clear reproduction steps
- Test data management (properties, Excel)

### Automation testing
- Selenium WebDriver API proficiency (locators, waits, navigation)
- Robust synchronization (ExplicitWaits, JS-ready checks)
- Advanced interactions (Actions: hover, drag-drop, context/double-click)
- Multi-window, frames/iframes, alerts handling
- File operations: uploads and screenshots for evidence
- Data-driven techniques using Excel and `config.properties`
- Executing JavaScript for tricky scenarios (scroll, zoom, DOM ops)
- Working with complex DOMs: Shadow DOM, SVG, dynamic tables
- Reliability practices: stable selectors, fallback strategies

## How to run locally
Prerequisites:
- JDK 8+ (or recommended LTS)
- Compatible WebDriver (Chromedriver/Geckodriver) on PATH
- IntelliJ IDEA (or any Java IDE)

Steps:
1. Clone the repo
2. Open the project in your IDE
3. Ensure browser driver is available on PATH
4. Run individual classes under `src/test/java/...` by right-click → Run

Tip: Many classes are independent demos. Start with earlier folders (`day1to3`) and move forward.

## Highlights by topic
- Tables & pagination: iterate pages, collect rows, assert cell values
- Date pickers: stable month/year navigation and day selection
- Actions API: accurate drag-and-drop, context/double-click exercises
- Windows/tabs: switch and validate titles/URLs and content
- JavaScript executor: scroll into view, zoom, click via JS when needed
- Uploads & screenshots: evidence collection for reports
- Shadow DOM/SVG: correct element access strategies
- Excel utilities: read/write datasets to drive tests

## Next steps
- Add assertions and reporting (TestNG/JUnit + Allure/Extent Reports)
- Introduce Page Object Model (POM) and reusable utilities
- CI runner (GitHub Actions) and environment matrix

## Contact
If you’d like a walkthrough, suggestions, or to collaborate, feel free to reach out via GitHub issues on this repo.

---
This repository is the result of a consistent YouTube-first learning approach followed by implementation and refinement. It reflects both my manual testing fundamentals and practical automation skills in Java + Selenium.