FROM node:10

WORKDIR /usr/scr/app

COPY package.json .//

RUN npm install

COPY ./ ./

CMD ["node","server.js"]