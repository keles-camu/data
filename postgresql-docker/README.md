open -a docker

dc -f postgresql.yaml up

dc -f postgresql.yaml stop

dc -f postgresql.yaml down

postgresql-client:
        
       	psql -h localhost -p 5432  -U admin
	
        
	docker exec -it <container-id> bash

	mysql -uroot -pexample


adminer:

	http://localhost:8080
	
	System = PostgreSQL	
	Server	= db
	Username = user	
	Password = admin	
	Database = postgresql_db


docker-postgresql:
	
	https://hub.docker.com/_/postgres
