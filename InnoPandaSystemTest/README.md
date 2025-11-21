How to Test the APIs

You can test all the APIs using Postman, Thunder Client, REST Client, or cURL.
Make sure your Spring Boot application is running on: http://localhost:8080/students


1. To create a Student
Steps in Postman:
-Select POST
-Enter URL: http://localhost:8080/students
-Go to Body → raw → JSON
-Paste the JSON
   {
   "name": "Adarsh",
   "email": "adarsh@gmail.com",
   "age": 21,
   "className": "CSIT-1"
   }
-Click Send
-------------------------------------------------------------------------------------------

2. Get All Students
-Steps in Postman:
-Select GET
-Enter URL: http://localhost:8080/students
-Click Send

-------------------------------------------------------------------------------------------

3. Get Student by ID
-Steps in Postman:
-Select GET
-Enter URL:
http://localhost:8080/students/{id}

Example:
http://localhost:8080/students/1
-Click Send

-------------------------------------------------------------------------------------------

4. Update a Student
-Steps in Postman:
-Select PUT
-Enter URL:
http://localhost:8080/students/{id}

Example:
http://localhost:8080/students/2

-Go to Body → raw → JSON
-Paste the JSON
{
"name": "Pratyush",
"email": "Pratyush@gmail.com",
"age": 21,
"className": "CSIT-2"
}
-Click Send

-------------------------------------------------------------------------------------------

5. Delete a Student
Steps in Postman:
-Select DELETE
-Enter URL:
http://localhost:8080/students/{id}

Example:
http://localhost:8080/students/1
-Click Send

-------------------------------------------------------------------------------------------

6. Steps in Postman:
-Select GET
-Enter URL:
http://localhost:8080/students/search?name=Adarsh
-Click Send

-------------------------------------------------------------------------------------------




