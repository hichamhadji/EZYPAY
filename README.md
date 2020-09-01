# EZYPAY- Payment Subscription 

Payment Subscription is a simple application to allow customers to subscrib to a reacurring payment. 
### Tech

The app uses a number of open source projects to work properly:

* [Spring Boot] - Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".
* [GraphQL] - GraphQL is a query language to retrieve data from a server. It is an alternative to REST, SOAP or gRPC in some way.
* [Graphiql] - Authentication for Graphene Django
* [Lombok] - GraphQL in Python Made Easy.
* [Joda Time] - GraphQL for django.

### Run on localhost


```sh
$ ./mvnw spring-boot:run
```
Visit: 
```sh
localhost:8080/graphiql
```
Enjoy !

#### Funtions:
##### Subscriptions List 
![Create Subscription](https://github.com/hichamhadji/EZYPAY/blob/master/images/Subscriptions.PNG?raw=true)

###### CreateSubscription

![Create Subscription](https://github.com/hichamhadji/EZYPAY/blob/master/images/CreateSubscription.PNG?raw=true)


### Run on docker
Run: 
```sh
$ docker build -t EZYPAY/subscription/ .
```

```sh
$ docker run -p 8080:8080 EZYPAY/subscription
```

Visit:
```sh
localhost:8080/graphiql
```
License
----
MIT 

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)


   [Spring Boot]: <https://spring.io/projects/spring-boot/>
   [GraphQL]: <https://www.graphql-java.com/tutorials/getting-started-with-spring-boot/>
   [Graphiql]: <https://www.graphql-java.com/tutorials/getting-started-with-spring-boot/>
   [Lombok]: <https://projectlombok.org//>
   [Joda Time]: <https://www.joda.org/joda-time/>

