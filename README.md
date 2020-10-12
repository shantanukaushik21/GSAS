# GSAS
Government Schemes Application System
<p align="center">
<img style="padding:4px" src="C:\Users\SHANTANU KAUSHIK\Desktop\GSAS.jpg" width="320"/>
</p>
<br/>

# Online Auction
#### The web based system which allows the citizen to view and apply for scheme and also the employee to add and edit scheme.

## Prerequisite 
<br/>

1. [Java 1.8](https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html)
2. [Apache Derby 10.13.1.1](https://db.apache.org/derby/releases/release-10.13.1.1.html)
3. [Apache Tomcat 8.5](https://tomcat.apache.org/download-80.cgi)
4. [jstl-1.2.jar](https://mvnrepository.com/artifact/javax.servlet/jstl/1.2)
5. [Log4J](https://logging.apache.org/log4j/1.2/download.html)
6. [Commons-io-2.2.jar](http://www.java2s.com/Code/Jar/c/Downloadcommonsio22jar.htm)
7. [commons-fileupload-1.3.2.jar](https://jar-download.com/artifacts/commons-fileupload/commons-fileupload/1.3.2/source-code)
8. [json-simple-1.1.jar](http://www.java2s.com/Code/Jar/j/Downloadjsonsimple11jar.htm)

## Serving static files from local file system in Apache Tomcat
Employee can add scheme image and citizen can upload the documents. The images are saved on local file system. Image name is saved in database corresponding to the product. Tomcat can be configured to read files from anywhere on disk and serve them on a specific URL.

<br/>

**Note** : Create folder to upload images outside workspace.

## Add Apache Derby database credentials
```Open
Open the path : C:\Users\Sunrise\Downloads\db-derby-10.13.1.1-bin\db-derby-10.13.1.1-bin\bin
Start StartNetworkServer
Start ij
Run the following command to start the database
ij> connect 'jdbc:derby://localhost:1527/gsasdb;user=admin;password=derby';
```

Add derby URL, username and password
```java
con = DriverManager.getConnection(url,username,password);
```


## Create tables in database
Run the ```/GSAS/queries.sql```
<br/>

## Layered Architecture

```bash
.
C:.
│   .classpath
│   .gitignore
│   .project
│
├───.settings
│       .jsdtscope
│       org.eclipse.jdt.core.prefs
│       org.eclipse.wst.common.component
│       org.eclipse.wst.common.project.facet.core.xml
│       org.eclipse.wst.jsdt.ui.superType.container
│       org.eclipse.wst.jsdt.ui.superType.name
│
├───build
│   │   .project
│   │
│   └───classes
│       └───com
│           └───gsas
│               ├───controller
│               │       AddCitizenServlet.class
│               │       AddSchemeServlet.class
│               │       ApplySchemeDocumentServlet.class
│               │       ApplySchemeServlet.class
│               │       CitizenLoginServlet.class
│               │       CitizenRegistrationServlet.class
│               │       EditCitizenDetailsServlet.class
│               │       EditSchemeServlet.class
│               │       EmployeeLoginServlet.class
│               │       HomeServlet.class
│               │       InsertSchemeServlet.class
│               │       LoginFilter.class
│               │       LoginServlet.class
│               │       LogoutServlet.class
│               │       UpdateCitizenDetailsServlet.class
│               │       UpdateSchemeServlet.class
│               │       viewSchemesCitizenServlet.class
│               │       viewSchemesEmployeeServlet.class
│               │
│               ├───dao
│               │       CitizenDao.class
│               │       CitizenDaoImpl.class
│               │       CommonDao.class
│               │       CommonDaoImpl.class
│               │       EmployeeDao.class
│               │       EmployeeDaoImpl.class
│               │       SchemeDao.class
│               │       SchemeDaoImpl.class
│               │
│               ├───exception
│               │       AuthenticationException.class
│               │       CitizenNotEligibleException.class
│               │       CitizenNotFoundException.class
│               │       DatabaseException.class
│               │       DataNotFoundException.class
│               │       DuplicateUserException.class
│               │       InvalidSequenceException.class
│               │       SchemeNotFoundException.class
│               │
│               ├───model
│               │       AddressVO.class
│               │       BankVO.class
│               │       CitizenDetailsVO.class
│               │       DocumentVO.class
│               │       IncomeGroupVO.class
│               │       LoginVO.class
│               │       MinistryVO.class
│               │       ProfessionVO.class
│               │       SchemeApplicantDocumentsVO.class
│               │       SchemeApplicantVO.class
│               │       SchemeEligibilityVO.class
│               │       SchemeVO.class
│               │       SectorVO.class
│               │
│               ├───service
│               │       CitizenService.class
│               │       CitizenServiceImpl.class
│               │       CommonService.class
│               │       CommonServiceImpl.class
│               │       EmployeeService.class
│               │       EmployeeServiceImpl.class
│               │       SchemeService.class
│               │       SchemeServiceImpl.class
│               │
│               └───utility
│                       DBUtility.class
│                       LayerType.class
│                       ObjectFactory.class
│
├───src
│   └───com
│       └───gsas
│           ├───controller
│           │       AddCitizenServlet.java
│           │       AddSchemeServlet.java
│           │       ApplySchemeDocumentServlet.java
│           │       ApplySchemeServlet.java
│           │       CitizenLoginServlet.java
│           │       CitizenRegistrationServlet.java
│           │       EditCitizenDetailsServlet.java
│           │       EditSchemeServlet.java
│           │       EmployeeLoginServlet.java
│           │       HomeServlet.java
│           │       InsertSchemeServlet.java
│           │       LoginFilter.java
│           │       LoginServlet.java
│           │       LogoutServlet.java
│           │       UpdateCitizenDetailsServlet.java
│           │       UpdateSchemeServlet.java
│           │       viewSchemesCitizenServlet.java
│           │       viewSchemesEmployeeServlet.java
│           │
│           ├───dao
│           │       CitizenDao.java
│           │       CitizenDaoImpl.java
│           │       CommonDao.java
│           │       CommonDaoImpl.java
│           │       EmployeeDao.java
│           │       EmployeeDaoImpl.java
│           │       SchemeDao.java
│           │       SchemeDaoImpl.java
│           │
│           ├───exception
│           │       AuthenticationException.java
│           │       CitizenNotEligibleException.java
│           │       CitizenNotFoundException.java
│           │       DatabaseException.java
│           │       DataNotFoundException.java
│           │       DuplicateUserException.java
│           │       InvalidSequenceException.java
│           │       SchemeNotFoundException.java
│           │
│           ├───model
│           │       AddressVO.java
│           │       BankVO.java
│           │       CitizenDetailsVO.java
│           │       DocumentVO.java
│           │       IncomeGroupVO.java
│           │       LoginVO.java
│           │       MinistryVO.java
│           │       ProfessionVO.java
│           │       SchemeApplicantDocumentsVO.java
│           │       SchemeApplicantVO.java
│           │       SchemeEligibilityVO.java
│           │       SchemeVO.java
│           │       SectorVO.java
│           │
│           ├───service
│           │       CitizenService.java
│           │       CitizenServiceImpl.java
│           │       CommonService.java
│           │       CommonServiceImpl.java
│           │       EmployeeService.java
│           │       EmployeeServiceImpl.java
│           │       SchemeService.java
│           │       SchemeServiceImpl.java
│           │
│           └───utility
│                   DBUtility.java
│                   LayerType.java
│                   ObjectFactory.java
│
└───WebContent
    │   .gitignore
    │   addScheme.jsp
    │   applyScheme.jsp
    │   citizenLogin.jsp
    │   editCitizenDetails.jsp
    │   editScheme.jsp
    │   employeeLogin.jsp
    │   home.jsp
    │   imagesnull
    │   index.jsp
    │   listSchemes.jsp
    │   loginFailure.jsp
    │   registerCitizen.jsp
    │   schemeManagement.jsp
    │   viewAllSchemes.jsp
    │
    ├───css
    │       common.css
    │       common1.css
    │       form.css
    │
    ├───images
    ├───JS
    │       navigation.js
    │
    ├───logo
    │       logo.jpeg
    │
    ├───META-INF
    │       MANIFEST.MF
    │
    └───WEB-INF
        └───lib

```
