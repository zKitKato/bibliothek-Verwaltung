# bibliothek-Verwaltung

## Content

- Tomacat 10.1.41 Server
- Maven
- Spring
- Bootstrap 3.3.7
- Java 17
- 




## Run tomcat on this project
new command: Build backend, Frontend both copied to Sever and start server

```bash
  cd /home/gian/IdeaProjects/bibliothek-Verwaltung/bibliothek-VerwaltungBackend
  
  mvn clean package
  
  cp target/bibliothekVerwaltungBackend-0.0.1-SNAPSHOT.jar /home/gian/apache-tomcat-10.1.41/webapps/
  
  cd
  
  cd /home/gian/IdeaProjects/bibliothek-Verwaltung/bibliothek-VerwaltungFrontend
  
  mvn clean package
  
  cp target/BibliothekVerwaltung.war /home/gian/apache-tomcat-10.1.41/webapps/
  
  /home/gian/apache-tomcat-10.1.41/bin/shutdown.sh
  
  /home/gian/apache-tomcat-10.1.41/bin/startup.sh
```


  ``` bash
    mvn clean package
  
cp target/BibliothekVerwaltung.war /home/$(hostname)/apache-tomcat-10.1.41/webapps/

/home/$(hostname)/apache-tomcat-10.1.41/bin/shutdown.sh

/home/$(hostname)/apache-tomcat-10.1.41/bin/startup.sh

http://localhost:8080/BibliothekVerwaltung/
```

For checking the running server:

```bash
  sudo lsof -i :8080
```

## H2 Database

```bash
  java -cp h2*.jar org.h2.tools.Server
```

To start the H2 database to get the Generic.


## TODO and Structuring
- [x] creating Porject Structure => DONE 05.05.2025
  - [x] Backend and Frontend Folder => DONE 05.05.2025

--- 
- [x] creating DTO, DAO, DAOimpl => DONE 05.05.2025

---

- [x] creating pom.xml => Done 06.05.2025
  - [x] adding dependencies => DONE 06.05.2025

---

  
- [x] creating the webapp:
  - [x] Web-Inf
    - [x] views
      - [x] flows
        - [x] contains all the stuff for ausleihe
      - [x] shared   
  - [x] assets
    - [x] css
    - [x] fonts
    - [x] imaages
    - [x] js

---

- creating the database: => TODO
  - add the driver jar in project
  - creating the TABLEs:


- creating Logic folder Structure => TODO
  - Classes to implement:
    - ausleihe:
      - check available_copies for ausleihe
      - available_copies reduce if ausgeliehen
      - available_copies increment if books is returned
    - search:
      - search for categories
      - search for author
      - search for title
      - search for all Books
      - search for all categories
    - Datum:
      - for the ausleihBeginn
      - for the ausleihEnd
      - for the ausleiheVerlaengern
