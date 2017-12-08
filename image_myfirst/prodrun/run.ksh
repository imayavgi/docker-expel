# run the redis container. Name of the container needs to be redis for the sample app to connect to
docker run --name redis -d --network=webnet redis

# run the sample app container
# docker run -p 4000:80 -itd --name myfirst_docker_friendly_hello --network=webnet imayakulo/imaya-learn-docker:part2
#

# run samlpe application as service service
docker stack deploy -c ../service/docker-compose.yml imaya-first_docker_friendly_hello-service
# notice the _web added to service name
docker service ps imaya-first_docker_friendly_hello-service_web
docker container ls -q
