Feature: Gradual update 

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
    
    Scenario: update delete

    Given path '/public/v1/users'
    And request requestPayload
    And header Authorization = 'Bearer ' + tokenID
    When method post
    Then status 201
    And match $.data.id == '#present'
    And match $.data.name == '#present'
    And match $.data.name == 'tom1'
    And match $.data.email == requestPayload.email

    #fetch the user id from post call
    * def userid = $.data.id
    * print userid
    #put call to update the user
    
    * def requestPayload = 
	"""
	{
        "status": "inactive",
    }
	
	"""
Given path '/public/v1/users/'+ userid	
And request requestPayload
And header Authorization = 'Bearer ' + tokenID
When method put
Then status 200
And match $.data.id == '#present'
And match $.data.id == userid
And match $.data.name == '#present'
And match $.data.name == 'tom1'


    