# java projects
1. Job Application Portal
Technologies: Java 21, Spring Boot, Spring MVC/Web, JSP, JSTL, Apache Tomcat, Maven, Lombok
•	Developed a web-based Job Application Portal using Spring Boot to manage job-related application workflows.
•	Implemented MVC-based request handling and server-side JSP views for presenting application data and user interactions.
•	Configured JSP/JSTL support and embedded Jasper for JSP rendering within the Spring Boot application.
•	Used Maven for dependency management and project build automation, with Lombok to reduce boilerplate code.

2. Quiz Application
Technologies: Core Java, OOP, Arrays, Scanner, Classes and Objects
•	Developed a console-based Java Quiz Application containing multiple-choice Java programming questions.
•	Implemented Question and QuestionService classes to organize quiz data, options, user selections, and answer validation.
•	Used arrays and object-oriented programming concepts to manage questions and user responses.
•	Implemented score calculation by comparing the user's selected answers with the correct answers.

3. Job Application Portal – JPA Version
Technologies: Java 21, Spring Boot, Spring Data JPA, PostgreSQL, Spring Web MVC, Maven, Lombok
•	Developed a backend application for a Job Application Portal using Spring Boot and Spring Data JPA.
•	Used JPA-based persistence to map Java entities to relational database tables and simplify database operations.
•	Integrated PostgreSQL as the runtime database and configured the application using Maven-managed dependencies.
•	Applied layered backend development concepts suitable for CRUD-based job and application management.

4. Job Application Portal – REST API
Technologies: Java 21, Spring Boot, Spring Data REST, Spring Data JPA, PostgreSQL, Maven, Lombok
•	Developed a REST-oriented Job Application Portal backend using Spring Boot and Spring Data REST.
•	Used Spring Data JPA for persistence and PostgreSQL for storing application data.
•	Exposed repository-based REST endpoints to support backend data access with reduced controller boilerplate.
•	Structured the application as a Maven-based Spring Boot project and used Lombok to simplify Java model code.

5. Job Application Portal with Spring Security
Technologies: Java 21, Spring Boot, Spring Security, Spring Data JPA, PostgreSQL, Spring MVC, Maven, Lombok
•	Enhanced the Job Application Portal with Spring Security to provide an authenticated and protected application layer.
•	Integrated Spring Security with Spring Boot and JPA-based persistence for secure access to application resources.
•	Configured PostgreSQL for persistent application data and used Spring MVC for web request handling.
•	Applied backend security concepts including authentication/authorization configuration and protected application endpoints.

6. Secure Login Form
Technologies: Java 21, Spring Boot, Spring Security, Spring Data JPA, PostgreSQL, Spring MVC, Maven, Lombok

7.The **RAG PDF Reader** is a Spring Boot-based application that allows users to upload PDF documents and ask questions about their content using natural language. The project uses **Retrieval-Augmented Generation (RAG)** to provide answers based on information stored inside the uploaded PDFs.

The application is developed using **Java 17, Spring Boot, Spring AI, OpenAI, PostgreSQL, and pgvector**. It does not require Docker Compose; PostgreSQL and pgvector can be installed and configured directly on the local system.

When a user uploads a PDF, the application extracts its text using Spring AI's PDF document reader. The extracted content is converted into vector embeddings using an OpenAI embedding model. These embeddings, along with the document content and metadata, are stored in a PostgreSQL database using the pgvector extension.

When the user asks a question, the application converts the question into an embedding and performs a similarity search in pgvector. The most relevant sections of the PDF are retrieved. These sections are then added to the user's question as context and sent to an OpenAI language model through Spring AI.

The language model generates a natural-language response using the retrieved PDF information. If the required information is not available in the document, the application can respond that the answer could not be found in the PDF.

The project exposes REST APIs for PDF uploading and question answering. The main components include a PDF controller, RAG service, Spring AI configuration, PostgreSQL database, and pgvector vector store.

Overall, this project demonstrates how **RAG, vector databases, embeddings, LLMs, and Spring Boot** can be combined to build an intelligent document question-answering system. It can be extended with multiple PDFs, document-specific search, authentication, chat history, source citations, and a web-based user interface.

