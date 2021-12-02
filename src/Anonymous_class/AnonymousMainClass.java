package Anonymous_class;

public class AnonymousMainClass {
    public static void main(String[] args) {
        CorsRegistry r = new CorsRegistry();
        AnonymousClassImpl c = new AnonymousClassImpl();
        c.WebMvcConfigurerBean().addCorsMappings(r);
    }
}
