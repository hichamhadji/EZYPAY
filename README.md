# EZYPAY- Payment Subscription 

Payment Subscription is a simple application to allow customers to subscribe to a recurring payment. 
### Tech stack

The app uses a number of open source projects to work properly:

* [Spring Boot] - Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications that you can "just run".
* [GraphQL] - GraphQL is a query language to retrieve data from a server. It is an alternative to REST, SOAP or gRPC in some way.
* [Graphiql] - Simple play ground to play with graphql (Queries and Mutations) as well as to see API documentation.
* [Lombok] - Project Lombok is a java library that automatically plugs into your editor and build tools, spicing up your java.
* [Joda Time] - Joda-Time provides a quality replacement for the Java date and time classes..

### Technical Debt
Please Refer to Technical Debt file as well.

```sh
A.Branch The Repos:
1.Create Dev branch and respective branches(Workflow best practices)

B.Treat all edge cases:
1.Hundle extreme Dates format

C.Create Graphql Subscriptions:
1. Add Graphql subscription to get newly created Payment Subscriptions on Real time.
2.Add Graphql subscription to get updated Payment Subscriptions
3.Add Graphql subscription to get notification for deleted Payment Subscriptions
4.Add a mutation to update subscription by Id

D. Unit Test cases:
1. I need more Time :)
```

### Run on localhost


```sh
$ ./mvnw spring-boot:run
```
Visit: 
```sh
localhost:8080/graphiql
```
Enjoy !


#### Documentation

###### Queries
![Queries](https://github.com/hichamhadji/EZYPAY/blob/master/images/Queries.PNG?raw=true)

###### Mutations
![Mutations](https://github.com/hichamhadji/EZYPAY/blob/master/images/Mutations.PNG?raw=true)

#### Funtions:

##### Get Subscriptions List 
![Subscriptions](https://github.com/hichamhadji/EZYPAY/blob/master/images/Subscriptions.PNG?raw=true)

##### Get Subscription by Id

![Subscription](https://github.com/hichamhadji/EZYPAY/blob/master/images/Subscription.PNG?raw=true)

##### CreateSubscription

![CreateSubscription](https://github.com/hichamhadji/EZYPAY/blob/master/images/CreateSubscription.PNG?raw=true)

##### Delete Subscription

![deleteSubscription](https://github.com/hichamhadji/EZYPAY/blob/master/images/deleteSubscription.PNG?raw=true)
### Run on docker
Run: 
```sh
$ docker build -t ezypay/subscription .
```

```sh
$ docker run -p 8080:8080 ezypay/subscription
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

