package task2;

import java.util.HashMap;

public class WebsiteTracker {
    private HashMap<String, Integer> visitCounts;

    public WebsiteTracker(){
        visitCounts = new HashMap<>();
    }

    public void addVisit(String ipAddress){
        if (visitCounts.containsKey(ipAddress)){
            visitCounts.put(ipAddress, visitCounts.get(ipAddress) +1);
        }
        else {
            visitCounts.put(ipAddress,1);
        }
    }

    public int getVisitCount(String ipAddress){
        return visitCounts.getOrDefault(ipAddress,0);
    }

    public void printVisitCounts(){
        System.out.println("IP - адреса и количество посещений: ");
        for (String ip : visitCounts.keySet()){
            System.out.println("IP: " + ip + " - Посещений: " + visitCounts.get(ip));
        }
    }
}
