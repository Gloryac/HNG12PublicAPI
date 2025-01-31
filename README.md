# HNG12 Stage 0 API

This project is a Spring Boot REST API that returns basic information including an email address, current datetime, and GitHub repository URL. It is built as part of the HNG Internship Stage 0 task.

 ## Features
- Returns personal information in JSON format
- Provides current datetime in ISO 8601 format
- CORS enabled for cross-origin requests
- Fast response time (<500ms)
- Built with Spring Boot 

 ## Technology Stack
- Java 17
- Spring Boot 3.2.2
- Maven

## API Specification

### Endpoint

```
GET /
```

### Response Format

```json
{
    "email": "your-email@example.com",
    "current_datetime": "2025-01-30T09:30:00Z",
    "github_url": "https://github.com/yourusername/your-repo"
}
```

### Status Codes

- 200: Successful request
- 500: Server error

## Local Development

1. Prerequisites:
    - Java 17 or higher
    - Latest Maven Version

2. Clone the repository:
```bash
git clone https://github.com/yourusername/your-repo
```

3. Build the project:
```bash
mvn clean install
```

4. Run the application:
```bash
mvn spring-boot:run
```

The API will be available at `http://localhost:8080`

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com.example.HNG12publicapi
│   │          ├── config/
│   │          │   └── CorsConfig.java
│   │          ├── controller/
│   │          │   └── PublicApiController.java
│   │          ├── model/
│   │          │    └── MyInfo.java
│   │          ├──Hng12publicapiApplication
│   └── resources/
│       
```

## Deployment

This API is deployed using Railway and is accessible at:
https://hng12publicapi-production.up.railway.app/

## Looking to Hire Java Developers?

If you're interested in hiring experienced Java developers, check out our talented pool at [HNG Java Developers](https://hng.tech/hire/java-developers)

## License

This project is licensed under the MIT License - see the LICENSE file for details.