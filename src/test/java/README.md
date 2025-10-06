# Selenium WebDriver Automation Learning Repository

A comprehensive collection of Selenium WebDriver practice scripts and testing artifacts built through hands-on learning from YouTube tutorials and real-world browser automation scenarios. This repository demonstrates both manual testing fundamentals and advanced automation expertise with practical implementations.

## 🎯 Why This Repository
- **Learn-by-Doing Approach**: Following YouTube content with immediate implementation and experimentation
- **Curated Learning Path**: Each directory represents a focused Selenium topic with progressive complexity
- **Career-Ready Skills**: Demonstrates end-to-end testing capabilities from manual test design to advanced automation
- **Real-World Applications**: Practical examples that can be adapted for actual testing scenarios

## 🚀 Learning Journey (YouTube-Driven)
This repository represents a structured learning path covering essential Selenium WebDriver concepts:

### Foundation (Days 1-10)
- **Core WebDriver Setup**: Browser initialization, navigation, and basic interactions
- **Synchronization**: Implicit and explicit waits for reliable test execution
- **Element Interaction**: Locators, clicks, text input, and form handling
- **Advanced Navigation**: Window management, alerts, frames, and context switching
- **UI Components**: Dropdowns, checkboxes, and dynamic elements

### Intermediate (Days 11-25)
- **Data Handling**: Web tables, pagination, and dynamic content processing
- **User Interactions**: Date pickers, drag-and-drop, double-click, right-click
- **Advanced Actions**: Keyboard events, sliders, and complex user gestures
- **JavaScript Integration**: Executing JavaScript, scrolling, and viewport control
- **File Operations**: Uploads, downloads, and file handling

### Advanced (Days 27-47)
- **Evidence Collection**: Screenshots, reports, and test artifacts
- **Browser Management**: Headless mode, incognito, extensions, SSL handling
- **Complex DOM**: Shadow DOM, SVG elements, and modern web technologies
- **Data-Driven Testing**: Excel integration, properties files, and external data
- **Test Framework**: TestNG implementation, assertions, and reporting
- **Design Patterns**: Page Object Model and maintainable test architecture

## 🛠️ Tech Stack
- **Language**: Java 8+
- **Automation Framework**: Selenium WebDriver 4.x
- **Testing Framework**: TestNG
- **Build Tool**: Maven
- **IDE**: IntelliJ IDEA
- **Reporting**: Extent Reports
- **Data Handling**: Apache POI (Excel)
- **OS**: Windows 10/11

## 📁 Repository Structure

### Foundation Level
- **`day1to3/`**: WebDriver basics, navigation, and synchronization
- **`day2to6/`**: Window handles, checkboxes, and context switching
- **`day5to7/`**: Alerts and frames handling
- **`day8to10/`**: Dropdowns, Bootstrap menus, and autosuggest

### Intermediate Level
- **`day11to12/`**: Web tables and pagination
- **`day13to15/`**: Date pickers and advanced Actions API
- **`day16to20/`**: Keyboard actions, sliders, and window management
- **`day21to25/`**: JavaScript executor, scrolling, uploads, and zoom

### Advanced Level
- **`day27to30/`**: Screenshots and evidence collection
- **`day31to35/`**: Browser modes, extensions, and SSL handling
- **`day36to39/`**: Broken links, Shadow DOM, and SVG elements
- **`day40/`**: Excel utilities and data-driven testing
- **`day41/`**: Configuration management and utilities

### Test Framework Level
- **`day42/`**: TestNG basics and test case structure
- **`day43/`**: Assertions and TestNG annotations
- **`day44/`**: TestNG suites, dependencies, and test organization
- **`day45/`**: Parameters and data providers
- **`day46/`**: TestNG listeners and Extent Reports
- **`day47/`**: Page Object Model implementation

## 📚 Detailed Learning Notes
Each package contains comprehensive `Notes.txt` with detailed explanations, examples, and best practices:

### Foundation Level Notes
- [day1to3/Notes.txt](day1to3/Notes.txt) - WebDriver basics, navigation, and synchronization
- [day2to6/Notes.txt](day2to6/Notes.txt) - Window handles, checkboxes, and context switching
- [day5to7/Notes.txt](day5to7/Notes.txt) - Alerts and frames handling
- [day8to10/Notes.txt](day8to10/Notes.txt) - Dropdowns, Bootstrap menus, and autosuggest

### Intermediate Level Notes
- [day11to12/Notes.txt](day11to12/Notes.txt) - Web tables and pagination
- [day13to15/Notes.txt](day13to15/Notes.txt) - Date pickers and advanced Actions API
- [day16to20/Notes.txt](day16to20/Notes.txt) - Keyboard actions, sliders, and window management
- [day21to25/Notes.txt](day21to25/Notes.txt) - JavaScript executor, scrolling, uploads, and zoom

