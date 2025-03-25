JSF Profile Application
=====================

A modern, responsive web application built with Jakarta Server Faces (JSF) that displays a personal profile with an age calculator and image gallery.

Features
--------
1. Personal Profile Display
   - Profile photo
   - Personal information
   - Professional interests
   - Personal hobbies

2. Age Calculator
   - Date of birth input
   - Automatic age calculation
   - Support for multiple date formats

3. Image Gallery
   - Responsive grid layout
   - Hover effects
   - Full-size image display

4. Modern UI/UX
   - Glassmorphism design
   - Smooth animations
   - Responsive layout
   - Mobile-friendly

Technical Requirements
--------------------
- Java 11 or higher
- Jakarta EE 9+
- Apache Tomcat 10
- Maven 3.6+

Dependencies
-----------
- Jakarta Faces API 3.0.0
- Jakarta Servlet API 5.0.0
- Jakarta JSTL API 2.0.0
- JUnit 4.13.2 (for testing)

Project Structure
----------------
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           ├── ProfileBean.java
│   │           └── LocalDateConverter.java
│   └── webapp/
│       ├── resources/
│       │   ├── css/
│       │   │   └── styles.css
│       │   └── images/
│       │       ├── profile.jpg
│       │       ├── gallery1.png
│       │       ├── gallery2.jpg
│       │       └── gallery3.jpeg
│       ├── WEB-INF/
│       │   └── web.xml
│       ├── index.xhtml
│       └── myprofile.xhtml
└── test/
    └── java/

Installation
-----------
1. Clone the repository
2. Build the project:
   mvn clean package
3. Deploy the WAR file to Tomcat:
   cp target/jsf-profile.war /var/lib/tomcat10/webapps/
4. Start Tomcat:
   systemctl start tomcat10

Accessing the Application
------------------------
- Main URL: http://localhost:8080/jsf-profile/
- Profile Page: http://localhost:8080/jsf-profile/myprofile.xhtml

Date Format Support
------------------
The application supports two date formats:
1. Standard format: YYYY-MM-DD (e.g., 1990-05-19)
2. Bulgarian format: DD.MM.YY (e.g., 19.05.90)

Customization
------------
1. Profile Information
   - Edit personal details in myprofile.xhtml
   - Update images in resources/images/

2. Styling
   - Modify styles in resources/css/styles.css
   - Adjust colors, animations, and layout

3. Date Format
   - Modify LocalDateConverter.java for additional formats

Troubleshooting
--------------
1. 404 Error
   - Check if Tomcat is running
   - Verify WAR file deployment
   - Check application logs

2. Date Conversion Issues
   - Ensure correct date format
   - Check browser console for errors
   - Verify LocalDateConverter implementation

3. Image Display Problems
   - Verify image paths
   - Check file permissions
   - Ensure correct file formats

Contributing
-----------
1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

License
-------
This project is licensed under the MIT License - see the LICENSE file for details.

Author
------
Dobby Gotcheva
7MI3400513 

Alternative Server Options
------------------------
This application can be deployed to various Jakarta EE compatible servers. Below are instructions for popular alternatives:

1. WildFly (JBoss)
   ----------------
   a. Download WildFly 26.0 or later from: https://www.wildfly.org/downloads/
   b. Extract the archive to your desired location
   c. Configure port (optional):
      - Edit standalone/configuration/standalone.xml
      - Find <socket-binding name="http" port="${jboss.http.port:8080}"/>
      - Change 8080 to your desired port
   d. Start WildFly:
      - Windows: bin\standalone.bat
      - Linux/Mac: ./bin/standalone.sh
   e. Deploy the application:
      - Copy jsf-profile.war to standalone/deployments/
      - Or use the management console at http://localhost:9990
   f. Access the application at: http://localhost:8080/jsf-profile

2. GlassFish
   ----------
   a. Download GlassFish 6.0 or later from: https://glassfish.org/download/
   b. Run the installer
   c. Configure port (optional):
      - Edit domain1/config/domain.xml
      - Find <network-listeners>
      - Change port="8080" to your desired port
   d. Start GlassFish:
      - Windows: bin\asadmin start-domain
      - Linux/Mac: ./bin/asadmin start-domain
   e. Deploy the application:
      - Use the admin console at http://localhost:4848
      - Or use command: asadmin deploy jsf-profile.war
   f. Access the application at: http://localhost:8080/jsf-profile

3. TomEE
   ------
   a. Download TomEE 9.0 or later from: https://tomee.apache.org/download-ng.html
   b. Extract the archive
   c. Configure port (optional):
      - Edit conf/server.xml
      - Find <Connector port="8080"
      - Change 8080 to your desired port
   d. Start TomEE:
      - Windows: bin\startup.bat
      - Linux/Mac: ./bin/startup.sh
   e. Deploy the application:
      - Copy jsf-profile.war to webapps/
   f. Access the application at: http://localhost:8080/jsf-profile

4. Payara Server
   -------------
   a. Download Payara Server 6.0 or later from: https://www.payara.fish/downloads/
   b. Run the installer
   c. Configure port (optional):
      - Edit domains/domain1/config/domain.xml
      - Find <network-listeners>
      - Change port="8080" to your desired port
   d. Start Payara:
      - Windows: bin\asadmin start-domain
      - Linux/Mac: ./bin/asadmin start-domain
   e. Deploy the application:
      - Use the admin console at http://localhost:4848
      - Or use command: asadmin deploy jsf-profile.war
   f. Access the application at: http://localhost:8080/jsf-profile

Server-Specific Notes
--------------------
1. WildFly
   - Built-in support for Jakarta EE 9+
   - Excellent performance and scalability
   - Rich management interface
   - Good for enterprise applications

2. GlassFish
   - Reference implementation of Jakarta EE
   - User-friendly admin console
   - Good for development and testing
   - Built-in clustering support

3. TomEE
   - Lightweight alternative to Tomcat
   - Full Jakarta EE support
   - Easy configuration
   - Good for smaller applications

4. Payara Server
   - Fork of GlassFish with enhanced features
   - Excellent monitoring capabilities
   - Regular security updates
   - Good for production environments

Common Configuration Tips
------------------------
1. Memory Settings
   - Adjust heap size in server startup scripts
   - Example: JAVA_OPTS="-Xms512m -Xmx1024m"

2. Logging
   - Configure log levels in server-specific config files
   - Enable debug logging for troubleshooting

3. Security
   - Change default admin passwords
   - Configure SSL/TLS if needed
   - Review security settings

4. Performance
   - Adjust thread pool settings
   - Configure connection pools
   - Enable compression 