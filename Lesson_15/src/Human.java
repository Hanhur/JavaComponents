public class Human {
    private String fio = new String();
    private String date = new String();
    private String tel = new String();
    private String country = new String();
    private String city = new String();
    private String address = new String();

    public void setData(String fio, String date, String tel, String country, String city, String address)
    {
        this.fio = fio;
        this.date = date;
        this.tel = tel;
        this.country = country;
        this.city = city;
        this.address = address;
    }

    public void setDataFio(String fio)
    {
        this.fio = fio;
    }

    public void setDataDate(String date)
    {
        this.date = date;
    }

    public void setDataTel(String tel)
    {
        this.tel = tel;
    }

    public void setDataCountry(String country)
    {
        this.country = country;
    }

    public void setDataCity(String city)
    {
        this.city = city;
    }

    public void setDataAddress(String address)
    {
        this.address = address;
    }
// ======================================================================================================
    public String getFio()
    {
        return fio;
    }

    public String getDate()
    {
        return date;
    }

    public String getTel()
    {
        return tel;
    }

    public String getCountry()
    {
        return country;
    }

    public String getCity()
    {
        return city;
    }

    public String getAddress()
    {
        return address;
    }

    public String getAnketa()
    {
        String anketa = "Анкета программиста\n" + "Фамилия: " + fio + "\nДата рождения: " + date + "\nТелефон: " + tel + "\nСтрана: " + country + "\nГород: " + city + "\nАдрес: " + address;
        return anketa;
    }
}
