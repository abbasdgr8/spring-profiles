# spring-profiles
Some (very simple) Spring profiles.

Releases are hosted over at [bintray](https://bintray.com/capgeminiuk/maven/spring-profiles/view).  Licence is Apache v.2.0.

Use these as follows:

In your "default" Spring component:

    import org.springframework.context.annotation.Profile;
    
    import static com.capgemini.spring.profiles.SpringProfiles.DEFAULT_PROFILE_NAME;
    ...
    @Profile({DEFAULT_PROFILE_NAME})
    public class MyProdService {

And then in a stub-equivalent Spring component:

    import org.springframework.context.annotation.Profile;
    
    import static com.capgemini.spring.profiles.SpringProfiles.;
    ...
    @Profile(STUBBED_PROFILE_NAME)
    public class MyStubbedService {

Read more on Spring Profiles and what you can do with them in the [Spring Docs](http://docs.spring.io/autorepo/docs/spring-boot/current/reference/html/boot-features-profiles.html).
