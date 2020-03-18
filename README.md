# Kweb on Google App Engine flexible environment with Docker

This is a [Kweb](https://github.com/kwebio/kweb-core) hello world app to get started on Google App Engine
flexible environment. The Dockerfile was taken from [the ktor sample](https://ktor.io/quickstart/quickstart/docker.html).

To run locally (docker must be installed):
```bash
./gradlew build
docker build -t helloworld .
docker run -m512M --cpus 2 -it -p 8080:8080 --rm helloworld
```

To deploy (`gcloud` must be configured):
```bash
./gradlew build
gcloud app deploy
```

This repository may be bloated with unnecessary code, and be poorly organised, I simply got it to work and stopped 🙃.
