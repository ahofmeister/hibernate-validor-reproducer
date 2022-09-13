curl --location --request POST 'localhost:8080/orders' \
--header 'Authorization: Basic YWRtaW46YWRtaW4=' \
--header 'Content-Type: application/json' \
--data-raw '{
    "customer": {
        "firstName": null
    },
    "productId": "25Yc0E"
}'