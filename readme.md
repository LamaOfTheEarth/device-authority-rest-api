# Device Authority devices APIs

This is a simple application developed for device authority's tech task.

## Prerequisites 
Maven needs to be installed

Java 17 sdk needs to be installed

## Run the app
This will load the data defined in schema.sql cleanly every time the application is restarted.

```mvn spring-boot:run```

## Access the API
The api can be accessed through postman on url localhost:8080

There is an basic authorisation.
Check application.properties for hardcoded username and password to access these APIs.

## Rest API
The base url is /api/devices

## List all Devices API

### Request
`GET \list`

    localhost:8080/api/devices/list
    Content-Type: application/json

### Response
Example Response would look like this
```JSON
[
    {
        "deviceId": "05f86347-44c3-49dd-ba72-85bc6047a6c1",
        "accountNo": "009722008",
        "osName": "Ubuntu",
        "osVersion": "20.04",
        "platform": "linux",
        "state": 1,
        "creationTime": "2020-10-01 10:08:50",
        "updateTime": "2020-10-01 10:08:50"
    }
]
```

### Request
`POST \add`

    localhost:8080/api/devices/add
    Content-Type: application/json

```JSON
{
  "accountNo":"009722012",
  "osName":"Ubuntu",
  "osVersion":"22.01",
  "platform":"linux",
  "state":"0",
  "creationTime":"2020-10-01 11:08:50",
  "updateTime":"2020-10-01 11:08:50"
}
```

### Response
Example Response would look like this
```JSON
{
  "deviceId": "05f86347-44c3-49dd-ba72-85bc6047a6c1",
  "accountNo":"009722012",
  "osName":"Ubuntu",
  "osVersion":"22.01",
  "platform":"linux",
  "state":"0",
  "creationTime":"2020-10-01 11:08:50",
  "updateTime":"2020-10-01 11:08:50"
}
```

### Request
`PUT \edit?deviceId={deviceId}&accountNo={accountNo}`

    localhost:8080/api/devices/edit?deviceId=&accountNo=
    Content-Type: application/json

The Request can edit just one or multiple fields
```JSON
{
  "accountNo":"009722012",
  "osName":"Ubuntu",
  "osVersion":"22.01",
  "platform":"linux",
  "state":"1",
  "creationTime":"2020-10-01 11:08:50",
  "updateTime":"2020-10-01 11:08:50"
}
```
or 
```JSON
{
  "state":"0"
}
```

### Response
Example Response would look like this
```JSON
{
  "deviceId": "05f86347-44c3-49dd-ba72-85bc6047a6c1",
  "accountNo":"009722012",
  "osName":"Ubuntu",
  "osVersion":"22.01",
  "platform":"linux",
  "state":"1",
  "creationTime":"2020-10-01 11:08:50",
  "updateTime":"2020-10-01 11:08:50"
}
```
or with the second request 
```JSON
{
  "deviceId": "05f86347-44c3-49dd-ba72-85bc6047a6c1",
  "accountNo":"009722012",
  "osName":"Ubuntu",
  "osVersion":"22.01",
  "platform":"linux",
  "state":"0",
  "creationTime":"2020-10-01 11:08:50",
  "updateTime":"2020-10-01 11:08:50"
}
```

### Request
`DELETE \delete?deviceId={deviceId}&accountNo={accountNo}`

    localhost:8080/api/devices/delete?deviceId=&accountNo=
    Content-Type: application/json

Delete will remove the record with matching device id and account number

### Response

HTTP STATUS 200 OK


