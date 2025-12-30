import java.util.ArrayList;

public class ContentDemo {
    public static void main(String[] args) {

        int currentYear = java.time.Year.now().getValue();

        ArrayList<ContentItem> items = new ArrayList<>();

        items.add(new VideoLecture("How to basic", 2024, 90, "HD"));
        items.add(new VideoLecture("How teach robot make a flip", 2023, 120, "4K"));

        items.add(new PodcastEpisode("Why my chatgpt husband don't understand me", 2022, 45, "Prince Charming"));
        items.add(new PodcastEpisode("I'm trying not to cry", 2025, 30, "Nasrula Shyngys"));

        for (ContentItem item : items) {
            System.out.println(
                    item.toString() +
                            " | licenseCost=" +
                            item.getLicenseCost(currentYear)
            );

            if (item instanceof Downloadable downloadable) {
                downloadable.download();
                System.out.println(
                        "Max downloads/day: " +
                                downloadable.getMaxDownloadsPerDay()
                );
            }

            System.out.println();
        }
    }
}
