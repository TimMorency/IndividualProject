package entity;

/**
 * Created by Student on 2/24/2016.
 */
public class leagueGroupUser {


    private String userId;
    private String userName;
    private String summonerName;
    private String email;
    private String password;

    public leagueGroupUser() {

    }

    public leagueGroupUser(String userId, String userName, String summonerName, String email, String password) {
        this.userId = userId;
        this.userName = userName;
        this.summonerName = summonerName;
        this.email = email;
        this.password = password;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {

        return "User{" +
                "Userid=" + userId +
                ", userName='" + userName + '\'' +
                ", summonerName='" + summonerName + '\'' +
                ", email='" + email + '\'' +
                ", password=' " + password + '\'' +
                '}';
    }

}
