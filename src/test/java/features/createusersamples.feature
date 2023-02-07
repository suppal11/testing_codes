Feature: Create user using post api

  Background: 
    * url 'https://gorest.co.in'
    * def rs =
      """
      function(s)
      {
      var txt="";
      var pattern="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
      for(var i=0;i<s;i++)
      txt += pattern.charAt(Math.floor(Math.random()*pattern.length()));
      return txt;
      }
      """
    * def randomString = rs(10)
    * print randomString
    * def requestPayload =
      """
      {
             "name": "tom1",
             "gender": "male",
             "status": "active"
         }
      """
    * requestPayload.email = randomString + "@gmail.com"
    * print requestPayload

  Scenario: Create a user with the given data
    Given path '/public/v1/users'
    And request requestPayload
    And header Authorization = 'Bearer ' + tokenID
    When method post
    Then status 201
    And match $.data.id == '#present'
    And match $.data.name == '#present'
    And match $.data.name == 'tom1'
    And match $.data.email == requestPayload.email
