# bibliothek-Verwaltung


# TODO and Structuring
- creating Porject Structure => DONE 05.05.2025
  - Backend and Frontend Folder => DONE 05.05.2025

- creating DTO, DAO, DAOimpl => DONE 05.05.2025
 

- creating pom.xml => Done 06.05.2025
  - adding dependencies => DONE 06.05.2025



- creating the database: => TODO
  - add the driver jar in project
  - creating the TABLEs:


  
- creating the webapp:
  -Web-Inf
    - views
      - flows
        - contains all the stuff for ausleihe
      - shared   
  - assets
    - css
    - fonts
    - imaages
    - js



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
