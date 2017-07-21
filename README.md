# cf-scs-demo
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


https://random_route/travel-ui/greeting   
https://random_route/travel-client/destinations   
https://random_route/travel-service/destinations   


Based on this work: https://github.com/christophe-f/pws-c2c