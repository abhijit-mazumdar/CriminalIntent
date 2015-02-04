package com.abhijit_mazumdar.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by abhijit_mazumdar on 2/3/15.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;

    public Boolean isSolved() {
        return mSolved;
    }

    public void setSolved(Boolean mSolved) {
        this.mSolved = mSolved;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    private Boolean mSolved;

    public Crime(){
        //Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
