package com.ws.ng.datalake.explorationboard.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(
        basePackages = {
                "com.ws.ng.datalake.explorationboard.webapi",
                "com.ws.ng.loginfra.web"},
        excludeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Test.*")}
)
public class WsNgDatalakeExplorationboardWebapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WsNgDatalakeExplorationboardWebapiApplication.class, args);
    }

}
