package dev.rjma.undertow.micrometer.spring;

import io.undertow.server.handlers.MetricsHandler;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.web.embedded.undertow.UndertowDeploymentInfoCustomizer;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class UndertowMetricsAutoConfiguration {
    @Bean
    UndertowDeploymentInfoCustomizer undertowDeploymentInfoCustomizer() {
        return deploymentInfo -> deploymentInfo.addOuterHandlerChainWrapper(MetricsHandler.WRAPPER);
    }
}
