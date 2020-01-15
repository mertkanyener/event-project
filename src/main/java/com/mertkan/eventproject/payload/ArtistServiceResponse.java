package com.mertkan.eventproject.payload;

public class ArtistServiceResponse {

    private Long artistId;
    private String responseBody;

    public ArtistServiceResponse(Long artistId, String responseBody) {
        this.artistId = artistId;
        this.responseBody = responseBody;
    }

    public Long getArtistId() {
        return artistId;
    }

    public void setArtistId(Long artistId) {
        this.artistId = artistId;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }
}
