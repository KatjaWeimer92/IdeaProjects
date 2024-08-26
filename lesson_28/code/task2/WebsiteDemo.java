package task2;

public class WebsiteDemo {
    public static void main(String[] args) {
        WebsiteTracker tracker = new WebsiteTracker();

        tracker.addVisit("234.678.987.1");
        tracker.addVisit("234.668.987.1");
        tracker.addVisit("234.678.987.5");
        tracker.addVisit("234.678.987.7");
        tracker.addVisit("234.678.987.9");

        tracker.printVisitCounts();

        tracker.addVisit("234.678.987.5");
        tracker.addVisit("234.678.987.7");

        tracker.printVisitCounts();


    }
}
