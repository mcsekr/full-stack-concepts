# java-web-servlets

## Requirements
- [Servlets](https://mcsekr.atlassian.net/wiki/spaces/JL/pages/458293271/1.+Using+Servlets+Interface)
- [Maven 3](https://maven.apache.org)

## Servlets Dependency 
```
<dependency>
	<groupId>jakarta.servlet</groupId>
	<artifactId>jakarta.servlet-api</artifactId>
	<version>6.0.0</version>
	<scope>provided</scope>
</dependency>
```

## Servlet configuraton
```
<servlet>
	<servlet-name>servletOne</servlet-name>
	<servlet-class>co.in.practice.servlets.MyServlet</servlet-class>
	<load-on-startup>1</load-on-startup>
</servlet>

<servlet-mapping>
	<servlet-name>servletOne</servlet-name>
	<url-pattern>/servlet-one/*</url-pattern>
</servlet-mapping>
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
