﻿﻿Befor testing any API you must login with the default credential :


HTTP METHOD	     | URI | Action | Input | Ouput
| -------------- | ----| ------ | ----- |-----|
| POST | http://localhost:8080/  |login|{username=talan, password=academy}|Headers:Authorization: Bearer JWT|


Description of "API REST Candidate" :

 
HTTP METHOD	     | URI | Action | Input | Ouput
| -------------- | ----| ------ | ----- |-----|
| GET | http://localhost:8080/candidates?search=lastName:kamm| gett candidates by criteria | criteria | list of candidates|
| POST| http://localhost:8080/candidates/update| update candidate | candidate | new candidate |

pour la création et la modification du candidat:
```
{

      
"statut": "bientôt",
      
"civility": "Monsieur",
      
"firstName": "mohamed",
      
"lastName": "xxxxxxxxxx",
      
"phoneNumber": "48587878",
      
"mail": "aziz.hammami@yahoo.com",
      
"nationality": "tounsi",
      
"dateOfBithday": "1969-12-31T23:00:00.000+0000",
      
"typeIdentityPiece": "passport",
      
"expirationIdentityPiece": "2049-12-31T23:00:00.000+0000",
      
"numIdentityPiece": "54zfezf",
      
"dateFirstExperience": "2009-12-31T23:00:00.000+0000",
      
"entreprise": "SOGIP",
      
"user" : {"mail": "mouna.makni@yahoo.com"},
      
"application": {


          "manager": {"mail": "ons.mahsni@yahoo.com"},

          "source": "cooptant",

          "cooptedBy": { "mail": "ahmed.riahi@yahoo.com"},

          "applicationDate": "2017-12-31T23:00:00.000+0000",

          "disponibilityDate": "2019-06-19T23:00:00.000+0000",

          "curriculumVitae": null,

          "interview": [

              {

                  "interviewDate": "2019-07-01",

                  "interviewWith": {"mail": "mouna.makni@yahoo.com"},

                  "interviewType": "xxxx",

                  "businessUnit": "xxxxxxx",

                  "jobOffer": "1000000"

              }

          ]

      },

      "diploma": {


          "formation": "bac+6",

          "university": {
              "id": 1

          }
      }
  }
```

Description of "API REST University :

HTTP METHOD	     | URI | Action | Input | Ouput
| -------------- | ----| ------ | ----- |-----|
| GET | http://localhost:8080/university| gett all university | ---- | list of university |
| POST| http://localhost:8080/university| create university | university | new university |
| DELETE | http://localhost:8080/university/{id}| delete university by id | id|  university deleted|

pour la création d'une université :
```
{
        "universityName": "université d'angers"
        
    }
```




pour ajouter le plugin Lombock à eclipse veuillez  suivre les étapes suivantes : 
1- download lombock à partir ce lien : 
https://projectlombok.org/download
2- executer ce fichier.jar, vous remarquez que votre IDE est détecter automatiquement, veuillez cliquer sur "Install/Update"



HTTP METHOD	     | URI | Action | Input | Ouput
| -------------- | ----| ------ | ----- |-----|
| GET | http://localhost:8080/applications/${mail}/interviews | gett interviews by candidate Email | ---- | list of interviews| 