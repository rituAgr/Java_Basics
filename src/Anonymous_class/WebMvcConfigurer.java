package Anonymous_class;

public interface WebMvcConfigurer {
    default void addCorsMappings(CorsRegistry registry) {
    }
}
