Survey Application (Spring Boot + Angular)This is a simple full-stack survey application built with a Spring Boot backend and an Angular frontend. It allows users to submit a survey form and view all submitted responses on a dashboard.The application is designed to be simple and does not use a database. All survey responses are stored in-memory on the backend and will be reset when the backend server restarts.Project StructureSERVEY-APP/
├── backend/      # Spring Boot Application
└── frontend/     # Angular Application
How to Run the ApplicationYou will need to run two separate processes in two separate terminals.1. Run the Backend (Spring Boot)Navigate to the backend directory:cd SERVEY-APP/backend
Run the application using the Maven wrapper:./mvnw spring-boot:run
The backend server will start on http://localhost:8080.2. Run the Frontend (Angular)Prerequisites: Ensure you have Node.js and the Angular CLI installed.Navigate to the frontend directory:cd SERVEY-APP/frontend
Install the necessary dependencies:npm install
Start the development server:ng serve
Open your browser and navigate to http://localhost:4200. The application will be running there.API EndpointsThe backend provides the following REST endpoints:GET /api/surveys: Retrieves a list of all submitted survey responses.POST /api/surveys: Submits a new survey response. Expects a JSON body with the survey data.