# Distributed-Systems
| Project Details   |     |
| --- | --- |
| **Course** | BSc (Hons) in Software Development  |
| **Module** |  Distributed Systems |
| **Student** | Gary Mannion G00319609 |
| **Lecture** | Patrick Mannion |

## Overview
You are required to use the JAX-RS/Jersey, Java RMI and JAXB frameworks to develop a simple Car Hire
Booking System. A Web Client page should provide users with the ability to Create/Modify/Update/Delete
bookings for a specific vehicle for a given set of dates. The Web Client will interact with a RESTful JAX-RS
Web Service for bookings which is deployed on Apache Tomcat Server. The RESTful Web Service will act as
a RMI client to a RMI Database Server which will handle persistence.
## Architecture
![](https://user-images.githubusercontent.com/10883051/48415294-e6286700-e744-11e8-9192-33881082e14b.png)

## Apache Tomcat Server
Tomcat Server v7 is used in this project.

<img width="300" src="https://1.bp.blogspot.com/-FJN5mv7udjk/WdYQhsxOOUI/AAAAAAAAAU0/0a1mgN6N0-c4sgbuLHYOyU9yK0tbhpJeACLcBGAs/s728-e100/apache-tomcat-rce-exploit.png">

The Apache Tomcat® software is an open source implementation of the Java Servlet, JavaServer Pages, Java Expression Language and Java WebSocket technologies. Apache Tomcat allows the implementation of Java Servlets and JavaServer Pages (JSP) to promote an effective Java server environment. Users can also access resources for configuration and use extensible markup language (XML) to configure projects. Successive versions of Apache Tomcat have solved different problems by applying software patches and other solutions. Some experts characterize Apache Tomcat as a product offering a runtime shell for Java Servlets. Users can also set up Java virtual machines (JVM) to configure virtual hosting.


## RMI (Remote Method Innovation)
<img width="300" src="http://www.codepep.com/wp-content/uploads/2017/01/24.jpg">

The Java Remote Method Invocation (Java RMI) is a Java API that performs remote method invocation, the object-oriented equivalent of remote procedure calls (RPC), with support for direct transfer of serialized Java classes and distributed garbage-collection. The RMI allows an object to invoke methods on an object running in another JVM. The RMI provides remote communication between the applications using two objects stub and skeleton. 

## JSP
<img width="200" src="https://image.freepik.com/free-icon/jsp-open-file-format-with-java-logo_318-45209.jpg">

A JSP page is a text document that contains two types of text: static data, which can be expressed in any text-based format (such as HTML, SVG, WML, and XML). Java Server Pages (JSP) is a server-side programming technology that enables the creation of dynamic, platform-independent method for building Web-based applications. JSP have access to the entire family of Java APIs, including the JDBC API to access enterprise databases.

## How To Run
Make sure to have wamp running in the background.

setup the database as follows:
> mysql -u root -p -s "the path of the mySQL script"

step 2 is to import the project by first cloning the repository down and the importing it to eclipse.

once imported make sure to have tomcat installed and added to the build path

step 3:
> run the rmi as a java application

> run the jerser as on server

Tomcat should startup and you should have the home page appear on the screen
