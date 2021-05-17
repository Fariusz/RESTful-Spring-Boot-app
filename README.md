**RESTful Spring Boot app**
----
Implements algorithms and return results based on given integer number.

* **Available endpoints**

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

* **Sample Call:**

  <_Just a sample call to your endpoint in a runnable format ($.ajax call or a curl request) - this makes life easier and more predictable._>

* **Notes:**

  <_This is where all uncertainties, commentary, discussion etc. can go. I recommend timestamping and identifying oneself when leaving comments here._> 