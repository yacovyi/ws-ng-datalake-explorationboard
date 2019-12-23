package com.ws.ng.datalake.explorationboard.webapi;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
//import org.neo4j.driver.v1.*;
//import static org.neo4j.driver.v1.Values.parameters;
//
//import java.util.List;
//import static java.util.Arrays.asList;
//import static java.util.Collections.singletonMap;
@SpringBootTest
class WsNgDatalakeExplorationboardWebapiApplicationTests {
    private static final Logger log = LoggerFactory.getLogger(WsNgDatalakeExplorationboardWebapiApplicationTests.class);

    @Test
    void contextLoads() {
    }
    @Test
    public void connectToNeo4j() {
//        Config noSSL = Config.build().withEncryptionLevel(Config.EncryptionLevel.NONE).toConfig();
//
//        //bolt://54.165.174.76:33724
//        Driver driver = GraphDatabase.driver("bolt://54.165.174.76:33724",AuthTokens.basic("neo4j","block-thirteens-attachment"),noSSL); // <password>
//        try (Session session = driver.session()) {
//            String cypherQuery =
//                    "MATCH (n) " +
//                            "RETURN id(n) AS id";
//            StatementResult result = session.run(cypherQuery, parameters());
//            //log.info("summary {}", result.consume());
//            while (result.hasNext()) {
//                log.info("{}", result.next().get("id"));
//            }
//        }

    }

}
