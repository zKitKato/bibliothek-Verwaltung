# bibliothek-Verwaltung


# TODO and Structuring
- creating Porject Structure => *Done*
  - Backend and Frontend Folder

- creating DTO, DAO, DAOimpl => *DONE* 
  - Benutzer
  - Buch 

- creating pom.xml => TODO
  - adding dependencies



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
