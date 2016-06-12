[![Build Status](https://travis-ci.org/laki88/book-keeper.svg?branch=master)](https://travis-ci.org/laki88/book-keeper)

## Installation

1. Download and start tomcat. After started, you should able to access tomcat management console via `http://localhost:8080.`
2. Install maven, jdk and run mvn clean install from root folder of project.
3. you can find the built war file in distribution/target folder. copy this book-keeper.war file to web app directory in tomcat root folder.
   tomcat will auto deploy the war file after several seconds
4. you can access the book-keeper by issuing following url
   `http://localhost:8080/book-keeper/`

## Usage
1. invoice page is at
`http://localhost:8080/book-keeper/invoice`
2. customer adding page is at
`http://localhost:8080/book-keeper/customer`
3. you can view the embedded database by going to
`http://localhost:8082` default username password `sa` and `sa` database url is `jdbc:h2:~/<tomcat_home>/database/book-keeper`