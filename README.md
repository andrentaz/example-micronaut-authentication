# Micronaut Authentication
A simple POC to test AWS Cognito authentication in a Micronaut's microservice.

## Running
Just clone this project and open it in your favorite IDE (IntelliJ IDEA recommended). If you go with
 IntelliJ's remember to enable annotation processing to be able to run the project in the IDE environment. 
Once all the gradle ependencies are installed, simply run the project with:

```bash
./gradlew run 
```

Or you can simply play it in your IDE. 

### Enviroment Variables
You need to configure some envvars before you can run the project. Namely:
```bash
export OAUTH_CLIENT_ID=XXXXXXXXXX
export COGNITO_REGION=us-east-X
export COGNITO_POOL_ID=us-east-X_XXCCCAZZZ
```

You can either define this in the runtime in your terminal, or you can hard code it in your 
`application.yml` (remember to be super careful with the those!).

## Example
```bash
curl -X GET http://localhost:8080/api/users/me -H "Authorization: Bearer <jwt-token>"
{
    ...
    "cognito:groups":["xxxx"],
    "email_verified":true,
    "iss":"https://cognito-idp.aws-region.amazonaws.com/aws-cognito-user-pool",
    "cognito:username":"cognito_abcdef",
    ...
    "token_use":"id",
    "auth_time":1587655854,
    "name":"John Doe",
    "exp":1587659454000,
    "iat":1587655854000,
    "email":"john.doe@example.com"
}
```

## References
- [Secure Micronaut App with Cognito](https://guides.micronaut.io/micronaut-oauth2-cognito/guide/index.html)
- [Micronaut JWT Authentication](https://guides.micronaut.io/micronaut-security-jwt-kotlin/guide/index.html)
