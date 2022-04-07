# Products MS

## Endpoints

### Save Product

``` 
POST /products HTTP/1.1
Host: localhost:3333
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVVzZXJuYW1lIQ==
Content-Type: application/json
Cookie: JSESSIONID=A83B4E3AF8017CBA462C77733BCE98E6
Content-Length: 49

{
    "name": "test1",
    "price": "subtitle1"
}    
```

### Get All Products

```
GET /products HTTP/1.1
Host: localhost:3333
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
Cookie: JSESSIONID=A83B4E3AF8017CBA462C77733BCE98E6
```

### Delete Product

```
DELETE /api/courses/4 HTTP/1.1
Host: localhost:3333
Authorization: Basic cmFuZG9tU2VjdXJlS2V5VXNlcm5hbWUhOnJhbmRvbVNlY3VyZUtleVBhc3N3b3JkIQ==
Cookie: JSESSIONID=A83B4E3AF8017CBA462C77733BCE98E6
```