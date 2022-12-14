package adapter.task2;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class TwitterClient implements Client{
    public TwitterUser twitterUser;
    @Override
    public String getEmail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return LocalDate.parse(twitterUser.getLastActiveTime());
    }
}
