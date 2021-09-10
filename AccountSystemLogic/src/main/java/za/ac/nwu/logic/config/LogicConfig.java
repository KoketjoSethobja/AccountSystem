package za.ac.nwu.logic.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.translator.config.TranslatorConfig;

@Import({TranslatorConfig.class})
@Configuration
public class LogicConfig {

}
