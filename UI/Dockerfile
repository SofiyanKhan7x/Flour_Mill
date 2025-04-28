# Stage 1: Build the React app
FROM node:16 AS build

# Set the working directory for your React app
WORKDIR /app

# Install dependencies
COPY package*.json ./
RUN npm install

# Copy the rest of the frontend code from the UI folder
COPY ./UI ./

# Build the React app
RUN npm run build

# Stage 2: Serve the React app with Nginx
FROM nginx:alpine

# Copy the built React app from the build stage
COPY --from=build /app/build /usr/share/nginx/html

# Expose port 80 for the frontend
EXPOSE 80

# Use the default Nginx config to serve the app
CMD ["nginx", "-g", "daemon off;"]
