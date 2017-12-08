# Use node 4.4.5 LTS
FROM node:8.9.1
ENV LAST_UPDATED 20171605T165400

RUN useradd --user-group --create-home --shell /bin/false unodeapp && npm install --global npm@3.7.5 && npm install sails -g

ENV HOME=/home/unodeapp

# Change working directory
WORKDIR $HOME/messageApp

COPY messageApp .

RUN rm -rf node_modules && npm install && chown -R unodeapp:unodeapp $HOME/*

USER unodeapp

# Expose API port to the outside
EXPOSE 1337

# Launch application
CMD ["sails","lift"]
