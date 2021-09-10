package za.ac.nwu.translator.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import za.ac.nwu.repo.config.RepositoryConfig;

//4 spring config class, basically a component
//   doesn't need an interface
@Import({RepositoryConfig.class})
@Configuration
public class TranslatorConfig {
}
