# Build a Secure Java Application with OAuth2 in 5 Minutes

This example shows how to use Okta's Authentication API with Java.

Please read [OAuth 2.0 Java Guide: Secure Your App in 5 Minutes](https://developer.okta.com/blog/2019/10/30/java-oauth2) for a tutorial that shows you how to build this application.

**Prerequisites:** [Java 8](https://adoptopenjdk.net/)

> [Okta](https://developer.okta.com/) has Authentication and User Management APIs that reduce development time with instant-on, scalable user infrastructure. Okta's intuitive API and expert support make it easy for developers to authenticate, manage and secure users and roles in any application.

* [Getting Started](#getting-started)
* [Help](#help)
* [Links](#links)
* [License](#license)

## Getting Started

To install this example application, run the following commands:

```bash
git clone https://github.com/oktadeveloper/okta-java-oauth-example.git
```

This will get a copy of the project locally. 

### Create a Free Okta Developer Account

If you don't have one, [create an Okta Developer account](https://developer.okta.com/signup/). After you've completed the setup process, log in to your account.

* Click on **Applications** > **Add Application**
* Select **Web** and click **Next**

Fill in the following options in the form:

- Name: `hello-world`
- Base URIs: `http://localhost:8080`
- Login redirect URLs: `http://localhost:8080/login/oauth2/code/okta`
- Grant Type allowed:
  - Client Credentials
  - Authorization Code
  
* Click **Done**.

Create an `okta.env` in the root directory of the project and specify your app settings.

```
export OKTA_OAUTH2_ISSUER=https://{yourOktaDomain}/oauth2/default
export OKTA_OAUTH2_CLIENT_ID={CLIENT_ID}
export OKTA_OAUTH2_CLIENT_SECRET={CLIENT_SECRET}
```

You will find `{CLIENT_ID}` and `{CLIENT_SECRET}` in the application's page from the Okta dashboard.

### Start the application

Run the following commands to start your app.

```
source okta.env
mvn spring-boot:run
```

That's it! Navigate to `http://localhost:8080` to log in.

## Links

This example uses the following libraries provided by Okta:

* [Okta Spring Boot Starter](https://github.com/okta/okta-spring-boot)

## Help

Please post any questions as comments on [this repo's blog post](https://developer.okta.com/blog/2019/10/30/java-oauth2), or use our [Okta Developer Forums](https://devforum.okta.com/).

## License

Apache 2.0, see [LICENSE](LICENSE).
