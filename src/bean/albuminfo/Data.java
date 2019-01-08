/**
  * Copyright 2018 bejson.com 
  */
package bean.albuminfo;

import java.util.List;

/**
 * Auto-generated: 2018-12-04 23:53:32
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Data {

	private boolean isSelfAlbum;
	private long currentUid;
	private long albumId;
	private MainInfo mainInfo;
	private AnchorInfo anchorInfo;
	private TracksInfo tracksInfo;
	private List<RecommendInfo> recommendInfo;
	private String subSiteAlbumUrl;

	public void setIsSelfAlbum(boolean isSelfAlbum) {
		this.isSelfAlbum = isSelfAlbum;
	}

	public boolean getIsSelfAlbum() {
		return isSelfAlbum;
	}

	public void setCurrentUid(long currentUid) {
		this.currentUid = currentUid;
	}

	public long getCurrentUid() {
		return currentUid;
	}

	public void setAlbumId(long albumId) {
		this.albumId = albumId;
	}

	public long getAlbumId() {
		return albumId;
	}

	public void setMainInfo(MainInfo mainInfo) {
		this.mainInfo = mainInfo;
	}

	public MainInfo getMainInfo() {
		return mainInfo;
	}

	public void setAnchorInfo(AnchorInfo anchorInfo) {
		this.anchorInfo = anchorInfo;
	}

	public AnchorInfo getAnchorInfo() {
		return anchorInfo;
	}

	public void setTracksInfo(TracksInfo tracksInfo) {
		this.tracksInfo = tracksInfo;
	}

	public TracksInfo getTracksInfo() {
		return tracksInfo;
	}

	public void setRecommendInfo(List<RecommendInfo> recommendInfo) {
		this.recommendInfo = recommendInfo;
	}

	public List<RecommendInfo> getRecommendInfo() {
		return recommendInfo;
	}

	public void setSubSiteAlbumUrl(String subSiteAlbumUrl) {
		this.subSiteAlbumUrl = subSiteAlbumUrl;
	}

	public String getSubSiteAlbumUrl() {
		return subSiteAlbumUrl;
	}

}