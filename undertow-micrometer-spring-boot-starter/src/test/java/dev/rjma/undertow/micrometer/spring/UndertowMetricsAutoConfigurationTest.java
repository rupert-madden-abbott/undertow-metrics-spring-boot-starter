package dev.rjma.undertow.micrometer.spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.WebApplicationContextRunner;

class UndertowMetricsAutoConfigurationTest {

    private final WebApplicationContextRunner contextRunner = new WebApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(UndertowMetricsAutoConfiguration.class));

    @Test
    void shouldLoadAutoConfiguration() {
        contextRunner.run(context -> {
            context.getBean(UndertowMetricsAutoConfiguration.class);
        });
    }
}