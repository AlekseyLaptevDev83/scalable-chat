# Scalable App #

### What is this repository for? ###

* A sample multiuser application with a scalable architecture.
* A chat room application that demonstrates persistence by storing chat history

### Technology Stack ###

* ScalaFX client
* Akka in both client and server
* Akka I/O used for client server communications
* Message serialization in BSON format
* Akka Persistence with Cassandra
* Akka Testkit and Specs2 testing

### How do I get set up? ###

* Requires Java 8
* To run the server:  `./activator server/run`
* To run a ScalaFX client:  `./activator client/run`
* Configuration files are in `server/src/main/resources/application.conf` and `client/src/main/resources/application.conf` for server and client respectively.
* Dependencies: akka , cassandra, scalafx, scalafxml, reactive-mongo-bson
* Database Configuration: TBD
* How to run tests: `./activator test`
* Deployment instructions: TBD

### Who do I talk to? ###

* Repo owner and admin: [ezoerner](https://bitbucket.org/ezoerner)