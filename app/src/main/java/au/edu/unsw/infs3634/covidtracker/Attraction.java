package au.edu.unsw.infs3634.covidtracker;

import java.util.ArrayList;

public class Attraction {

    public Attraction(String attraction, String attractionCode, String location, String rating, String type,  String information) {
        this.type = type;
        this.attraction = attraction;
        this.attractionCode = attractionCode;
        this.location = location;
        this.rating = rating;
        this.information = information;

    }

    private String type;
    private String attraction;
    private String attractionCode;
    private String location;
    private String rating;
    private String information;

    public String getAttraction() { return attraction; }

    public void setAttraction(String attraction) { this.attraction = attraction; }

    public String getAttractionCode() { return attractionCode; }

    public void setAttractionCode(String attractionCode) { this.attractionCode = attractionCode; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location;}

    public String getRating() { return rating; }

    public void setRating(String rating) { this.rating = rating; }

    public String getType() { return type; }

    public void setType(String type)  { this.type = type; }

    public String getInformation() { return information; }

    public void setInformation(String information) { this.information = information; }


    public static ArrayList<Attraction> getAttractions() {
        ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction("Bondi Beach","BB",  "North Bondi", "9/10", "Outdoor/ Beach", "The sweeping white-sand crescent of Bondi is one of Australia’s most iconic beaches. Reliable waves draw surfers while, nearby, hardy locals swim in the Icebergs ocean pool year-round. "));
        attractions.add(new Attraction("Sydney Opera House","SO", "CBD", "9/10", "Outdoor/ Indoor", "The Sydney Opera House is a multi-venue performing arts centre at Sydney Harbour located in Sydney, New South Wales, Australia. It is one of the 20th century's most famous and distinctive buildings. "));
        attractions.add(new Attraction("Sydney Harbour Bridge","SH", "CBD","8/10","Outdoor/ Sightseeing", "The Sydney Harbour Bridge is an Australian heritage-listed steel through arch bridge across Sydney Harbour that carries rail, vehicular, bicycle, and pedestrian traffic between the Sydney central business district and the North Shore."));
        attractions.add(new Attraction("Port Jackson Bay","PJ", "CBD","8/10","Outdoor/ Beach", "Port Jackson, consisting of the waters of Sydney Harbour, Middle Harbour, North Harbour and the Lane Cove and Parramatta Rivers, is the ria or natural harbour of Sydney, New South Wales, Australia."));
        attractions.add(new Attraction("Darling Harbour","DH", "CBD","10/10","Outdoor/ Sightseeing", "Darling Harbour is a harbour adjacent to the city centre of Sydney, New South Wales, Australia that is made up of a large recreational and pedestrian precinct that is situated on western outskirts of the Sydney central business district. "));
        attractions.add(new Attraction("Royal Botanic Garden","RB", "CBD","9/10","Outdoor/ Nature","The Royal Botanic Garden, Sydney is a heritage-listed major 30-hectare botanical garden, event venue and public recreation area located at Farm Cove on the eastern fringe of the Sydney central business district, in the City of Sydney local government area of New South Wales, Australia."));
        attractions.add(new Attraction("Taronga Zoo Sydney","TZ", "Mosman","8/10","Outdoor/ Animals","Taronga Zoo Sydney is Australia's largest zoo, located in Sydney, New South Wales, Australia in the suburb of Mosman, on the shores of Sydney Harbour. It was officially opened on 7 October 1916."));
        attractions.add(new Attraction("Sydney Tower Eye","ST","CBD","9/10","Indoor/ Sightseeing", "Sydney Tower is Sydney's tallest structure and the second tallest observation tower in the Southern Hemisphere."));
        attractions.add(new Attraction("White Rabbit Museum","WR", "Central","10/10","Indoor, Arts","Sizable art gallery featuring contemporary Chinese works, plus a street-level tea house with snacks."));
        attractions.add(new Attraction("SEA LIFE Sydney Aquarium","SL", "CBD","8/10","Indoor/ Animals","SEA LIFE Sydney Aquarium is a public aquarium that features a large variety of Australian aquatic life, displaying more than 700 species comprising more than 13,000 individual fish and other sea and water creatures from most of Australia's water habitats."));
        return attractions;
    }

}