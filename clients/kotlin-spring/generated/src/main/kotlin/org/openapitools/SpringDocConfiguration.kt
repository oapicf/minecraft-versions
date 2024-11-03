package org.openapitools

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.License
import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.security.SecurityScheme

@Configuration
class SpringDocConfiguration {

    @Bean
    fun apiInfo(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .description("SDK for Minecraft versions info")
                    .contact(
                        Contact()
                            .name("Minecraft Versions")
                            .url("https://github.com/oapicf/minecraft-versions")
                            .email("blah+oapicf@cliffano.com")
                    )
                    .license(
                        License()
                            .name("MIT")
                                                )
                    .version("0.12.1-pre.0")
            )
    }
}