### Advanced Level Notes
- [day27to30/Notes.txt](day27to30/Notes.txt) - Screenshots and evidence collection
- [day31to35/Notes.txt](day31to35/Notes.txt) - Browser modes, extensions, and SSL handling
- [day36to39/Notes.txt](day36to39/Notes.txt) - Broken links, Shadow DOM, and SVG elements
- [day40/Notes.txt](day40/Notes.txt) - Excel utilities and data-driven testing
- [day41/Notes.txt](day41/Notes.txt) - Configuration management and utilities

### Test Framework Level Notes
- [day42/Notes.txt](day42/Notes.txt) - TestNG basics and test case structure
- [day43/Notes.txt](day43/Notes.txt) - Assertions and TestNG annotations
- [day44/Notes.txt](day44/Notes.txt) - TestNG suites, dependencies, and test organization
- [day45/Notes.txt](day45/Notes.txt) - Parameters and data providers
- [day46/Notes.txt](day46/Notes.txt) - TestNG listeners and Extent Reports
- [day47/Notes.txt](day47/Notes.txt) - Page Object Model implementation

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

## 🌐 External Learning Resources

### Official Documentation
- **[Selenium WebDriver Documentation](https://www.selenium.dev/documentation/webdriver/)** - Official Selenium documentation
- **[TestNG Documentation](https://testng.org/doc/)** - Complete TestNG framework guide
- **[Maven Documentation](https://maven.apache.org/guides/)** - Build tool documentation
- **[Apache POI Documentation](https://poi.apache.org/components/spreadsheet/)** - Excel file handling

### Free Online Courses & Tutorials
- **[Selenium WebDriver with Java - Free Course](https://www.udemy.com/course/selenium-webdriver-with-java-basics-to-advanced-frameworks/)** - Comprehensive Selenium course
- **[TestNG Tutorial - Guru99](https://www.guru99.com/testng-tutorial.html)** - Complete TestNG tutorial
- **[Selenium Tutorial - TutorialsPoint](https://www.tutorialspoint.com/selenium/index.htm)** - Step-by-step Selenium guide
- **[Java for Selenium - JavaTpoint](https://www.javatpoint.com/selenium-tutorial)** - Java concepts for Selenium

### YouTube Channels (Recommended)
- **[Selenium Easy](https://www.youtube.com/c/SeleniumEasy)** - Practical Selenium tutorials
- **[Automation Testing](https://www.youtube.com/c/AutomationTesting)** - Test automation best practices
- **[SDET- QA Automation Techie](https://www.youtube.com/c/SDETQA)** - Advanced automation concepts
- **[Rahul Shetty Academy](https://www.youtube.com/c/RahulShettyAcademy)** - Comprehensive testing tutorials

### Testing Blogs & Articles
- **[Selenium Blog](https://selenium-python.readthedocs.io/)** - Selenium Python documentation
- **[Test Automation University](https://testautomationu.applitools.com/)** - Free testing courses
- **[Ministry of Testing](https://www.ministryoftesting.com/)** - Testing community and resources
- **[Software Testing Help](https://www.softwaretestinghelp.com/)** - Testing tutorials and guides

### GitHub Repositories for Learning
- **[Selenium Examples](https://github.com/SeleniumHQ/selenium)** - Official Selenium repository
- **[TestNG Examples](https://github.com/cbeust/testng)** - TestNG framework examples
- **[Page Object Model Examples](https://github.com/anshooarora/extentreports-java)** - POM implementation examples

### Tools & Utilities
- **[Chrome DevTools](https://developers.google.com/web/tools/chrome-devtools)** - Browser debugging
- **[Selenium Grid](https://www.selenium.dev/documentation/grid/)** - Parallel test execution
- **[Docker for Selenium](https://github.com/SeleniumHQ/docker-selenium)** - Containerized testing
- **[Allure Reports](https://docs.qameta.io/allure/)** - Advanced test reporting

## 🚀 Next Steps & Roadmap
- **CI/CD Integration**: GitHub Actions for automated testing
- **Docker Implementation**: Containerized test execution
- **API Testing**: REST Assured integration
- **Mobile Testing**: Appium framework addition
- **Performance Testing**: JMeter integration
- **Advanced Reporting**: Allure Reports implementation

## 🤝 Contributing
This repository is open for learning and collaboration. Feel free to:
- Submit issues for bugs or improvements
- Create pull requests for enhancements
- Share your learning experiences
- Suggest additional topics or examples

## 📞 Contact & Support
- **GitHub Issues**: For questions, bugs, or feature requests
- **Learning Discussions**: Share your automation journey
- **Code Reviews**: Get feedback on your implementations
- **Collaboration**: Join the automation testing community

---
*This repository represents a comprehensive learning journey in Selenium WebDriver automation, combining theoretical knowledge with practical implementation. Each example is designed to be educational, maintainable, and ready for real-world application.*