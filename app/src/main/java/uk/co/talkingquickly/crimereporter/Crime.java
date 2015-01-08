package uk.co.talkingquickly.crimereporter;

import java.util.UUID;

/**
 * Created by ben on 08/01/2015.
 */
public class Crime {
    private UUID mID;
    private String mTitle;

    public Crime() {
        mID = UUID.randomUUID();
    }

    public UUID getID() {
        return mID;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
