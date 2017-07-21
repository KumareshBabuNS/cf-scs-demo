# cf-scs-demo
```
cf create-service p-service-registry standard service-registry
cf create-service p-circuit-breaker-dashboard standard circuit-breaker
cf create-service p-config-server standard config-server -c '{"git": { "uri": "https://github.com/vchrisb/cf-scs-demo", "searchPaths": "spring-cloud-config"}}'

cf allow-access frontend backend --protocol tcp --port 8080
cf allow-access gateway backend --protocol tcp --port 8080
cf allow-access gateway frontend --protocol tcp --port 8080
```

https://random_route/travel-client/destinations
