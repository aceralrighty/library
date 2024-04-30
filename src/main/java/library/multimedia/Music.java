package library.multimedia;

import library.Collection;

import java.util.Arrays;

/**
 * this class inherits from MultiMedia and extends what was in MultiMedia and adds new things to it when needed
 * @author Adam Ziv
 */

public class Music extends Multimedia {
    private MusicGenre musicGenre;
    private String artistLastName;
    private String artistFirstName;
    private String[] trackList;
    private String groupName;

//    Parameterized constructor
   public Music(String callNumber, boolean onHold, Collection collection, boolean checkedOut, String title, int lengthInMinutes, MusicGenre musicGenre, String artistLastName, String artistFirstName, String[] trackList, String groupName) {
        super(callNumber, onHold, collection, checkedOut, title, lengthInMinutes);
        setArtistFirstName(artistFirstName);
        setArtistLastName(artistLastName);
        setMusicGenre(musicGenre);
        setTrackList(trackList);
        setGroupName(groupName);
    }
//    nice toString
    @Override
    public String toString() {
       String musicString = super.toString();
       musicString += STR."""

First Name: \{getArtistFirstName()}
Last Name: \{getArtistLastName()}
Genre: \{getMusicGenre()}
Tracklist: \{Arrays.toString(getTrackList())}
Group name: \{getGroupName()}""";
       return musicString;
    }

    /**
     * all my getters and setters
     * @return
     */

    public MusicGenre getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(MusicGenre musicGenre) {
        this.musicGenre = musicGenre;
    }

    public String getArtistLastName() {
        return artistLastName;
    }

    public void setArtistLastName(String artistLastName) {
        this.artistLastName = artistLastName;
    }

    public String getArtistFirstName() {
        return artistFirstName;
    }

    public void setArtistFirstName(String artistFirstName) {
        this.artistFirstName = artistFirstName;
    }

    public String[] getTrackList() {
        return trackList;
    }

    public void setTrackList(String[] trackList) {
        this.trackList = trackList;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
