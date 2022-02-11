package airlineEmployee;

public class CabinCrewMember {

    private int name;
    private RankType rankType;

    public CabinCrewMember(int name, RankType rankType) {
        this.name = name;
        this.rankType = rankType;
    }

    public int getName() {
        return this.name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public RankType getRankType() {
        return this.rankType;
    }

    public void setRankType(RankType rankType) {
        this.rankType = rankType;
    }
}
}
