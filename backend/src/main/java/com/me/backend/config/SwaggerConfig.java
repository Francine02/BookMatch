package com.me.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customAPI() {
        return new OpenAPI()
                .addServersItem(new Server().url("http://localhost:8080").description("Servidor de Desenvolvimento"))
                .info(new Info()
                        .title("BookMatch")
                        .version("1.0.0")
                        .description(
                                "O BookMatch é uma plataforma personalizada de recomendações de livros que conecta leitores a obras que atendem seus gostos e interesses.")
                        .license(new License()
                                .name("Apache License 2.0")
                                .url("https://github.com/Francine02/BookMatch/blob/main/LICENSE")));
    }
}