# Liquibase DB migration

KeyWords
---
OAS (3.0.3), Liquibase DB migration(using liquibase) , Swagger code-gen(using ) , Object Mapper , Swagger ui

###DB Migration can be enabled in two ways

1. Done by mvn plugin(liquibase-maven-plugin) please follow all the todo-1's

   1. remove the comment from pom.xml file 
      
   2. application.properties file change the value with todo-1 comment

   3. To migrate tables, use following command-

   ```shell
   mvn liquibase:update
   ```
   
1. Done by springboot itself do all the todo-2's

   1. application.properties file change the value with todo-1 comment
   1. 
##Author's Note
1. Flyway is other db migration tool which can be used. This tool is configured through db scripts not through xml. 

2. Other alternative to openapi-generator is springdoc-openapi , details are mentioned in their page.

3. For swagger ui you can use as alternative.