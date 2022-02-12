package airlineEmployee;

public class CabinCrewMember {

    private String name;
    private RankType rankType;

    public CabinCrewMember(String name, RankType rankType) {
        this.name = name;
        this.rankType = rankType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RankType getRankType() {
        return this.rankType;
    }

    public void setRankType(RankType rankType) {
        this.rankType = rankType;
    }

    public String relayMessage(String event) {
        if (event == "Start of flight") {
            return "Sit back, relax and enjoy the flight";
        } else if (event == "Turbulence") {
            return "Please fasten seatbelts";
        }
        return null;
    }
}

