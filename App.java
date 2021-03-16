package org.example;

import org.sonar.wsclient.SonarClient;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SonarClient sonarClient = SonarClient.create("http://localhost:9000/api/metrics");
        String sonarEndpoint = "search";
        Map<String,Object> sonarEndParams = new HashMap<>();
        sonarEndParams.put("key","Common-java");
        String sonarResponse = sonarClient.get(sonarEndpoint);
        System.out.println(sonarResponse.getClass().getSimpleName());
        System.out.println(sonarResponse);

    }

}
