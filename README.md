# cf-scs-demo

cf create-service p-service-registry standard service-registry
cf create-service p-circuit-breaker-dashboard standard circuit-breaker


cf allow-access frontend backend --protocol tcp --port 8080
cf allow-access gateway backend --protocol tcp --port 8080
cf allow-access gateway frontend --protocol tcp --port 8080


https://<random route>/travel-client/destinations