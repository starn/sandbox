package fr.starn.sandbox;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by steph on 06/12/2022.
 */
@Configuration
public class TestConfig {
    @Bean(name="testInjectedByName")
    public TestInjected defaultFile() {
        return new TestInjected("mon test");
    }

    @Bean(name="testInjectedByName2")
    public TestInjected defaultFile2() {
        return new TestInjected("mon test2");
    }
}
