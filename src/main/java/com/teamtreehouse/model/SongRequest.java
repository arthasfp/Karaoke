package com.teamtreehouse.model;


public class SongRequest {
    private String mSingerName;
    private Song mSong;

    public SongRequest(String mSingerName, Song mSong) {
        this.mSingerName = mSingerName;
        this.mSong = mSong;
    }

    public String getmSingerName() {
        return mSingerName;
    }

    public void setmSingerName(String mSingerName) {
        this.mSingerName = mSingerName;
    }

    public Song getmSong() {
        return mSong;
    }

    public void setmSong(Song mSong) {
        this.mSong = mSong;
    }

    @Override
    public String toString() {
        return "SongRequest{" +
                "mSingerName='" + mSingerName + '\'' +
                ", mSong=" + mSong +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SongRequest that = (SongRequest) o;

        if (mSingerName != null ? !mSingerName.equals(that.mSingerName) : that.mSingerName != null) return false;
        return !(mSong != null ? !mSong.equals(that.mSong) : that.mSong != null);

    }

    @Override
    public int hashCode() {
        int result = mSingerName != null ? mSingerName.hashCode() : 0;
        result = 31 * result + (mSong != null ? mSong.hashCode() : 0);
        return result;
    }
}
