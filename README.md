# cf-scs-demo

## requirements
* PWS or PCF

## setup
```
cf create-service p-service-registry standard service-registry
cf create-service p-circuit-breaker-dashboard standard circuit-breaker
cf create-service p-config-server standard config-server -c '{"git": { "uri": "https://github.com/vchrisb/cf-scs-demo", "searchPaths": "spring-cloud-config"}}'
cf create-service cloudamqp lemur rabbitmq

cf allow-access travel-client travel-service --protocol tcp --port 8080
cf allow-access travel-gateway travel-service --protocol tcp --port 8080
cf allow-access travel-gateway travel-client --protocol tcp --port 8080
cf allow-access travel-gateway travel-ui --protocol tcp --port 8080
```
## deploy
```
mvn clean package
cf push
```
## test

https://travel-gateway.cfapps.io/travel-ui/greeting   
https://travel-gateway.cfapps.io/travel-client/destinations   
https://travel-gateway.cfapps.io/travel-service/destinations   

## update config

To test `spring cloud config`, modify and commit `spring-cloud-config/application.yml` and reload all apps by issuing:

```
curl -X POST https://travel_gateway/bus/refresh
```


## credits

https://github.com/christophe-f/pws-c2c
