package Anonymous_class;

public class AnonymousClassImpl {

    public WebMvcConfigurer WebMvcConfigurerBean() {

        return new WebMvcConfigurer(){
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.corsRegistryfunc1();
                registry.corsRegistryfunc2();
            }
        };
    }

}
