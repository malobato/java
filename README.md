# java

```java
registry
  .addEndpoint( "/drone" )
  .setAllowedOrigins( "http://localhost", "http://192.168.1.10" )
  .withSockJS()
  .setSupressCors( false );
```
