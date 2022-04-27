# BooksRepositoryApi
A demo for how APIs are created through springBoot

## Getting Started
Open [Spring Initializer](https://start.spring.io/) and generate a JVM-based project as follows:
- Choose Maven Project.
- Enter the name of your project in the Artifact field.
- In the dependencies section, select the following : Web, JPA, H2 and Lombok.
- Click on Generate.
- A .zip will download. Unzip it. Inside it you will find a simple, Maven-based project containing a pom.xml file.
- Open the folder in IntelliJ IDEA or VS Code.
We'll mainly be working within the directory /src/main/java/ 

### Testing
Build your project then open Postman:
- select the request type (POST/PUT/GET/DELETE etc)
- write the url as: http://localhost:8080/path (/path is defined in controller along with request method)
- send the request and see the JSON response
