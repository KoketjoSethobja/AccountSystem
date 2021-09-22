package za.ac.nwu.logic.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.translator.config.TranslatorConfig;

@Import({TranslatorConfig.class})
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages= {
        "za.ac.nwu.logic.flow"
})
public class LogicConfig {
}
