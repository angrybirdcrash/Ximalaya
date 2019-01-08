/**
  * Copyright 2018 bejson.com 
  */
package bean.albuminfo;

import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2018-12-04 23:53:32
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class MainInfo {

	private int albumStatus;
	private boolean showApplyFinishBtn;
	private boolean showEditBtn;
	private boolean showTrackManagerBtn;
	private boolean showInformBtn;
	private String cover;
	private String albumTitle;
	private Crumbs crumbs;
	private Date updateDate;
	private long playCount;
	private boolean isPaid;
	private int isFinished;
	private List<Metas> metas;
	private boolean isSubscribe;
	private String richIntro;
	private String detailRichIntro;
	private boolean isPublic;
	private boolean hasBuy;
	private int vipType;

	public void setAlbumStatus(int albumStatus) {
		this.albumStatus = albumStatus;
	}

	public int getAlbumStatus() {
		return albumStatus;
	}

	public void setShowApplyFinishBtn(boolean showApplyFinishBtn) {
		this.showApplyFinishBtn = showApplyFinishBtn;
	}

	public boolean getShowApplyFinishBtn() {
		return showApplyFinishBtn;
	}

	public void setShowEditBtn(boolean showEditBtn) {
		this.showEditBtn = showEditBtn;
	}

	public boolean getShowEditBtn() {
		return showEditBtn;
	}

	public void setShowTrackManagerBtn(boolean showTrackManagerBtn) {
		this.showTrackManagerBtn = showTrackManagerBtn;
	}

	public boolean getShowTrackManagerBtn() {
		return showTrackManagerBtn;
	}

	public void setShowInformBtn(boolean showInformBtn) {
		this.showInformBtn = showInformBtn;
	}

	public boolean getShowInformBtn() {
		return showInformBtn;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getCover() {
		return cover;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public void setCrumbs(Crumbs crumbs) {
		this.crumbs = crumbs;
	}

	public Crumbs getCrumbs() {
		return crumbs;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setPlayCount(long playCount) {
		this.playCount = playCount;
	}

	public long getPlayCount() {
		return playCount;
	}

	public void setIsPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	public boolean getIsPaid() {
		return isPaid;
	}

	public void setIsFinished(int isFinished) {
		this.isFinished = isFinished;
	}

	public int getIsFinished() {
		return isFinished;
	}

	public void setMetas(List<Metas> metas) {
		this.metas = metas;
	}

	public List<Metas> getMetas() {
		return metas;
	}

	public void setIsSubscribe(boolean isSubscribe) {
		this.isSubscribe = isSubscribe;
	}

	public boolean getIsSubscribe() {
		return isSubscribe;
	}

	public void setRichIntro(String richIntro) {
		this.richIntro = richIntro;
	}

	public String getRichIntro() {
		return richIntro;
	}

	public void setDetailRichIntro(String detailRichIntro) {
		this.detailRichIntro = detailRichIntro;
	}

	public String getDetailRichIntro() {
		return detailRichIntro;
	}

	public void setIsPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public boolean getIsPublic() {
		return isPublic;
	}

	public void setHasBuy(boolean hasBuy) {
		this.hasBuy = hasBuy;
	}

	public boolean getHasBuy() {
		return hasBuy;
	}

	public void setVipType(int vipType) {
		this.vipType = vipType;
	}

	public int getVipType() {
		return vipType;
	}

}