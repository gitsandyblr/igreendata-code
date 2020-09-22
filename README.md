# igreendata-code

The micro service gives you a list of accounts and transactions on a particular account.

How to use:

1. git clone git@github.com:gitsandyblr/igreendata-code.git
2. Run the commands
    a. gradle clean build
    b. gradle bootRun
3. Open postman and hit the url's
    a. https://localhost:8443/v1/getAccountList
    b. https://localhost:8443/v1/getAccountTransaction?accountNumber=<accountnumber>
    


About the microservice:

    1. The H2 db is used for storing pre loaded data
    2. application is dockerized       
    