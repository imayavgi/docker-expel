docker build -t imaya-first_docker_friendly_hello .
docker tag  imaya-first_docker_friendly_hello imayakulo/imaya-learn-docker:part2
docker push imayakulo/imaya-learn-docker:part2
docker run -p 4000:80 imayakulo/imaya-learn-docker:part2
