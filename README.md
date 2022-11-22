# Whatsapp BusinessApi Integration Application
Send and receive messages using a cloud-hosted version of the WhatsApp Business Platform. The Cloud API allows you to implement WhatsApp Business APIs without the cost of hosting of your own servers and also allows you to more easily scale your business 
messaging. Using the API, businesses can build systems that connect thousands of customers with agents or bots, enabling both programmatic and manual communication.

# Cloud API
curl -X POST \
'https://graph.facebook.com/v15.0/FROM_PHONE_NUMBER_ID/messages' \
-H "Authorization: ACCESS_TOKEN" \
-d '{
"messaging_product": "whatsapp",
"to": "1650XXXXXXX",
"text": {"body" : "hi"}
}'

### Get Started With the WhatsApp Business Cloud API
To send and receive a first message using a test number, complete the following steps:

1. Set up developer assets and platform access
2. Send a test message
3. Configure a Webhook
4. Receive a test message

#### 1. Set up Developer Assets and Platform Access

First need to set up a Meta developer account and a Meta developer app. To set that up:

1. Register as a Meta Developer
2. Enable two-factor authentication for your account
3. Create a Meta App: Go to developers.facebook.com > My Apps > Create App. Select the "Business" type and follow the prompts on your screen.


####  2. Send a Test Message
In the WhatsApp > Getting Started (or Setup) panel:

* Select your test phone number in the From field.
* curl url for send message 

```java
curl -i -X POST \
  https://graph.facebook.com/v15.0/105954558954427/messages \
  -H 'Authorization: Bearer EAAFl...' \
  -H 'Content-Type: application/json' \
  -d '{ "messaging_product": "whatsapp", "to": "15555555555", "type": "template", "template": { "name": "hello_world", "language": { "code": "en_US" } } }'

```
* Enter the recipient phone number you would like to message in the To field            
* select template
* finally send a message

```java
https://developers.facebook.com/docs/messenger-platform/send-messages/templates
*********** Get all template list *****************
        curl --location -g --request GET '{{URL}}/api/v1/getMessageTemplates' \
        --header 'Authorization: Bearer {{token}}' \
        --form 'pageSize="10"' \
        --form 'pageNumber="1"'
        
        
*********** sample template : 1 *******************
curl --location -g --request POST 'https://graph.facebook.com/{{Version}}/{{Phone-Number-ID}}/messages' \
        --header 'Authorization: Bearer {{User-Access-Token}}' \
        --header 'Content-Type: application/json' \
        --data-raw '{
        "messaging_product": "whatsapp",
        "to": "{{Recipient-Phone-Number}}",
        "type": "template",
        "template": {
        "name": "sample_shipping_confirmation",
        "language": {
        "code": "en_US",
        "policy": "deterministic"
        },
        "components": [
        {
        "type": "body",
        "parameters": [
        {
        "type": "text",
        "text": "2"
        }
        ]
        }
        ]
        }
        }'
```


#### 3. Configure a Webhook

first you need to create the endpoint. You can create a custom Webhook URL running on a web server, or use services that help you set up an endpoint, such as Glitch. See Create a Sample App Endpoint for Webhooks Testing for help.
Once your endpoint is ready, go to your App Dashboard.

In your App Dashboard, find the WhatsApp product and click Configuration. Then, find the webhooks section and click Configure a webhook. After the click, a dialog appears on your screen and asks you for two items:

* Callback URL: This is the URL Meta will be sending the events to. See the Webhooks, Getting Started guide for information on creating the URL.
* Verify Token: This string is set up by you, when you create your webhook endpoint.
After adding the information, click Verify and Save.

#### 4. Receive a test message
Now that your Webhook is set up, send a message to the test number you have used. You should immediately get a Webhooks notification with the content of your message!



