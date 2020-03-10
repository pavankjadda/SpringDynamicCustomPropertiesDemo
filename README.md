# Spring Dynamic Custom Properties Demo

1. Define the placeholder in custom properties file ex. email.properties
  ```
  to=${to_email}
  from="from@example.com"
  replyTo="replyTo@example.com"
  ```
2. Use the format to pass custom values to Spring Boot application
  ```
  $ java -jar app.jar -Dto_email=jdoe@example.com -Ddb_username=db_admin -Ddb_password=<password>
  ```
3. Define EmailPropertiesConfig class and autowire Environment class. Create EmailProperties class and bean as shown below
  ```
  @PropertySource(value = "classpath:email.properties")
  @Configuration
  @Data
  public class EmailPropertiesConfig
  {
    private Environment environment;

    @Autowired
    public EmailPropertiesConfig(Environment environment)
    {
      this.environment = environment;
    }

    @Bean
    public EmailProperties emailProperties()
    {
      EmailProperties emailProperties=new EmailProperties();
      emailProperties.setTo(environment.getProperty("to",""));
      emailProperties.setFrom(environment.getProperty("from",""));
      emailProperties.setReplyTo(environment.getProperty("replyTo",""));
      return emailProperties;
    }
  }
  ```
