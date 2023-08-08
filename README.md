# java-web-servlets

## Requirements
- [Servlets](https://mcsekr.atlassian.net/wiki/spaces/JL/pages/458293271/1.+Using+Servlets+Interface)
- [Maven 3](https://maven.apache.org)

## Servlets Dependency 
```
<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>co.in.practice</groupId>
	<artifactId>java-web-servlets</artifactId>
	<packaging>war</packaging>
	<version>1.0-SNAPSHOT</version>
	<name>java-web-servlets Maven Webapp</name>
	<url>http://maven.apache.org</url>
	<properties>
		<maven.compiler.source>17</maven.compiler.source>
		<maven.compiler.target>17</maven.compiler.target>
		<log4j.log4j.version>1.2.17</log4j.log4j.version>
	</properties>
	<dependencies>
		<!-- https://mvnrepository.com/artifact/jakarta.servlet/jakarta.servlet-api -->
		<dependency>
			<groupId>jakarta.servlet</groupId>
			<artifactId>jakarta.servlet-api</artifactId>
			<version>6.0.0</version>
			<scope>provided</scope>
		</dependency>
		<dependency>
			<groupId>log4j</groupId>
			<artifactId>log4j</artifactId>
			<version>${log4j.log4j.version}</version>
		</dependency>
		<dependency>
			<groupId>org.junit.jupiter</groupId>
			<artifactId>junit-jupiter-engine</artifactId>
			<version>5.9.2</version>
			<scope>test</scope>
		</dependency>
	</dependencies>
	<build>
		<finalName>java-web-servlets</finalName>
		<plugins>
			<plugin>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>3.0.0-M7</version>
			</plugin>
			<plugin>
				<artifactId>maven-failsafe-plugin</artifactId>
				<version>3.0.0-M7</version>
			</plugin>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-war-plugin</artifactId>
				<version>3.3.1</version>
			</plugin>
		</plugins>
	</build>
</project>

```
## Servlet implementation
```
package co.in.practice.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;



public class MyServlet implements Servlet {

	 private ServletConfig config = null;

	    @Override
	    public void init(ServletConfig config) throws ServletException {
	        this.config = config;
	        System.out.println("iniside init method : " + config.getServletName());

	    }

	    @Override
	    public ServletConfig getServletConfig() {
	        return this.config;
	    }

	    @Override
	    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	        System.out.println("inside service method");
	        res.setContentType("text/html");

	        PrintWriter out = res.getWriter();
	        out.print("<html><body>");
	        out.print("<b> Servlet Interface Example</b>");
	        out.print("</body></html>");
	        
	        
	    }

	    @Override
	    public String getServletInfo() {
	        return "Demonstrated implementaton of Servlet interface";
	    }

	    @Override
	    public void destroy() {
	        System.out.println("inside destroy method");
	    }

}
```

## Servlet configuraton
```
<?xml version="1.0" encoding="UTF-8"?>
<web-app
	xmlns:xsi="http://www.w3.org/XMLSchema-instance xmlns http://xmlns.jcp.org/xml/ns/javaee"
	xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
	id="WebApp_ID" version="4.0">

	<display-name>Archetype Created Web Application</display-name>
	<servlet>
		<servlet-name>servletOne</servlet-name>
		<servlet-class>co.in.practice.servlets.MyServlet</servlet-class>
		<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
		<servlet-name>servletOne</servlet-name>
		<url-pattern>/servlet-one/*</url-pattern>
	</servlet-mapping>
</web-app>
```


## Clean the application 

```shell
mvn clean
```

## package application 

```shell
mvn package
```

## Running the application 

```shell

```

## Testing



## Payload

```shell

```

## Success

## Errors
