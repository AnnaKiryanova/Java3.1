public class BonusMilesService {
    public int calculate(int cost) {
        int bonusVolume = 20;
        int miles = cost / bonusVolume;
        return miles;
    }
}