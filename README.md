# bibliothek-Verwaltung

## Content

- Tomacat 10.1.41 Server
- Maven
- Spring
- Bootstrap 3.3.7
- Java 17
- 




## Run tomcat on this project

  ```
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
