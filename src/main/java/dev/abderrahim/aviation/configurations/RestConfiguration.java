package dev.abderrahim.aviation.configurations;

import dev.abderrahim.aviation.models.Aircraft;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

//@Configuration
public class RestConfiguration implements RepositoryRestConfigurer {
    /*
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Aircraft.class);
        config.setBasePath("/api");
    }
     */
}
