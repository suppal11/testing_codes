Feature: print hello world feature
Scenario: Hello World sceanrio
* print 'hello world' 
* print 'Shivani Uppal' 

Scenario: Declaring and print variables
* def bal = 200
* def bal2 = 2000
* print 'total ->' + (bal + bal2)

Scenario: JSON Object
* def jsonobj = 
"""
[
{
"name":"Tom",
"city":"Bangalore"
},
{
"name":"Peter",
"city":"Pune"
}
]
"""

* print jsonobj
* print jsonobj[0].name + " "+ jsonobj[0].city

Scenario: Complicated JSON

* def jsonobj = 
"""
{
	"id": "0001",
	"type": "donut",
	"name": "Cake",
	"ppu": 0.55,
	"batters":
		{
			"batter":
				[
					{ "id": "1001", "type": "Regular" },
					{ "id": "1002", "type": "Chocolate" },
					{ "id": "1003", "type": "Blueberry" },
					{ "id": "1004", "type": "Devil's Food" }
				]
		},
	"topping":
		[
			{ "id": "5001", "type": "None" },
			{ "id": "5002", "type": "Glazed" },
			{ "id": "5005", "type": "Sugar" },
			{ "id": "5007", "type": "Powdered Sugar" },
			{ "id": "5006", "type": "Chocolate with Sprinkles" },
			{ "id": "5003", "type": "Chocolate" },
			{ "id": "5004", "type": "Maple" }
		]
}

"""

* print jsonobj.batters.batter[1].id

Scenario: get user details with baseurl

Given url baseUrl+'/public/v2/users'
And path '2704'
When method GET
Then status 200
* print response
* def x = response.name
* print x
* match x == 'Gov. Shreya Kapoor'


Scenario: get user details-not available

Given url 'https://gorest.co.in/public/v2/users'
And path '1'
When method GET
Then status 404

Scenario: get API with query parameters

* def query = {status:'active',gender :'male',id:2114}
Given url baseUrl+'/public/v2/users'
And params query
When method GET
Then status 200
* print response

Scenario: get API with query parameters

* def query = {status:'active'}
Given url baseUrl+'/public/v2/users'
And params query
When method GET
Then status 200
* def jresponse = response
* print jresponse

Scenario: headers with url Part1
Given header Content-Type = 'text/xml;charset=ISO-8859-1'
And header Accept-Encoding = 'gzip,deflate'
And header Connection = 'Keep-Alive'
And header Expect = '100-continue'
And header User-Agent = 'Mozilla/4.0(compatible;IE;GACv7\. 1\. 5192\. 22378)'
And header Authorization = 'Bearer 007526d9efdbc07e084ff7a6d4cfcc90588fbe20641c00faebf45a7f3b2eaf33'

When url baseUrl+'/public/v2/users'
And path '2704'
When method GET
Then status 200
* print response
* def x = response.name
* print x
* match x == 'Chaitan Nehru'


Scenario: headers with key value pairs Part2
* def header_1 = {Content-Type:'text/xml;charset=ISO-8859-1',Connection:'Keep-Alive',User-Agent:'Mozilla/4.0(compatible;IE;GACv7\. 1\. 5192\. 22378)',Authorization:'Bearer 007526d9efdbc07e084ff7a6d4cfcc90588fbe20641c00faebf45a7f3b2eaf33'}

Given headers header_1
When url baseUrl+'/public/v2/users'
And path '2704'
When method GET
Then status 200
* print response
* def x = response.name
* print x
* match x == 'Chaitan Nehru'

Scenario: headers with key value pairs Part3
* configure headers = {Content-Type:'text/xml;charset=ISO-8859-1',Connection:'Keep-Alive',User-Agent:'Mozilla/4.0(compatible;IE;GACv7\. 1\. 5192\. 22378)',Authorization:'Bearer 007526d9efdbc07e084ff7a6d4cfcc90588fbe20641c00faebf45a7f3b2eaf33'}
When url baseUrl+'/public/v2/users'
And path '2704'
When method GET
Then status 200
* print response
* def x = response.name
* print x
* match x == 'Chaitan Nehru'

Scenario: get user details
* print tokenID
Given header Authorization = 'Bearer '+tokenID
When url baseUrl+'/public/v2/users'
And path '2704'
When method GET
Then status 200
* print response
* def x = response.name
* print x
* match x == 'Chaitan Nehru'

