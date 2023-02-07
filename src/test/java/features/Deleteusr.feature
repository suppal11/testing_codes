Feature: Delete user -->create /delete/get

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

  Scenario: Delet a user with the given data
  #cerate user by post method
    Given path '/public/v1/users'
    And request requestPayload
    And header Authorization = 'Bearer ' + tokenID
    When method post
    Then status 201
    And match $.data.id == '#present'
    
    #2.fetch the user id 
    * def userid == $.data.id
    * print userid
    
    #3, delete the same user
    
    Given path '/public/v1/users/' + userid
    And header Authorization = 'Bearer ' + tokenID
    When method delete
    Then status 204
    
    #4.get he same user with the same userid---not found
    
    Given url baseurl+'/public/v1/users/' + userid
    When method GET
    Then status 404
    And match $.data.message == 'Resource not found'
    
    
    