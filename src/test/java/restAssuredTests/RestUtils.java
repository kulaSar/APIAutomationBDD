package restAssuredTests;

import org.apache.commons.lang.RandomStringUtils;

public class RestUtils {
    public static String getUserName(){
        String userName = RandomStringUtils.randomAlphanumeric(1);
        return ("Kula"+userName);
    }
    public static String getJob(){
        String jobName = RandomStringUtils.randomAlphanumeric(1);
        return ("Manager"+jobName);
    }
}
