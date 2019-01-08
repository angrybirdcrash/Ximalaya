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
public class AnchorInfo {

	private long anchorId;
	private String anchorCover;
	private boolean showFollowBtn;
	private String anchorName;
	private int anchorGrade;
	private int anchorGradeType;
	private int anchorAlbumsCount;
	private int anchorTracksCount;
	private int anchorFollowsCount;
	private long anchorFansCount;
	private String personalIntroduction;
	private boolean showAnchorAlbumModel;
	private List<AnchorAlbumList> anchorAlbumList;
	private boolean hasMoreBtn;

	public void setAnchorId(long anchorId) {
		this.anchorId = anchorId;
	}

	public long getAnchorId() {
		return anchorId;
	}

	public void setAnchorCover(String anchorCover) {
		this.anchorCover = anchorCover;
	}

	public String getAnchorCover() {
		return anchorCover;
	}

	public void setShowFollowBtn(boolean showFollowBtn) {
		this.showFollowBtn = showFollowBtn;
	}

	public boolean getShowFollowBtn() {
		return showFollowBtn;
	}

	public void setAnchorName(String anchorName) {
		this.anchorName = anchorName;
	}

	public String getAnchorName() {
		return anchorName;
	}

	public void setAnchorGrade(int anchorGrade) {
		this.anchorGrade = anchorGrade;
	}

	public int getAnchorGrade() {
		return anchorGrade;
	}

	public void setAnchorGradeType(int anchorGradeType) {
		this.anchorGradeType = anchorGradeType;
	}

	public int getAnchorGradeType() {
		return anchorGradeType;
	}

	public void setAnchorAlbumsCount(int anchorAlbumsCount) {
		this.anchorAlbumsCount = anchorAlbumsCount;
	}

	public int getAnchorAlbumsCount() {
		return anchorAlbumsCount;
	}

	public void setAnchorTracksCount(int anchorTracksCount) {
		this.anchorTracksCount = anchorTracksCount;
	}

	public int getAnchorTracksCount() {
		return anchorTracksCount;
	}

	public void setAnchorFollowsCount(int anchorFollowsCount) {
		this.anchorFollowsCount = anchorFollowsCount;
	}

	public int getAnchorFollowsCount() {
		return anchorFollowsCount;
	}

	public void setAnchorFansCount(long anchorFansCount) {
		this.anchorFansCount = anchorFansCount;
	}

	public long getAnchorFansCount() {
		return anchorFansCount;
	}

	public void setPersonalIntroduction(String personalIntroduction) {
		this.personalIntroduction = personalIntroduction;
	}

	public String getPersonalIntroduction() {
		return personalIntroduction;
	}

	public void setShowAnchorAlbumModel(boolean showAnchorAlbumModel) {
		this.showAnchorAlbumModel = showAnchorAlbumModel;
	}

	public boolean getShowAnchorAlbumModel() {
		return showAnchorAlbumModel;
	}

	public void setAnchorAlbumList(List<AnchorAlbumList> anchorAlbumList) {
		this.anchorAlbumList = anchorAlbumList;
	}

	public List<AnchorAlbumList> getAnchorAlbumList() {
		return anchorAlbumList;
	}

	public void setHasMoreBtn(boolean hasMoreBtn) {
		this.hasMoreBtn = hasMoreBtn;
	}

	public boolean getHasMoreBtn() {
		return hasMoreBtn;
	}

}