**RESTful Spring Boot app**
----
Implements algorithms and return results based on given integer number.

## Quick Start with Dockerhub

1. Pull docker repository

   ```bash
   docker pull 665899617/demo:radek
   ```

1. Run it

   ```bash
    docker run -p 8080:8080 665899617/demo:radek
   ```
   
   **or**

## Start with Docker-compose

1. Clone this repository

   ```bash
   git clone https://github.com/Fariusz/RESTful-Spring-Boot-app
   ```

1. Change directory

   ```bash
    cd RESTful-Spring-Boot-app
   ```

1. Compose docker

   ```bash
   docker-compose up
   ```
   
      **or**


## Start with Java
1. Download demo_app.jar file:<br>

    https://github.com/Fariusz/RESTful-Spring-Boot-app/releases/tag/1.0

1. Change directory
   
   ```bash
   cd /Users/*USERNAME*/Downloads

   ```
1. Run java application

   ```bash
   java -jar demo_app.jar
   ```

<br><br>
4. Run web browser and go to:

   ```bash
   http://localhost:8080/ + endpoint 
   example:
   http://localhost:8080/data
   or: 
   http://localhost:8080/toBinary/55
   ```
## Available endpoints
* **http://localhost:8080**

    * **/data**
      <br>List all the inputs and results from the database.
    * **/toBinary/{N}**
      <br>Return the number in binary system.
    * **/reverseDigits/{N}**
      <br>Reverse the digits (e.g. 0100 to 0010) and return the number in hexadecimal system.
    * **/sortDescending/{N}**
      <br>Move all 1s to the left, and all 0s to the right (e.g. 1010 to 1100) and return the number in decimal.
    * **/switchDigits/{N}**
    <br>Switch digits (1 to 0, 0 to 1, e.g. 1000 to 0111) and return the number in octal system.


*  **URL Params**

   **Required:**

   `N=[non negative integer]`


* **Success Response:**

    * **Code:** 200 <br />
      **Content:** 
     <br> `{ "response": "110111" }` 
     <br> `{ "response" : "10" }`
     <br> `{ "response" : "3b" }`

* **Error Response:**

    * **Code:** 400 BAD REQUEST <br />
      **Content:** <br>`{ "response": "Non negative decimal integers only." }`
      
