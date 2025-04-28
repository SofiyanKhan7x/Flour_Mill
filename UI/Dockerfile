# Use a base image with Node.js
FROM node:18 AS frontend

# Set working directory inside the container
WORKDIR /app

# Install dependencies
COPY ./UI/package*.json ./
RUN npm install

# Copy the entire UI folder content after installing dependencies
COPY ./UI ./UI

# Install polyfills if necessary (for crypto)
RUN npm install crypto-browserify

# Build the frontend app
RUN npm run build

# Use Nginx to serve the app
FROM nginx:alpine
COPY --from=frontend /app/dist /usr/share/nginx/html
