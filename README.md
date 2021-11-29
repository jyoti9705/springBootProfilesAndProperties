# springBootProfilesAndProperties

1. @Profile
    1. Can be used to identify which component can be used to create beans , if there are multiple classes implementing
       the interface class
    2. we can add @Profile annotation on the top of class and add the profile name
    3. From application.properties file we can specify the profile we need
    4. SpringBootApplication will inject bean as per profile and provide the object
    5. We can make use of @Profile annotation along with both @Component and @Bean
2. @PropertySource
    1. If we are creating new properties file , we will have to tell application to path from where we need to load the
       new .properties file
    2. Any property specified in application.properties are by default loaded by the application
    3. Only for new custom created properties file we need to specify the location
3. Environment specific properties file
    1. Environment specific properties file are required because each environment will have separate configurations
    2. Each Environment will have different databases
    3. We can make use of Environment Specific property file by specifying the profile name in spring.profiles.active
4. Control port number using command arguments
    1. Environment specific arguments can be controlled using Arguments
    2. We can also make use of the environment variables
    3. Environment variables less priority over arguments
    4. Environment specific properties file will have priority over normal application.properties
    5. Arguments > EnvironmentVariables > EnvironmentSpecific application.properties > common application.properties
5. YML
   1. Yet another Markup Language
   2. YML and properties are same , depends upon us what we want to use
   3. YML makes it easy to write properties , in readable english format
   4. We can combine  2 yml using --- which indicates one yml file as ended, we can specify profile name for it  using spring.profiles
   