public class City {
    private String cityName = new String();
    private String region = new String();
    private String coutry = new String();
    private String index = new String();
    private String kodTel = new String();
    private int coutPeople;

    public void setData(String cityName, String region, String coutry, String index,String kodTel, int coutPeople)
    {
        this.cityName = cityName;
        this.region = region;
        this.coutry = coutry;
        this.index = index;
        this.kodTel = kodTel;
        this.coutPeople = coutPeople;
    }
}
