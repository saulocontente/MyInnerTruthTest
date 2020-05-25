# **MyInnerTrueTest**

## Requirements:
- Chrome at version 83.0.4103.61
- Java 8
- Maven
- Chromedriver at version 83.0.4103.61


### Pre-Requisites Installation

- Download Maven Binary zip file at:
    http://maven.apache.org/download.cgi

    - Install Maven following the instructions at:
        http://maven.apache.org/install.html
    
- Download Chromedriver 83.0.4103.61 at:
    https://chromedriver.chromium.org/
    
    - If you are using MacOS:
        - Unzip and Replace Chromedriver downloaded file to the project folder \chromedriver\macos  
    
    - If you are using Windows:
        - Unzip and Replace Chromedriver downloaded file to the project folder \chromedriver\windows
    
    - If you are using Linux:
        - Unzip and Replace Chromedriver downloaded file to the project folder \chromedriver\linux
    
#
# **Executing:**

- Open the project root folder on terminal and execute command:
```bash 
    $ mvn clean test 
```
- After executed the program will generate a report file
    \target\report-html\index.html
    