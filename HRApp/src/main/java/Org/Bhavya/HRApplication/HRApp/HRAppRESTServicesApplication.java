package Org.Bhavya.HRApplication.HRApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

@SpringBootApplication
public class HRAppRESTServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HRAppRESTServicesApplication.class, args);
	}
	
}