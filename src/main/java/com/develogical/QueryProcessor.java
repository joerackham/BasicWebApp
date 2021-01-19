package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("king")) {
            return "Stephen King (21 September 1947 - Present) is an " +
                    "American author of horror, supernatural fiction, suspense, crime, science-fiction, and fantasy novels.";
        }
        return "";
    }
}
