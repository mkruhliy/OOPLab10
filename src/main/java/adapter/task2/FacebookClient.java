package adapter.task2;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class FacebookClient implements Client{
    public FacebookUser facebookUser;
    @Override
    public String getEmail() {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry().toString();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return facebookUser.getGetUserActiveTime();
    }
}
